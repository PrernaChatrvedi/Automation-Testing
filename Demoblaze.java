package Task24;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Task24ObjectRepository.DemoblazeHomepage;
import Task24ObjectRepository.DemoblazeLoginPage;

public class Demoblaze {
	    ExtentSparkReporter reporter;
		ExtentReports extent;
		ExtentTest test;
	 @BeforeTest
	 public void config() {
			String path=System.getProperty("user.dir")+"\\reports\\index.html";
			reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("Demoblaze Test Results");
			reporter.config().setDocumentTitle("Login Test Results");
			extent=new ExtentReports();
			extent.attachReporter(reporter); 
		    extent.setSystemInfo("Tester", "Prerna");
		}
	 @Test
	    public void login() {
		extent.createTest("LoginReport"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com");
		DemoblazeHomepage rd=new DemoblazeHomepage(driver);
		rd.clicklink();
		DemoblazeLoginPage rd1=new DemoblazeLoginPage(driver);
		rd1.EnterData("Prerna Chaturvedi", "Prerna@123"); 
		rd1.clicklink();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "STORE";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		driver.close();
		
	}
	@AfterTest
	public void report() {
		extent.flush();
	}

}
