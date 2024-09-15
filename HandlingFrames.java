package Task1127;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		WebElement top = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(top);

		List<WebElement> iframeElements = driver.findElements(By.xpath("//frame"));
		System.out.println("Total number of iframes are " + iframeElements.size());
		Assert.assertEquals(iframeElements.size(), 3);
		WebElement left = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(left);
		String expectedText =driver.findElement(By.xpath("//body")).getText();
		Assert.assertEquals(expectedText,"LEFT");
		System.out.println(expectedText);
		driver.switchTo().parentFrame();
		
		WebElement mid = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(mid);
		String expectedText2 =driver.findElement(By.xpath("//body")).getText();
		Assert.assertEquals(expectedText2,"MIDDLE");
		System.out.println(expectedText2);
		driver.switchTo().parentFrame();
		
		WebElement right = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(right);
		String expectedText3 =driver.findElement(By.xpath("//body")).getText();
		Assert.assertEquals(expectedText3,"RIGHT");
		System.out.println(expectedText3);
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		WebElement bottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottom);
		String expectedText4 =driver.findElement(By.xpath("//body")).getText();
		Assert.assertEquals(expectedText4,"BOTTOM");
		System.out.println(expectedText4);
		driver.switchTo().parentFrame();
		//Title is blank 
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"");
		driver.close();
	}

}
