package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.FindBy;

public class FileLib {
public String getPropertdata(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(key);
	return value;
	}
public String getExceldata(String SheetName,int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
	}
public void setExcelData(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
}
}
