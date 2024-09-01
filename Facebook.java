package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//div[@class='_8ien']"));
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Chaturvedi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9926985443");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("27");
		Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Nov");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2000");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();

	}

}
