package excelConcepts;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXL {
	
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	
	public WriteXL(String path) {
		
		this.path=path;
		
		openWorkbook(path); 
		
	}
	
	public void openWorkbook(String path) {
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(new BufferedInputStream(fis));
			sheet = workbook.getSheetAt(0);
			//workbook.getSheetAt(index)
			fis.close();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  boolean setCellDataColNo(String sheetName,int colNo,int rowNum, String data){
		try{
		//fis = new FileInputStream(path); 
		//workbook = new XSSFWorkbook(fis);
		

		if(rowNum<=0)
			return false;
		
		int index = workbook.getSheetIndex(sheetName);
		
		//int colNum=-1;
		if(index==-1)
			return false;
		
		
		sheet = workbook.getSheetAt(index);
		

		row=sheet.getRow(0);
		for(int i=0;i<row.getLastCellNum();i++){ // fixing max column search value to 20 as, have row.getLastCellNum is giving error when we try to write in a newly created sheet
			//System.out.println(row.getCell(i).getStringCellValue().trim());
			//if(row.getCell(i).getStringCellValue().trim().equals(colName))
			//	colNum=i;
		}
		//if(colNum==-1)
		//	return false;

		
		row = sheet.getRow(rowNum-1);
		if (row == null)
			row = sheet.createRow(rowNum-1);
		
		cell = row.getCell(colNo);	
		if (cell == null) {
	        cell = row.createCell(colNo);
//	        cell.setCellStyle()
		}

	    // cell style
	    //CellStyle cs = workbook.createCellStyle();
	    //cs.setWrapText(true);
	    //cell.setCellStyle(cs);
		cell.setCellValue(data);
	    //sheet.autoSizeColumn(colNum); 
	    sheet.setColumnWidth(colNo, 5000);
	    
	
		    try{
		    	BufferedOutputStream brOut = new BufferedOutputStream(new FileOutputStream(path));
		    	workbook.write(brOut);
			    brOut.close();
		    }catch(Exception e){
		    	//Logging.log("GOT PROCESS LOCK EXCEPTION");
		    	Thread.sleep(2000);
		    	BufferedOutputStream brOut = new BufferedOutputStream(new FileOutputStream(path));
		    	workbook.write(brOut);
			    brOut.close();
		    }
	    	

	   
	    
	    
		//workbook.write(fileOut);
		//fileOut.close();	
	    fis.close();
	    
	    openWorkbook(path); 

		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
	

	public static void main(String[] args) {
		
				
		WriteXL wl=new WriteXL("C:\\Users\\Narayana\\Desktop\\Test.xlsx");
		wl.openWorkbook("C:\\Users\\Narayana\\Desktop\\Test.xlsx");
		
		wl.setCellDataColNo("Sheet1", 10, 11, "test3");
		System.out.println("Successful");

	}

}
