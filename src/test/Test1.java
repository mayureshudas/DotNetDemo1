package test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import setup.LaunchBrowser;

public class Test1 {
	public static WebDriver driver=LaunchBrowser.returnDriver();
	@Test
	public static void login(){
		driver.findElement(By.xpath("//form//input[@id='UserName']")).sendKeys("admin123");
		driver.findElement(By.xpath("//form//input[@id='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//form//input[@class='btn btn-default']")).click();
	}
	
	@Test
	public static void getHeader(){
		String title=driver.getTitle();
		Assert.assertEquals("", title);
		
	}
	

}
