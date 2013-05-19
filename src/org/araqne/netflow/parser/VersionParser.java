package org.araqne.netflow.parser;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowPacket;

public interface VersionParser {
	public NetflowPacket parse(ByteBuffer b);
}
