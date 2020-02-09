package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEasy {
	
	@FindBy(id="select-demo")
	WebElement dropdown;
	public void dropdown() {
		List<WebElement>dd=dropdown.findElements(By.tagName("option"));
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("Sunday");
		s.getAllSelectedOptions();
		
	}
	public void excel() throws IOException {
		FileInputStream file=new FileInputStream("./src/main/java/testData/Book5.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet s=wb.getSheet("Sheet1");
		Row r=s.createRow(1);
		Cell c=r.createCell(1);
		c.setCellValue("Ganesh");
		FileOutputStream file1=new FileOutputStream("./src/main/java/testData/Book5.xlsx");
		wb.write(file1);
		System.gc();
			
	}
	public void config() throws IOException {
		FileInputStream file2=new FileInputStream("/src/main/java/config.properties/Config.properties");
	Properties pr=new Properties();
	pr.load(file2);
	}
	
}
