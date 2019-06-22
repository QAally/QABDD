package info.seleniumcucumber.methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;


public class Framework   {
	/*static String TestDataPath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\username.xlsx";*/
	//D:/Users/aatieah/Desktop/selenium-cucumber-java-master/src/test/resources
	
	static String TestDataPath = "C:/Users/aatieah/Documents/Development/selenium-test/target/test-classes/username.xlsx";
	 
	
	/*System.out.println("Working Directory = " +
              System.getProperty("user.dir"));*/
		//Working Directory = D:\Users\aatieah\Desktop\selenium-cucumber-java-master

public static HashMap<String, HashMap<String, String>> hm1 = new HashMap<>();
static String s3;
public static void ReadTestData() throws IOException {

		FileInputStream file = new FileInputStream(TestDataPath);

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("DataSheet1");
		Row HeaderRow = sheet.getRow(0);
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row currentRow = sheet.getRow(i);
			HashMap<String, String> currentHash = new HashMap<String, String>();
			for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {

				Cell currentCell1 = currentRow.getCell(0);
				switch (currentCell1.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					s3 = currentCell1.getStringCellValue();
					System.out.println(s3);
					break;
				case Cell.CELL_TYPE_NUMERIC:
					s3 = String.valueOf(currentCell1.getNumericCellValue());
					System.out.println(s3);
					break;
				}

				Cell currentCell = currentRow.getCell(j);
				switch (currentCell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
							currentCell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
							String.valueOf(currentCell.getNumericCellValue()));
					break;
				}

			} 
			
			hm1.put(s3, currentHash);
		}

}
}
/*public static WebElement FindElement(String string) {
	// TODO Auto-generated method stub
	return null;
}
}*/