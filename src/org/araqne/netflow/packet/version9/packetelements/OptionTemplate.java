/**
 * 
 */
package org.araqne.netflow.packet.version9.packetelements;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * @author tgnice@nchovy.com
 *
 */
public class OptionTemplate {

	private short flowSetId;
	private short length;
	private short templateId;
	private short optionScopeLength;
	private short optionLength;
	private ArrayList<RecordField> scopeFields;
	private ArrayList<RecordField> optionFields;
	
	public OptionTemplate(){
		
	}
	
	public void parse(ByteBuffer b){
		byte[] pad;
		int padLength=0;
		
		flowSetId = b.getShort();
		length = b.getShort();
		templateId = b.getShort();
		optionScopeLength = b.getShort();
		optionLength = b.getShort();
		scopeFields = new ArrayList<RecordField>(optionScopeLength/4);
		optionFields = new ArrayList<RecordField>(optionLength/4);
		
		for(int i=0; i<scopeFields.size(); i++){
			scopeFields.get(i).setType(b.getShort());
			scopeFields.get(i).setLength(b.getShort());
		}
		
		for(int i=0; i<optionFields.size();i++){
			optionFields.get(i).setType(b.getShort());
			optionFields.get(i).setLength(b.getShort());
		}
		
		padLength = 4 - (length%4);
		if(padLength !=0){
			pad = new byte[padLength];
			b.get(pad);
		}
	}

	public short getFlowSetId() {
		return flowSetId;
	}

	public void setFlowSetId(short flowSetId) {
		this.flowSetId = flowSetId;
	}

	public short getLength() {
		return length;
	}

	public void setLength(short length) {
		this.length = length;
	}

	public short getTemplateId() {
		return templateId;
	}

	public void setTemplateId(short templateId) {
		this.templateId = templateId;
	}

	public short getOptionScopeLength() {
		return optionScopeLength;
	}

	public void setOptionScopeLength(short optionScopeLength) {
		this.optionScopeLength = optionScopeLength;
	}

	public short getOptionLength() {
		return optionLength;
	}

	public void setOptionLength(short optionLength) {
		this.optionLength = optionLength;
	}

	public ArrayList<RecordField> getScopefields() {
		return scopeFields;
	}

	public void setScopefields(ArrayList<RecordField> scopefields) {
		this.scopeFields = scopefields;
	}

	public ArrayList<RecordField> getOptionfields() {
		return optionFields;
	}

	public void setOptionfields(ArrayList<RecordField> optionfields) {
		this.optionFields = optionfields;
	}


}
