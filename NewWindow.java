package Task1127;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NewWindow {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		int numwin = driver.getWindowHandles().size();
		System.out.println("Number of windows open:" + numwin);
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> AllWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = AllWindowHandles.iterator();
		while(iterator.hasNext()) {
			String childWindow = iterator.next();
			driver.switchTo().window(childWindow);
		}
		
		String expected=driver.findElement(By.tagName("h3")).getText();
		System.out.print(expected);
		Assert.assertEquals(expected,"New Window");
		driver.close();
		driver.switchTo().window(mainWindowHandle);
		System.out.print(" Main windows open: " + mainWindowHandle);
		String expected1=driver.findElement(By.tagName("h3")).getText();
		System.out.print(expected1);
		Assert.assertEquals(expected1,"Opening a new window");
		driver.quit();
		}
}
