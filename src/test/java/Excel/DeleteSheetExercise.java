package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class DeleteSheetExercise {
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
				System.out.println("Total number of sheets before deleting" +n);
				ArrayList<String> al = new ArrayList<String>();
				
				for (int i=0; i<n; i++)
					System.out.println(wb.getSheetName(i));
				
				System.out.println("__________");
				al.add("Emp4");
				al.add("Emp6");
				System.out.println("Total number of sheets to be deleted" +al.size());
				System.out.println(al);
				
				System.out.println("____________");
				for(i=0;i<n;i++)
					if
				
				 
				
				
				
				
				
				
				
				
				
				
				
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}

}

}

}

}
