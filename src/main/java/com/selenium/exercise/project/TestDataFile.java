/*
 *  write a java program to compare two sheet data(just like comparing 2D array data, refer:pgm:CompareTwo2DArrays.java) 
 */
package com.selenium.exercise.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.google.common.net.HostSpecifier;

public class TestDataFile {
	
	TestDataFile() throws IOException{
	String xlpath = "C:/Users/Chanu/workspace/salesForce/testdata.xls";
	String[][] recdata = readtestdataXls(xlpath,"Sheet1");
	for(int i=0;i<recdata.length;i++){
		for(int j=0;j<recdata[0].length; j++){
			System.out.print(recdata[i][j]+ " ");
		}
		System.out.println();
	}
}
	
	public String[][] readtestdataXls(String path, String sheetName) throws IOException {
	
	
	/*Step 1 : Get the XL  Path*/
	File xlFile = new File(path);
	
	/* Step 2 : Access xl File*/
	FileInputStream xldoc = new FileInputStream(xlFile);
	
	/* Step3 : Access workbook*/
	HSSFWorkbook wb = new HSSFWorkbook(xldoc);
	
	//Step 4 : Access the sheet
	HSSFSheet sheet =  wb.getSheet(sheetName);
	
	// get data from single cell
	String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(cellData);
	
	// get active rows and columns of sheet
	int arow = sheet.getLastRowNum() +1; // it gives one less so add +1
	int acolumn = sheet.getRow(arow).getLastCellNum();//their is no direct .getLastcolumn()method
	
	//if you want this data to return then take one String[][] array
	String[][] xldata = new String[arow][acolumn];
	
	//get all the containt in sheet just like 2D array
	for(int i=0;i<arow;i++){
		for(int j=0;j<acolumn; j++){
			xldata[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return xldata;
	}
	

}
