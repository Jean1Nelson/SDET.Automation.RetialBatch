package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;

public class ExcelWrite {

	public static void main(String[] args) {
		String f1 = "src/main/resources/TestData.xlsx";
		String sheetName = "Emp";

		String extention = fileName.substring(fileName.indexOf("."));

		Workbook wb = null;

		try {
			FileInputStream fis = new FileInputStream(f1);

			if (extention.equals(".xls"))
				wb = new HSSWorkbook(fis);
			else if (extention.equals(".xlsx"))
				wb = new XSSWorkbook(fis);

			Sheet sh = wb.getSheet(sheetName);

			int rwcnt = sh.getPhysicalNumberOfRows();
			
			sh.createRow(rwcnt).createCell(0).setCellValue("Virat");
			sh.getRow(rwcnt).createCell(1).setCellValue(29);
			
			fis.close();
			
			FileOutputStream fos = new FileOutputStream(f1);
			wb.write(fos);
			wb.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
