package org.araqne.netflow.packet.version5;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowRecord;

public class Netflow5Record implements NetflowRecord {

	private int sourceIpAddr;
	private int destinationIpAdder;
	private int nextHopRouterIpAddr;
	private short inboudnSnmpIfIndex;
	private short ourtvoundNsmpIfIndex;
	private int packetCount;
	private int byteCount;
	private int timeAtStartofFlow;
	private int timeAtEndofFlow;
	private short sourcePort;
	private short destinationPort;
	private byte onePadByte;
	private byte tcpFlags;
	private byte layer4Protocol;
	private byte ipToS;
	private short sourceAutonomousSysId;
	private short destAutonomousSysId;
	private byte sourceMaskBitsCount;
	private byte destinationMaskBitsCount;
	private short twoPadBytes;

	public Netflow5Record(){
		
	}
	
	@Override
	public void parse(ByteBuffer b) {
		sourceIpAddr = b.getInt();
		destinationIpAdder = b.getInt();
		nextHopRouterIpAddr = b.getInt();
		inboudnSnmpIfIndex = b.getShort();
		ourtvoundNsmpIfIndex = b.getShort();
		packetCount = b.getInt();
		byteCount = b.getInt();
		timeAtStartofFlow = b.getInt();
		timeAtEndofFlow = b.getInt();
		sourcePort = b.getShort();
		destinationPort = b.getShort();
		onePadByte = b.get();
		tcpFlags = b.get();
		layer4Protocol = b.get();
		ipToS = b.get();
		sourceAutonomousSysId = b.getShort();
		destAutonomousSysId = b.getShort();
		sourceMaskBitsCount = b.get();
		destinationMaskBitsCount = b.get();
		twoPadBytes = b.getShort();
	}

	public int getSourceIpAddr() {
		return sourceIpAddr;
	}

	public void setSourceIpAddr(int sourceIpAddr) {
		this.sourceIpAddr = sourceIpAddr;
	}

	public int getDestinationIpAdder() {
		return destinationIpAdder;
	}

	public void setDestinationIpAdder(int destinationIpAdder) {
		this.destinationIpAdder = destinationIpAdder;
	}

	public int getNextHopRouterIpAddr() {
		return nextHopRouterIpAddr;
	}

	public void setNextHopRouterIpAddr(int nextHopRouterIpAddr) {
		this.nextHopRouterIpAddr = nextHopRouterIpAddr;
	}

	public short getInboudnSnmpIfIndex() {
		return inboudnSnmpIfIndex;
	}

	public void setInboudnSnmpIfIndex(short inboudnSnmpIfIndex) {
		this.inboudnSnmpIfIndex = inboudnSnmpIfIndex;
	}

	public short getOurtvoundNsmpIfIndex() {
		return ourtvoundNsmpIfIndex;
	}

	public void setOurtvoundNsmpIfIndex(short ourtvoundNsmpIfIndex) {
		this.ourtvoundNsmpIfIndex = ourtvoundNsmpIfIndex;
	}

	public int getPacketCount() {
		return packetCount;
	}

	public void setPacketCount(int packetCount) {
		this.packetCount = packetCount;
	}

	public int getByteCount() {
		return byteCount;
	}

	public void setByteCount(int byteCount) {
		this.byteCount = byteCount;
	}

	public int getTimeAtStartofFlow() {
		return timeAtStartofFlow;
	}

	public void setTimeAtStartofFlow(int timeAtStartofFlow) {
		this.timeAtStartofFlow = timeAtStartofFlow;
	}

	public int getTimeAtEndofFlow() {
		return timeAtEndofFlow;
	}

	public void setTimeAtEndofFlow(int timeAtEndofFlow) {
		this.timeAtEndofFlow = timeAtEndofFlow;
	}

	public short getSourcePort() {
		return sourcePort;
	}

	public void setSourcePort(short sourcePort) {
		this.sourcePort = sourcePort;
	}

	public short getDestinationPort() {
		return destinationPort;
	}

	public void setDestinationPort(short destinationPort) {
		this.destinationPort = destinationPort;
	}

	public byte getOnePadByte() {
		return onePadByte;
	}

	public void setOnePadByte(byte onePadByte) {
		this.onePadByte = onePadByte;
	}

	public byte getTcpFlags() {
		return tcpFlags;
	}

	public void setTcpFlags(byte tcpFlags) {
		this.tcpFlags = tcpFlags;
	}

	public byte getLayer4Protocol() {
		return layer4Protocol;
	}

	public void setLayer4Protocol(byte layer4Protocol) {
		this.layer4Protocol = layer4Protocol;
	}

	public byte getIpToS() {
		return ipToS;
	}

	public void setIpToS(byte ipToS) {
		this.ipToS = ipToS;
	}

	public short getSourceAutonomousSysId() {
		return sourceAutonomousSysId;
	}

	public void setSourceAutonomousSysId(short sourceAutonomousSysId) {
		this.sourceAutonomousSysId = sourceAutonomousSysId;
	}

	public short getDestAutonomousSysId() {
		return destAutonomousSysId;
	}

	public void setDestAutonomousSysId(short destAutonomousSysId) {
		this.destAutonomousSysId = destAutonomousSysId;
	}

	public byte getSourceMaskBitsCount() {
		return sourceMaskBitsCount;
	}

	public void setSourceMaskBitsCount(byte sourceMaskBitsCount) {
		this.sourceMaskBitsCount = sourceMaskBitsCount;
	}

	public byte getDestinationMaskBitsCount() {
		return destinationMaskBitsCount;
	}

	public void setDestinationMaskBitsCount(byte destinationMaskBitsCount) {
		this.destinationMaskBitsCount = destinationMaskBitsCount;
	}

	public short getTwoPadBytes() {
		return twoPadBytes;
	}

	public void setTwoPadBytes(short twoPadBytes) {
		this.twoPadBytes = twoPadBytes;
	}

}
