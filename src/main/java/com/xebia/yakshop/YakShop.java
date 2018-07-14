package com.xebia.yakshop;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class YakShop {

	
	public static void main(String[] args) throws Throwable {
		
		File file = new File("/Users/Siddharth/EclipseWorkspace/XebiaYakShop/yaks.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Herd.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Herd herd = (Herd) jaxbUnmarshaller.unmarshal(file);
		System.out.println("In Stock:");
		System.out.println(herd.getMilkYield(13) + " liters of milk");
		System.out.println(herd.getWoolSkinCount(13) + " skins of wool");
		System.out.println("Herd:");
		herd.getYakAge(13);
	}
	
	
}
