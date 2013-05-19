package org.araqne.netflow.packet.version9;

import java.util.HashMap;
import java.util.Map;

import org.araqne.netflow.packet.version9.packetelements.Field;
import org.araqne.netflow.packet.version9.packetelements.fields.*;

public class FieldTypeMapper {

	private Map<FieldTypes, Field> field;

	public FieldTypeMapper() {
		field = new HashMap<FieldTypes, Field>();
		
		field.put(FieldTypes.IN_BYTES, new InBytes());
		field.put(FieldTypes.IN_PKTS, new InPKTS());
		field.put(FieldTypes.FLOWS, new Flows());
		field.put(FieldTypes.PROTOCOL, new Protocol());
		field.put(FieldTypes.SRC_TOS, new SrcTOS());
		field.put(FieldTypes.TCP_FLAGS, new TcpFlags());
		field.put(FieldTypes.L4_SRC_PORT, new L4SrcPort());
		field.put(FieldTypes.IPV4_SRC_ADDR, new Ipv4SrcAddr());
		field.put(FieldTypes.SRC_MASK, new SrcMask());
		field.put(FieldTypes.INPUT_SNMP, new InputSnmp());
		field.put(FieldTypes.L4_DST_PORT, new L4DstPort());
		field.put(FieldTypes.IPV4_DST_ADDR, new Ipv4DstAddr());
		field.put(FieldTypes.DST_MASK, new DstMask());
		field.put(FieldTypes.OUTPUT_SNMP, new OutputSnmp());
		field.put(FieldTypes.IPV4_NEXT_HOP, new Ipv4NextHop());
		field.put(FieldTypes.SRC_AS, new SrcAs());
		field.put(FieldTypes.DST_AS, new DstAs());
		field.put(FieldTypes.BGP_IPV4_NEXT_HOP, new BgpIpv4NextHop());
		field.put(FieldTypes.MUL_DST_PKTS, new MuldstPkts());
		field.put(FieldTypes.MUL_DST_BYTES, new MulDstBytes());
		field.put(FieldTypes.LAST_SWITCHED, new LastSwitched());
		field.put(FieldTypes.FIRST_SWITCHED, new FirstSwitched());
		field.put(FieldTypes.OUT_BYTES, new OutBytes());
		field.put(FieldTypes.OUT_PKTS, new OutPkts());
		field.put(FieldTypes.MIN_PKT_LNGTH, new MinPktLngth());
		field.put(FieldTypes.MAX_PKT_LNGTH, new MaxPktLngth());
		field.put(FieldTypes.IPV6_SRC_ADDR, new Ipv6SrcAddr());
		field.put(FieldTypes.IPV6_DST_ADDR, new Ipv6DstAddr());
		field.put(FieldTypes.IPV6_SRC_MASK, new Ipv6SrcMask());
		field.put(FieldTypes.IPV6_DST_MASK, new Ipv6DstMask());
		field.put(FieldTypes.IPV6_FLOW_LABEL, new Ipv6FlowLabel());
		field.put(FieldTypes.ICMP_TYPE, new IcmpType());
		field.put(FieldTypes.MUL_IGMP_TYPE, new MulIgmpType());
		field.put(FieldTypes.SAMPLING_INTERVAL, new SamplingInterval());
		field.put(FieldTypes.SAMPLING_ALGORITHM, new SamplingAlgorithm());
		field.put(FieldTypes.FLOW_ACTIVE_TIMEOUT, new FlowActiveTimeout());
		field.put(FieldTypes.FLOW_INACTIVE_TIMEOUT, new FlowInactiveImeout());
		field.put(FieldTypes.ENGINE_TYPE, new EngineType());
		field.put(FieldTypes.ENGINE_ID, new EngineId());
		field.put(FieldTypes.TOTAL_BYTES_EXP, new TotalBytesExp());
		field.put(FieldTypes.TOTAL_PKTS_EXP, new TotalPktsExp());
		field.put(FieldTypes.TOTAL_FLOWS_EXP, new TotalFlowsExp());
		field.put(FieldTypes.IPV4_SRC_PREFIX, new Ipv4SrcPrefix());
		field.put(FieldTypes.IPV4_DST_PREFIX, new ipv4DstPrefix());
		field.put(FieldTypes.MPLS_TOP_LABEL_TYPE, new MplsTopLabelType());
		field.put(FieldTypes.MPLS_TOP_LABEL_IP_ADDR, new MplsTopLabelIpAddr());
		field.put(FieldTypes.FLOW_SAMPLER_ID, new FlowSamplerId());
		field.put(FieldTypes.FLOW_SAMPLER_MODE, new FlowSamplerMode());
		field.put(FieldTypes.FLOW_SAMPLER_RANDOM_INTERVAL,
				new FlowSamplerRandomInterval());
		field.put(FieldTypes.MIN_TTL, new MinTTL());
		field.put(FieldTypes.MAX_TTL, new MaxTTL());
		field.put(FieldTypes.IPV4_IDENT, new Ipv4Ident());
		field.put(FieldTypes.DST_TOS, new DstTOS());
		field.put(FieldTypes.IN_SRC_MAC, new InSrcMAC());
		field.put(FieldTypes.OUT_DST_MAC, new OutDstMAC());
		field.put(FieldTypes.SRC_VLAN, new SrcVLAN());
		field.put(FieldTypes.DST_VLAN, new DstVLAN());
		field.put(FieldTypes.IP_PROTOCOL_VERSION, new IpProtocolVersion());
		field.put(FieldTypes.DIRECTION, new Direction());
		field.put(FieldTypes.IPV6_NEXT_HOP, new Ipv6NextHop());
		field.put(FieldTypes.BPG_IPV6_NEXT_HOP, new BGPIpv6NextHop());
		field.put(FieldTypes.IPV6_OPTION_HEADERS, new Ipv6OptionHeaders());
		field.put(FieldTypes.MPLS_LABEL_1, new MplsLabel1());
		field.put(FieldTypes.MPLS_LABEL_2, new MplsLabel2());
		field.put(FieldTypes.MPLS_LABEL_3, new MplsLabel3());
		field.put(FieldTypes.MPLS_LABEL_4, new MplsLabel4());
		field.put(FieldTypes.MPLS_LABEL_5, new MplsLabel5());
		field.put(FieldTypes.MPLS_LABEL_6, new MplsLabel6());
		field.put(FieldTypes.MPLS_LABEL_7, new MplsLabel7());
		field.put(FieldTypes.MPLS_LABEL_8, new MplsLabel8());
		field.put(FieldTypes.MPLS_LABEL_9, new MplsLabel9());
		field.put(FieldTypes.MPLS_LABEL_10, new MplsLabel10());
		field.put(FieldTypes.IN_DST_MAC, new InDstMAC());
		field.put(FieldTypes.OUT_SRC_MAC, new OutSrcMAC());
		field.put(FieldTypes.IF_NAME, new IfName());
		field.put(FieldTypes.IF_DESC, new IfDesc());
		field.put(FieldTypes.SAMPLER_NAME, new SamplerName());
		field.put(FieldTypes.IN_PERMANENT_BYTES, new InPermanentBytes());
		field.put(FieldTypes.IN_PERMANENT_PKTS, new InPermanentPkts());
		field.put(FieldTypes.FRAGMENT_OFFSET, new FragmentOffset());
		field.put(FieldTypes.FORWARDING_STATUS, new ForwardingStatus());
		field.put(FieldTypes.MPLS_PAL_RD, new MplsPalRd());
		field.put(FieldTypes.MPLS_PREFIX_LEN, new MplsPrefixLen());
		field.put(FieldTypes.SRC_TRAFFIC_INDEX, new SrcTrafficIndex());
		field.put(FieldTypes.DST_TRAFFIC_INDEX, new DstTrafficIndex());
		field.put(FieldTypes.APPLICATION_DESCRIPTION,
				new ApplicationDescription());
		field.put(FieldTypes.APPLICATION_TAG, new ApplicationTag());
		field.put(FieldTypes.APPLICATION_NAME, new ApplicationName());
		field.put(FieldTypes.postipDiffServCodePoint,
				new PostDiffservCodePoint());
		field.put(FieldTypes.replication_factor, new ReplicationFactor());
		field.put(FieldTypes.DEPRECATED, new FieldDeprecated());
		field.put(FieldTypes.layer2packetSectionOffset,
				new Layer2PacketSectionOffset());
		field.put(FieldTypes.layer2packetSectionSize,
				new Layer2PacketSectionSize());
		field.put(FieldTypes.layer2packetSectionData,
				new Layer2PacketSectionData());
	}

	public Field getField(FieldTypes types) {
		return field.get(types);
	}
}
