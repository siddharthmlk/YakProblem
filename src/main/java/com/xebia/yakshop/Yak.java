package com.xebia.yakshop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "labyak")
@XmlAccessorType(XmlAccessType.FIELD)
public class Yak {

	@XmlAttribute
	private String name;
	@XmlAttribute
	@XmlJavaTypeAdapter(value = StringToDoubleAdater.class)
	private Double age;
	@XmlAttribute
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	

}
