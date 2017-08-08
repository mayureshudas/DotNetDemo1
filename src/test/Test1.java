package test;

import junit.framework.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
import setup.LaunchBrowser;

public class Test1 {
	public static WebDriver driver;
	@BeforeSuite
	public static void launchDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "D:\\Users\\maudas\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//WebDriver driver = new FirefoxDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost/demotesting/account/login");
	}
	@Test
	public static void login(){
		driver.findElement(By.xpath("//form//input[@id='UserName']")).sendKeys("admin123");
		driver.findElement(By.xpath("//form//input[@id='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//form//input[@class='btn btn-default']")).click();
	}
	
	@Test
	public static void getHeader(){
		String title=driver.getTitle();
		Assert.assertEquals("An ASP .net website", title);
		
	}
	

}
