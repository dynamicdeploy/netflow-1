package org.araqne.netflow.packet.version5;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowHeader;

public class Netflow5Header implements NetflowHeader{

	private short version;
	private short count;
	private int sysUpTime;
	private int epochSeconds;
	private int nanoSeconds;
	private int flowsSeen;
	private byte engineType;
	private byte engineId;
	private short samplingInfo;
	
	public Netflow5Header(){
		
	}
	@Override
	public void parse(ByteBuffer b) {
		version = b.getShort();
		count = b.getShort();
		sysUpTime = b.getInt();
		epochSeconds = b.getInt();
		nanoSeconds = b.getInt();
		flowsSeen = b.getInt();
		engineType = b.get();
		engineId = b.get();
		samplingInfo = b.getShort();
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

	public int getEpochSeconds() {
		return epochSeconds;
	}

	public void setEpochSeconds(int epochSeconds) {
		this.epochSeconds = epochSeconds;
	}

	public int getNanoSeconds() {
		return nanoSeconds;
	}

	public void setNanoSeconds(int nanoSeconds) {
		this.nanoSeconds = nanoSeconds;
	}

	public int getFlowsSeen() {
		return flowsSeen;
	}

	public void setFlowsSeen(int flowsSeen) {
		this.flowsSeen = flowsSeen;
	}

	public byte getEngineType() {
		return engineType;
	}

	public void setEngineType(byte engineType) {
		this.engineType = engineType;
	}

	public byte getEngineId() {
		return engineId;
	}

	public void setEngineId(byte engineId) {
		this.engineId = engineId;
	}

	public short getSamplingInfo() {
		return samplingInfo;
	}

	public void setSamplingInfo(short samplingInfo) {
		this.samplingInfo = samplingInfo;
	}

	
}
