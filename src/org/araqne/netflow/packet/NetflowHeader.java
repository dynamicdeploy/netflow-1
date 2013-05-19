package org.araqne.netflow.packet;

import java.nio.ByteBuffer;

public interface NetflowHeader {

	void parse(ByteBuffer b);
}
