/**
 * 
 */
package org.araqne.netflow.packet.version9.packetelements;

/**
 * @author tgnice@nchovy.com
 * 
 */
public class RecordField {

	private short type;
	private short length;

	public short getType() {
		return type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public short getLength() {
		return length;
	}

	public void setLength(short length) {
		this.length = length;
	}

}
