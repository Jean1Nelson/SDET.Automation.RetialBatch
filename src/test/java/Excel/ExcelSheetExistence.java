package Excel;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ExcelSheetExistence {

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

		int n= wb.getNumberOfSheets();
		
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i=0;i<n;i++)
			al.add(wb.getSheetName(i));
		
		if(!al.contains(sheetName))
			System.out.println("Sheet does not exist");
		else
			System.out.println("Sheet Exists");
		
		wb.createSheet("Emp4");
		
		wb.removeAt(1);
		

	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}

