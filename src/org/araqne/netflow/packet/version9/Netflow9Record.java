package org.araqne.netflow.packet.version9;

import java.nio.ByteBuffer;

import org.araqne.netflow.packet.NetflowRecord;
import org.araqne.netflow.packet.version9.packetelements.DataFlowSet;
import org.araqne.netflow.packet.version9.packetelements.OptionDataRecord;
import org.araqne.netflow.packet.version9.packetelements.OptionTemplate;
import org.araqne.netflow.packet.version9.packetelements.TemplateFlowSet;

public class Netflow9Record implements NetflowRecord {

	private TemplateFlowSet templateFlow;
	private DataFlowSet dataFlowSet;
	private OptionTemplate optionTemplateFlow;
	private OptionDataRecord optionDataRecord;
	
	public Netflow9Record() {
		templateFlow = new TemplateFlowSet();
		dataFlowSet = new DataFlowSet();
		optionTemplateFlow = new OptionTemplate();
		optionDataRecord = new OptionDataRecord();
	}

	@Override
	public void parse(ByteBuffer b) {
		templateFlow.parse(b);
		dataFlowSet.parse(b , templateFlow.getFields());
		optionTemplateFlow.parse(b);
		optionDataRecord.parse(b , optionTemplateFlow.getScopefields() , optionTemplateFlow.getOptionfields());
	}
}
