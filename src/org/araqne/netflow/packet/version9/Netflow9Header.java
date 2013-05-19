package org.araqne.netflow.packet.version9;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowHeader;

public class Netflow9Header implements NetflowHeader {

	private short version;
	private short count;
	private int sysUpTime;
	private int unixSeconds;
	private int sequenceNumber;
	private int sourceId;

	public Netflow9Header(){
		
	}
	
	@Override
	public void parse(ByteBuffer b) {
		version = b.getShort();
		count = b.getShort();
		sysUpTime = b.getInt();
		unixSeconds = b.getInt();
		sequenceNumber = b.getInt();
		sourceId = b.getInt();
	}

	public short getVersion() {
		return version;
	}

	public void setVersion(short version) {
		this.version = version;
	}

	public short getCount() {
		return count;
	}

	public void setCount(short count) {
		this.count = count;
	}

	public int getSysUpTime() {
		return sysUpTime;
	}

	public void setSysUpTime(int sysUpTime) {
		this.sysUpTime = sysUpTime;
	}

	public int getUnixSeconds() {
		return unixSeconds;
	}

	public void setUnixSeconds(int unixSeconds) {
		this.unixSeconds = unixSeconds;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

}
