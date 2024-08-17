package Task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		driver.findElement(By.className("form-control")).sendKeys("Perna");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Prerna@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Prerna@123");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("7654546786");
		driver.findElement(By.tagName("a")).click();
		System.out.println("Registered");
		
	}
	
}
