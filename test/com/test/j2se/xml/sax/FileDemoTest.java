package com.test.j2se.xml.sax;

import java.io.File;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.j2se.xml.sax.FileDemo;

public class FileDemoTest {

	static final String outputPath = "F:\\javaworkspace\\JavaDemo\\resources\\output\\test.xml";
	
	public FileDemo demo;
	
	@Before
	public void setup() {
		demo = new FileDemo();
	}
	
	@Test
	public void testDomToFile() {
		
		//System.out.println(this.getClass().getClassLoader().get);
		
		File file = new File(outputPath);
		if(file.exists()) {
			file.delete();
		}
		
		//demo.domToFile(outputPath);
	}
	
	public void testFileToDom() {
		File file = new File(outputPath);
		if(!file.exists()) {
			demo.domToFile(outputPath);
		}
		
		demo.fileToDom();
	}
	
	
	
	

}
