package org.araqne.netflow.parser;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowPacket;
import org.araqne.netflow.packet.version9.Netflow9Header;
import org.araqne.netflow.packet.version9.Netflow9Record;

public class Version9Parser implements VersionParser{

	@Override
	public NetflowPacket parse(ByteBuffer b) {
		Netflow9Header h = new Netflow9Header();
		Netflow9Record r = new Netflow9Record();
		h.parse(b);
		r.parse(b);
		return new NetflowPacket(h, r);
	}
}
