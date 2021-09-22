package co.sgtesting.dataprovidersdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Newtest {
	public static WebDriver obj= null;
	
	@Test(priority=1)
	static void browseer()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web_Automation\\Library\\drivers\\chromedriver.exe");
		obj=new ChromeDriver();
	}catch (Exception e) 
		{
		e.printStackTrace();
	}
}
	@Test(priority=2)
	static void navigation()
	{
		try
		{
			obj.get("http://localhost:82/login.do");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void login()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("admin");
			obj.findElement(By.name("pwd")).sendKeys("manager");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void minimise()
	{
		try
		{
		obj.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1kl]")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
