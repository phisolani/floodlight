package net.floodlightcontroller.core.statistics;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ChangeIdleTimeConfig {
	
	public short getXMLIdleTime(){
		try {
			File fXmlFile = new File("Floodlight-Default-Conf.launch");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			//System.out.println("Root element :"
					//+ doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("idleTime");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					return Short.parseShort(eElement.getAttribute("value"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();			
		}		
		return 5;
	}
}
