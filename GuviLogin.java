package Task20;

import java.net.ServerSocket;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GuviLogin {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.className("form-control")).sendKeys("Prerna");
		driver.findElement(By.cssSelector("input#email")).sendKeys("prerna27chaturvedi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Prerna@24");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("7654546786");
		driver.findElement(By.tagName("a")).click();
		System.out.println("Registered");
		//driver.findElement(By.id("laterBtn")).click();
		String expectedurl1= driver.getTitle();
		System.out.println(expectedurl1);
		String actualurl1 = "GUVI | Learn to code in your native language";
		Assert.assertEquals(expectedurl1,actualurl1);
		driver.navigate().to("https://www.guvi.in/");
		//driver.findElement(By.id("//img[@src='/web-build/images/guvi-logo-bl.0788b08f39d9789f7a739632e3d55c23.png']")).click();
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("email")).sendKeys("prerna27chaturvedi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Prerna@24");
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("home-tab")));
		String expectedurl= driver.getCurrentUrl();
		System.out.println(expectedurl);
		String actualurl = "https://www.guvi.in/courses/?current_tab=myCourses";
		Assert.assertEquals(expectedurl,actualurl);
		System.out.println("Process completed");
		driver.close();
	}
}
