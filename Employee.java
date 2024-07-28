import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Employee {

	public static void main(String[] args) throws IOException {
		File src = new File("Utils\\info4.xlsx");
	    XSSFWorkbook workbook = new  XSSFWorkbook();
	    XSSFSheet sheet = workbook.createSheet("Employee");
		XSSFRow heading = sheet.createRow(0);
		heading.createCell(0).setCellValue("Employee Name");
		heading.createCell(1).setCellValue("Age");
		heading.createCell(2).setCellValue("Email");
		
		XSSFRow data1 = sheet.createRow(1);
		data1.createCell(0).setCellValue("John Doe");
		data1.createCell(1).setCellValue("30");
		data1.createCell(2).setCellValue("John@test.com");
		
		XSSFRow data2 = sheet.createRow(2);
		data2.createCell(0).setCellValue("Jane Doe");
		data2.createCell(1).setCellValue("28");
		data2.createCell(2).setCellValue("John@test.com");
		
		XSSFRow data3 = sheet.createRow(3);
		data3.createCell(0).setCellValue("Bob Smith");
		data3.createCell(1).setCellValue("35");
		data3.createCell(2).setCellValue("jacky@example.com");
		
		XSSFRow data4 = sheet.createRow(4);
		data4.createCell(0).setCellValue("Swapnil");
		data4.createCell(1).setCellValue("37");
		data4.createCell(2).setCellValue("swapnil@example.com");
		
		FileOutputStream fis=new FileOutputStream(src);
		//Writing to the workbook
		workbook.write(fis);
		fis.close();
		workbook.close();
        }

	}


