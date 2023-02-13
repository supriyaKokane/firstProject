package com.firstproject.QA.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	
	public static String fetchData(int a,int b) throws EncryptedDocumentException, IOException {
		
		FileInputStream data=new FileInputStream("C:/Users/pravin/Desktop/Excel.xlsx");
		Sheet ex=WorkbookFactory.create(data).getSheet("Sheet1");
		String value=ex.getRow(a).getCell(b).getStringCellValue();
		return value;
		
	}

}
