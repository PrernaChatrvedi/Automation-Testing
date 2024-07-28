import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("Utils\\info3.xlsx");
		FileOutputStream fis=new FileOutputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp");
		workbook.write(fis);
		fis.close();
		workbook.close();
	}

}
