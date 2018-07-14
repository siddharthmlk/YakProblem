package com.xebia.yakshop;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StringToDoubleAdater extends XmlAdapter<String, Double> {

	@Override
	public Double unmarshal(String v) throws Exception {
		return (v == null) ? 0 : new Double(v);
	}

	@Override
	public String marshal(Double v) throws Exception {
		return (v == null) ? null : String.valueOf(v);
	}

}
