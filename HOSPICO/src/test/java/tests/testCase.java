package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.obj;

public class testCase extends BaseClass {

	@Test
	public void dropdown() {
		obj o=PageFactory.initElements(driver, obj.class);
		o.dropdownmenu();
	}
	
}
