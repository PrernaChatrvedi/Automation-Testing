package task17;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoblaze {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("login2"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys("prerna27chaturvedi@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("Prerna@123");
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		WebElement e = driver.findElement(By.id("nameofuser"));
		//String text = e.getText();
		System.out.println(e.getText());
		driver.close();
	}

}
