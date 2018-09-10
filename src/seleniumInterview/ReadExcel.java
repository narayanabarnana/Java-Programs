package seleniumInterview;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

				
		public static XSSFWorkbook wb;
		static XSSFSheet sheet1;
		public static XSSFCell Cell;
		public static Row row;
		
		public static void main(String[] args) throws Exception
		{
			System.out.println("Execution started");
			ReadExcel.setExcelFile("E:\\Sample Excle File.xlsx", "Sheet1");
			String data =ReadExcel.getCellData(2, 2);
			
			
		}
		
		
		public static void setExcelFile(String Path,String SheetName) throws IOException
		{
			FileInputStream fis=new FileInputStream(Path);
			
			//Access the required test data sheet
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheet(SheetName);
			
			
		}
		
		public static String getCellData(int RowNum, int ColNum)
		{
			Cell=sheet1.getRow(RowNum).getCell(ColNum);
			String Celldata=Cell.getStringCellValue();
			System.out.println(Celldata);
			
			return Celldata;
		}
		
		
	}


