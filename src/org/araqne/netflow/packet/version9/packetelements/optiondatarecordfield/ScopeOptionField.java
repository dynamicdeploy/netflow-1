package org.araqne.netflow.packet.version9.packetelements.optiondatarecordfield;

import java.nio.ByteBuffer;

public abstract class ScopeOptionField {

	protected byte[] value;
	
	public void parse(ByteBuffer b, short length){
		value = new byte[length];
		b.get(value);
	}

	public byte[] getValue() {
		return value;
	}

	public void setValue(byte[] value) {
		this.value = value;
	}
	
}
