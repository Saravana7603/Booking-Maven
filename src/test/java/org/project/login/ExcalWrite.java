package org.project.login;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcalWrite  {
	public static void main (String[]args) throws IOException {
	
		File F=new File("C:\\\\Users\\\\Saravana\\\\.echlips\\\\New folder\\\\NewMaven\\\\src\\\\test\\\\resources\\\\Data\\\\NewData.xlsx");
		
		XSSFWorkbook w= new XSSFWorkbook();
		XSSFSheet s = w.createSheet("Sheet1");
		XSSFRow r = s.createRow(2);
		XSSFCell c = r.createCell(1);
		c.setCellValue("Saravanakumar");
		System.out.println(c);
		FileOutputStream fos=new FileOutputStream(F);
		w.write(fos);
		
	}

	

}
