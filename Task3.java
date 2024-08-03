package Task16;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).submit();
		driver.close();
	}

}
