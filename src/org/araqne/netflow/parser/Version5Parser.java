package org.araqne.netflow.parser;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowPacket;
import org.araqne.netflow.packet.version5.Netflow5Header;
import org.araqne.netflow.packet.version5.Netflow5Record;

public class Version5Parser implements VersionParser{

	@Override
	public NetflowPacket parse(ByteBuffer b) {
		Netflow5Header h = new Netflow5Header();
		Netflow5Record r = new Netflow5Record();
		h.parse(b);
		r.parse(b);
		return new NetflowPacket(h, r);
	}
}
