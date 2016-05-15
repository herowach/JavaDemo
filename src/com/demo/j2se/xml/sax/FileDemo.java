package com.demo.j2se.xml.sax;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class FileDemo {
	
	public void domToFile(String outputPath) {
		/*Document doc = new Document();
		Element root = new Element("root");
		
		doc.addContent(root);
		Element employee = new Element("employee");
		root.addContent(employee);
		Element id = new Element("id");
		id.setText("1");
		employee.addContent(id);
		
		Element code = new Element("code");
		code.setText("E01");
		employee.addContent(code);
		
		Element name = new Element("name");
		name.setText("Jacky");
		employee.addContent(name);
		
		XMLOutputter output = new XMLOutputter();
		output.setFormat(Format.getPrettyFormat());
		try {
			output.output(doc, new FileWriter(outputPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void fileToDom() {
		
	}
	
	
}
