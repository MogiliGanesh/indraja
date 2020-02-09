package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.SeleniumEasy;

public class FBLoginTest extends TestBase {
@Test
public void LogInTest() throws IOException {
	SeleniumEasy s=PageFactory.initElements(driver, SeleniumEasy.class);
	s.dropdown();
	System.out.println(driver.getClass());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.toString());
	s.excel();
}

}
