package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;

public class ExcelClear {

	public static void main(String[] args) {
			String fileName = "src/main/resources/TestData.xlsx";
			String sheetName = "Emp";

			String extention = fileName.substring(fileName.indexOf("."));

			Workbook wb = null;

			try {
				FileInputStream fis = new FileInputStream(new File(fileName));

				if (extention.equals(".xls"))
					wb = new HSSWorkbook(fis);
				else if (extention.equals(".xlsx"))
					wb = new XSSWorkbook(fis);

				Sheet sh = wb.getSheet(sheetName);

				int rwcnt = sh.getPhysicalNumberOfRows();
				
				if(rwcnt > 0) {
				
					for(int 1= sh.getFirstRowNum(); i<=sh.getLastRowNum(; i++))
						if (sh.getRow(i) != null)
							sh.removeRow(sh.getRow(i));
						else
							System.out.println("Clean Sheet" + );
				}
				
				
				
				
				
				
				fis.close();
				
				FileOutputStream fos = new FileOutputStream(f1);
				wb.write(fos);
				wb.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}

}

}
