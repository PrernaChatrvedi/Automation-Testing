package Task24ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoblazeHomepage {
	WebDriver driver;
    public DemoblazeHomepage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
// object on webpage which is going to interact 
    	@FindBy(id = "login2")
    	WebElement link;
	
	public void clicklink() {
		link.click();
	}
	
}
