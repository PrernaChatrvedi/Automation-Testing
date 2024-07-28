import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExecelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		    File src = new File("Utils\\info2.xlsx");
		    XSSFWorkbook workbook = new  XSSFWorkbook();
		    XSSFSheet sheet = workbook.createSheet("Employee");
			XSSFRow heading = sheet.createRow(0);
			heading.createCell(0).setCellValue("Employee Name");
			heading.createCell(1).setCellValue("Age");
			heading.createCell(2).setCellValue("Dept");
			
			XSSFRow data1 = sheet.createRow(1);
			data1.createCell(0).setCellValue("Ram");
			data1.createCell(1).setCellValue("21");
			data1.createCell(2).setCellValue("QA");
			
			XSSFRow data2 = sheet.createRow(2);
			data2.createCell(0).setCellValue("shyam");
			data2.createCell(1).setCellValue("21");
			data2.createCell(2).setCellValue("QA");
			
			FileOutputStream fis=new FileOutputStream(src);
			//Writing to the workbook
			workbook.write(fis);
			fis.close();
			workbook.close();
	        }
	
		}

	
		 
		 



