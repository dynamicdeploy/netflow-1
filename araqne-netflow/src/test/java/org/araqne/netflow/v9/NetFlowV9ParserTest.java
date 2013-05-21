/*
 * Copyright 2013 Eediom Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.araqne.netflow.v9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class NetFlowV9ParserTest {
	@Test
	public void testParse() {
		String s1 = "000900030000a4e4519b2795000000000000006a0000009c010100120001000400020004000400010005000100060001000700020008000400090001000a0002000b0002000c0004000d0001000e0002000f00040010000400110004001500040016000401020012000100040002000400040001000500010006000100070002000a0002000b0002000e000200100004001100040015000400160004001b0010001c0010001d0001001e0001003e00100001001801030004000800010004002a000400290004000001030010000000000000000100000000";
		String s2 = "000900010000a4e4519b2795000000010000006a0101003800000b02000000081100000c00c0a87c01000000076ceffffffa00000000000000000000000000000000002e9700002e950d0001";
		String s3 = "0009000100017891519b27cb000000020000006a010100380000015c00000002110000a5ccc0a87c14000000238279a1e7200000000000000000000000000000000000a4e50000a4e4000000";
		byte[] b1 = toBinary(s1);
		byte[] b2 = toBinary(s2);
		byte[] b3 = toBinary(s3);

		NetFlowV9TemplateCache cache = new NetFlowV9TemplateCache();

		// check header
		NetFlowV9Packet p1 = NetFlowV9Parser.parsePacket(b1, cache);
		assertEquals(9, p1.getHeader().getVersion());
		assertEquals(3, p1.getHeader().getCount());
		assertEquals(0, p1.getHeader().getSequence());
		assertEquals(42212, p1.getHeader().getSysUptime());
		assertEquals(1369122709, p1.getHeader().getUnixSecs());
		assertEquals(106, p1.getHeader().getSourceId());

		// check templates
		assertEquals(2, p1.getTemplates().size());
		assertNotNull(p1.getOptionTemplate());

		NetFlowV9Template t1 = p1.getTemplates().get(0);
		assertEquals(257, t1.getTemplateId());
		assertEquals(18, t1.getFieldCount());

		List<NetFlowV9FieldDef> d1 = t1.getDefinitions();
		assertEquals("in_bytes", name(d1.get(0)));
		assertEquals("in_pkts", name(d1.get(1)));
		assertEquals("protocol", name(d1.get(2)));
		assertEquals("src_tos", name(d1.get(3)));
		assertEquals("tcp_flags", name(d1.get(4)));
		assertEquals("l4_src_port", name(d1.get(5)));
		assertEquals("ipv4_src_addr", name(d1.get(6)));
		assertEquals("src_mask", name(d1.get(7)));
		assertEquals("input_snmp", name(d1.get(8)));
		assertEquals("l4_dst_port", name(d1.get(9)));
		assertEquals("ipv4_dst_addr", name(d1.get(10)));
		assertEquals("dst_mask", name(d1.get(11)));
		assertEquals("output_snmp", name(d1.get(12)));
		assertEquals("ipv4_next_hop", name(d1.get(13)));
		assertEquals("src_as", name(d1.get(14)));
		assertEquals("dst_as", name(d1.get(15)));
		assertEquals("last_switched", name(d1.get(16)));
		assertEquals("first_switched", name(d1.get(17)));

		NetFlowV9Template t2 = p1.getTemplates().get(1);
		assertEquals(258, t2.getTemplateId());
		assertEquals(18, t2.getFieldCount());

		NetFlowV9Packet p2 = NetFlowV9Parser.parsePacket(b2, cache);
		NetFlowV9Record r2 = p2.getRecords().get(0);
		Map<String, Object> f2 = r2.getFields();
		assertEquals(2818L, f2.get("in_bytes"));
		assertEquals(8L, f2.get("in_pkts"));
		assertEquals("192.168.124.1", f2.get("ipv4_src_addr"));
		assertEquals("239.255.255.250", f2.get("ipv4_dst_addr"));
		assertEquals(3072, f2.get("l4_src_port"));
		assertEquals(1900, f2.get("l4_dst_port"));
		assertEquals(17, f2.get("protocol"));

		NetFlowV9Packet p3 = NetFlowV9Parser.parsePacket(b3, cache);
		assertEquals(1, p3.getRecords().size());
	}

	private String name(NetFlowV9FieldDef def) {
		return def.getType().name().toLowerCase();
	}

	private byte[] toBinary(String hex) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		for (int i = 0; i < hex.length(); i += 2) {
			String s = hex.substring(i, i + 2);
			bos.write(Integer.parseInt(s, 16));
		}

		return bos.toByteArray();
	}

}
