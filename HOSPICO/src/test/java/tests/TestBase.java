package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

public class TestBase {

	public static WebDriver driver = null;
	Logger log=Logger.getLogger(TestBase.class);
	
	
	@BeforeTest
	public void initialize() throws IOException{
		
	System.setProperty("webdriver.gecko.driver", "X:\\Selenium1\\Eclipse\\geckodriver.exe");
	driver = new FirefoxDriver();
	//To maximize browser
	driver.manage().window().maximize();
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//To open facebook
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	}
	/*@AfterTest
	//Test cleanup
	public void TeardownTest()
	{
	TestBase.driver.quit();
	} */
}
