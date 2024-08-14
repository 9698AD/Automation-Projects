package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1: create FileInputStreamObject
		FileInputStream fis=new FileInputStream("./Test Data/ExcelTestData.xlsx");
		
		//Step2:
		Workbook workbook = WorkbookFactory.create(fis);
		
		String excelbook = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(excelbook);
		
		double price = workbook.getSheet("Sheet2").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		
		boolean status = workbook.getSheet("Sheet2").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = workbook.getSheet("Sheet2").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
		
		
		
		

	}

}
