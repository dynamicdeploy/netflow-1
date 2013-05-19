package org.araqne.netflow.packet.version9.packetelements;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.araqne.netflow.packet.version9.FieldTypeMapper;
import org.araqne.netflow.packet.version9.FieldTypes;

/**
 * @author tgnice@nchovy.com
 *
 */
public class DataFlowSet {

	private short flowSetId;
	private short length;
	private ArrayList<Record> records;
	private short[] padding;
	
	public void parse(ByteBuffer b , ArrayList<RecordField> fieldTypes){
		FieldTypeMapper mapper = new FieldTypeMapper();
		ArrayList<Field> fields;
		int recordSize=0;
		int paddingSize=0;
		
		flowSetId = b.getShort();
		length = b.getShort();
		
		for(int i=0; i<fieldTypes.size();i++){
			recordSize += fieldTypes.get(i).getLength(); 
		}
		
		records = new ArrayList<Record>((length-4)/recordSize);		

		for(int i=0; i< records.size();i++){
			fields = new ArrayList<Field>();
			for(int j=0; j<fieldTypes.size();j++){
				fields.add(mapper.getField(FieldTypes.parse(fieldTypes.get(j).getType())));
				fields.get(j).parse(b , fieldTypes.get(j).getLength());
			}
			records.get(i).setFields(fields);
		}
		
		paddingSize = 4 - (length%4);
		if(paddingSize !=0){
			byte[] pad = new byte[paddingSize];
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

	public short[] getPadding() {
		return padding;
	}

	public void setPadding(short[] padding) {
		this.padding = padding;
	}
	
}
