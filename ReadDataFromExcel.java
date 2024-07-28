import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("Utils\\info2.xlsx");
		FileInputStream fig = new FileInputStream(src);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fig);
		XSSFSheet sheet = workbook.getSheet("Employee");
		for (Row row: sheet) {
			for (Cell cell: row) {
				switch(cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue() + "\t");
				    break;
				 default:
				    break;
			}
				
			}
			System.out.println();
		}
		
	}

}
