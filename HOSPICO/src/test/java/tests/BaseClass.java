package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver=null;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "X:\\Selenium1\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
