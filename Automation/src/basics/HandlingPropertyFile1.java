package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingPropertyFile1 {
public static void main(String[] args) throws IOException, AWTException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	System.out.println(p.getProperty("url"));
	p.setProperty("username", "admin1");
	p.
	//p.put("username", "admin1");
	//FileOutputStream fos=new FileOutputStream("./data/commondata.property");
	//System.out.println(p.getProperty("username"));
	
	
	
	
}
}
