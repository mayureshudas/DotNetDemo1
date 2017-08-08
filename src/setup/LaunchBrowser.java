package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class LaunchBrowser {
public static WebDriver driver;
	@BeforeSuite
@Parameters({"browser","url"})
public static void launchBrowser(@Optional("chrome")String browser, String url){
	/*if(browser=="firefox"){
		System.out.println("Inside firefox box");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("url");
		return driver;
	}*/
	
	
		System.out.println("Inside chrome box");
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
	
	public static WebDriver returnDriver(){
		return driver;
	}
}
