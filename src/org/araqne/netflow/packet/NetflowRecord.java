package org.araqne.netflow.packet;

import java.nio.ByteBuffer;

public interface NetflowRecord {

	void parse(ByteBuffer b);
}
