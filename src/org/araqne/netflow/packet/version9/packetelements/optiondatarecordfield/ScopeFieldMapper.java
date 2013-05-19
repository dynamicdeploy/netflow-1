package org.araqne.netflow.packet.version9.packetelements.optiondatarecordfield;

public class ScopeFieldMapper {

	public ScopeOptionField getField(short code){
		switch(code){
			case 0x01:
				return new System();
			case 0x02:
				return new Interface();
			case 0x03:
				return new LineCard();
			case 0x04:
				return new NetFlowCache();
			case 0x05:
				return new Template();
			default:
				return null;
		}
	}
}
