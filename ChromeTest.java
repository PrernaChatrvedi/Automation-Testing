package Task16;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demoblaze.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		if(title.contains("STORE")) {
			System.out.println("Page landed on correct website");
		}else {
			System.out.println("Page not landed on correct website");
		}
		driver.close();
	}

}
