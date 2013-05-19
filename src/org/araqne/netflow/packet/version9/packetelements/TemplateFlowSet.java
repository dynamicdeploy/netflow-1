package org.araqne.netflow.packet.version9.packetelements;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class TemplateFlowSet {

	private short flowSetId;
	private short length;
	private short templateId;
	private short fieldCount;
	private ArrayList<RecordField> fields;

	public void parse(ByteBuffer b) {
		flowSetId = b.getShort();
		length = b.getShort();
		templateId = b.getShort();
		fieldCount = b.getShort();
		fields = new ArrayList<RecordField>(fieldCount);
		for (int i = 0; i < fieldCount; i++) {
			fields.get(i).setType(b.getShort());
			fields.get(i).setLength(b.getShort());
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

	public short getFieldCount() {
		return fieldCount;
	}

	public void setFieldCount(short fieldCount) {
		this.fieldCount = fieldCount;
	}

	public ArrayList<RecordField> getFields() {
		return fields;
	}

	public void setFields(ArrayList<RecordField> fields) {
		this.fields = fields;
	}

}
