package org.araqne.netflow.packet.version9.packetelements;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.araqne.netflow.packet.version9.FieldTypeMapper;
import org.araqne.netflow.packet.version9.FieldTypes;
import org.araqne.netflow.packet.version9.packetelements.optiondatarecordfield.ScopeFieldMapper;
import org.araqne.netflow.packet.version9.packetelements.optiondatarecordfield.ScopeOptionField;

public class OptionDataRecord {

	private short templatedId;
	private short length;
	private ArrayList<ScopeOptionField> scopeFields;
	private ArrayList<Field> optionFields;

	public void parse(ByteBuffer b , ArrayList<RecordField> scopeField, ArrayList<RecordField> optionField){
		templatedId = b.getShort();
		length = b.getShort();
		FieldTypeMapper fieldMapper = new FieldTypeMapper();
		ScopeFieldMapper scopeMapper = new ScopeFieldMapper();
		scopeFields = new ArrayList<ScopeOptionField>();
		optionFields = new ArrayList<Field>();
		for(int i=0; i<scopeField.size(); i++){
			scopeFields.add(scopeMapper.getField(scopeField.get(i).getType()));
			scopeFields.get(i).parse(b, scopeField.get(i).getLength());
		}
		
		for(int i=0; i<optionField.size(); i++){
			optionFields.add(fieldMapper.getField(FieldTypes.parse(optionField.get(i).getType())));
			optionFields.get(i).parse(b , optionField.get(i).getLength());
		}
	}
	
	public short getTemplatedId() {
		return templatedId;
	}

	public void setTemplatedId(short templatedId) {
		this.templatedId = templatedId;
	}

	public short getLength() {
		return length;
	}

	public void setLength(short length) {
		this.length = length;
	}

	public ArrayList<ScopeOptionField> getScopeFields() {
		return scopeFields;
	}

	public void setScopeFields(ArrayList<ScopeOptionField> scopeFields) {
		this.scopeFields = scopeFields;
	}

	public ArrayList<Field> getOptionFields() {
		return optionFields;
	}

	public void setOptionFields(ArrayList<Field> optionFields) {
		this.optionFields = optionFields;
	}

}
