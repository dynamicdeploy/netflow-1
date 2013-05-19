package org.araqne.netflow.packet;


public class NetflowPacket {

	private NetflowHeader header;
	private NetflowRecord record;
	
	public NetflowPacket(NetflowHeader h, NetflowRecord r){
		header = h;
		record = r;
	}

	public NetflowHeader getHeader() {
		return header;
	}

	public void setHeader(NetflowHeader header) {
		this.header = header;
	}

	public NetflowRecord getRecord() {
		return record;
	}

	public void setRecord(NetflowRecord record) {
		this.record = record;
	}
	
}
