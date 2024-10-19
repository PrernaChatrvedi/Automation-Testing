package Task24ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoblazeLoginPage {
	WebDriver driver;
    public DemoblazeLoginPage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
// object on webpage which is going to interact 
    	@FindBy(id = "loginusername")
    	WebElement username;
    	@FindBy(id = "loginpassword")
    	WebElement password;
    	@FindBy(xpath = "//button[@onclick='logIn()']")
    	WebElement button;

	public void EnterData(String uname,String psw) {
		username.sendKeys(uname);
		password.sendKeys(psw);
 	}
	
	public void clicklink() {
		button.click();
	}
}
