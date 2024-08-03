package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
	}

}
