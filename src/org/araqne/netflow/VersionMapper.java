package org.araqne.netflow;

import org.araqne.netflow.parser.Version5Parser;
import org.araqne.netflow.parser.Version9Parser;
import org.araqne.netflow.parser.VersionParser;

public class VersionMapper {

	public VersionParser getParser(short version){
		switch(version){
			case 0x05:
				return new Version5Parser();
			case 0x09:
				return new Version9Parser();
			default:
				return null;
		}
		
	}
}
