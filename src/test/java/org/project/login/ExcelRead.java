package org.project.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[]arg) throws IOException {
		File f= new File("C:\\Users\\Saravana\\.echlips\\New folder\\NewMaven\\src\\test\\resources\\Data\\Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook w=new XSSFWorkbook(fis);
		XSSFSheet s = w.getSheet("Sheet1");
//		XSSFRow r = s.getRow(0);
//		XSSFCell c = r.getCell(0);
//		System.out.println(c);
		
		for(int j=0; j<s.getPhysicalNumberOfRows();j++) {
			XSSFRow r = s.getRow(j);
		for(int i=0; i<r. getPhysicalNumberOfCells(); i++) {
			System.out.println(r.getCell(i));
		}

	}
	
	}
}

