package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbHomePage {

	//Using FindBy for locating elements
	@FindBy(xpath="//input[@id='email']") 
	WebElement userName;

	@FindBy(xpath="//input[@id='pass']") 
	WebElement passWord;

	@FindBy(id="u_0_b") 
	WebElement loginButton;
		
	@FindBy(xpath="//li[@id='navItem_100001566069293']/a[@class='_5afe' and 1]/div[@class='linkWrap noCount' and 1]")
	WebElement logInValidation;

	// Defining all the user actions (Methods) that can be performed in the Facebook home page
	// This method to click on Profile Dropdown
	public void clickUserName(){
		userName.click();
	}
	
	public void enterUserName(String userSendKeys){
	
		userName.sendKeys(userSendKeys);
	System.out.println("user name entered");
	}
	// This method to click on Logout link
	public void enterPass(String passSendKeys){
	passWord.sendKeys(passSendKeys);
	}
	
	public void clickLogin() {
		loginButton.submit();
	}
	
	public void logInValidation() {
		String logincheck =logInValidation.getText();
		assertEquals(logincheck, "Ganesh M", "Failed ti logIn");
	}
	
}
