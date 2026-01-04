package Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase{
	WebDriver driver;
	
	@BeforeClass
	public void lauchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("document.getElementById('fixedban').remove()");
	        js.executeScript("document.querySelector('footer').remove()");
	        
	        
	}
	@AfterClass
	public void close() {
		driver.quit();
		System.out.println("browse close successfully...");
	}

	
	

}
