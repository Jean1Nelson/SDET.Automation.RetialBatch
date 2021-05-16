package Excel;


public class ExcelRead {

	public static void main(String[] args) {

		String fileName = "src/main/resources/TestData.xlsx";
		String sheetName = "Emp";

		String extention = fileName.substring(fileName.indexOf("."));

		Workbook wb = null;

		try {
			fileInputStream fis = new fileInputStream(new File(fileName));

			if (extention.equals(".xls"))
				wb = new HSSWorkbook(fis);
			else if (extention.equals(".xlsx"))
				wb = new XSSWorkbook(fis);

			Sheet sh = wb.getSheet(sheetName);

			int rwcnt = sh.getPhysicalNumberOfRows();
			int colcnt = sh.getRow(0).getLastCellNum();

			System.out.println("No of Rows:" + rwcnt);
			System.out.println("No of Col:" + colcnt);

			for (int i = 0; i < rwcnt; i++) {
				for (int j = 0; j < colcnt; j++) {

					System.out.println("Row:" + i + "  Col:" + j + "  Value-" + sh.getRow(i).getCell(j));

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
