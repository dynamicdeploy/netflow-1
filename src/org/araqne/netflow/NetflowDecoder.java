package org.araqne.netflow;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowPacket;
import org.araqne.netflow.parser.VersionParser;

public class NetflowDecoder {

	public static void main(int argc, String argv[]){
		byte[] b = new byte []{};
		// test bytes
		short version;
		NetflowPacket packet = null;
		VersionMapper mapper = new VersionMapper();
		
		ByteBuffer buffer = ByteBuffer.wrap(b);
		version = buffer.getShort();
		buffer.clear();
		VersionParser packetParser = mapper.getParser(version);
		packet = packetParser.parse(buffer);
	}
}
