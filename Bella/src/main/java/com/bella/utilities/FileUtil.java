package com.bella.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtil {

	public String getProperty(String filePath, String key) throws FileNotFoundException {

		String baseDir = System.getProperty("user.dir");

		FileInputStream file = new FileInputStream(baseDir + filePath);
		Properties prop = new Properties();
		String value = "";
		try {
			prop.load(file);

			value = prop.getProperty(key);// read the data i.e key from file and store in value
		} catch (IOException e) {

			e.printStackTrace();
		}
		return value;
	}
	
	
	
	
	
	
	
	

//	============Direct used value==========
	
//			public void readFile() throws IOException {
//				String baseDir=System.getProperty("user.dir");
//
//				FileInputStream file =new FileInputStream(baseDir+"/src/main/resources/config.properties");
//				Properties prop=new Properties();
//				prop.load(file);
//				String value="";
//				value=prop.getProperty("appUrl");
//				
//				System.out.println("URL Name is:"+value);
//				
//			}

////=============with String return value==========
//	****every time diff file path******		

//public String readFile() throws IOException {
//	String baseDir=System.getProperty("user.dir");
//
//	FileInputStream file =new FileInputStream(baseDir+"/src/main/resources/config.properties");
//	Properties prop=new Properties();
//	prop.load(file);
//	String value="";
//	return value=prop.getProperty("appUrl");
//	
//	//System.out.println("URL Name is:"+value);

}
//	public static void main(String[] args) throws IOException {
//		FileUtil f=new FileUtil();
//		f.readFile();
//	}

// ==========with return and single parameterisation===========

//	public String getProperty(String key) throws FileNotFoundException {
//
//		String baseDir = System.getProperty("user.dir");
//		FileInputStream file = new FileInputStream(baseDir + "/src/main/resources/config.properties");
//		Properties prop = new Properties();
//		String value = "";
//		try {
//			prop.load(file);
//			value = prop.getProperty(key);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return value;
//	}

// =======excel=========
/*
 * public String[] getRowFromExcel(String filePath, String sheetName, int
 * rowNum) { String[] data; Workbook book = null; try { book = new
 * XSSFWorkbook(filePath); } catch (IOException e) { e.printStackTrace(); }
 * 
 * Sheet sheet = book.getSheet(sheetName); Row row = sheet.getRow(rowNum);
 * 
 * data = new String[row.getLastCellNum()];// create size for array
 * 
 * for (int i = 0; i < row.getLastCellNum(); i++) { Cell cell = row.getCell(i);
 * // data[i]=cell.getStringCellValue(); switch (cell.getCellTypeEnum()) { case
 * STRING: data[i] = cell.getStringCellValue(); break; case NUMERIC: data[i] =
 * String.valueOf(cell.getNumericCellValue()); default: break; }
 * 
 * } return data; }
 */
