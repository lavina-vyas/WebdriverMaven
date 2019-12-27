package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Load_WebPage 
{
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lvyas\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Page loaded");
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void doLogin()
	{
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.clear();
		email.sendKeys("adobenoida1@gmail.com");
		WebElement pass = driver.findElement(By.cssSelector("#pass"));
		pass.clear();
		pass.sendKeys("Tester@1");
		driver.findElement(By.cssSelector("input[data-testid='royal_login_button']")).click();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}