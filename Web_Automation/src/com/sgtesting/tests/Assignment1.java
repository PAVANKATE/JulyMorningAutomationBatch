package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver obj= null;
	public static void main(String[] args) 
	{
		browseer();
		navigation();
		login();
		minimise();
		//creatuser();
		 //modify();
		 Cproject();
		 creatproject();
		//deleteusers();
		
	}
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
		static void minimise()
		{
			try
			{
			obj.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void creatuser()
		{
			try
			{
				obj.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				obj.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				obj.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("PAVAN2");
				obj.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("KATE1");
				obj.findElement(By.id("userDataLightBox_emailField")).sendKeys("pavankate1@gmail.com");
				obj.findElement(By.id("userDataLightBox_usernameField")).sendKeys("king1");
				obj.findElement(By.id("userDataLightBox_passwordField")).sendKeys("pk99791");
				obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("pk99791");
				obj.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteusers()
		{
			try
			{
				Thread.sleep(2000);
				obj.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
				Thread.sleep(2000);
				obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void modify()
		{
			try
			{
			Thread.sleep(1500);
			obj.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1500);
			obj.findElement(By.id("userDataLightBox_firstNameField")).click();
			obj.findElement(By.id("userDataLightBox_firstNameField")).clear();
			Thread.sleep(1500);
			obj.findElement(By.id("userDataLightBox_emailField")).click();
			obj.findElement(By.id("userDataLightBox_emailField")).clear();
			Thread.sleep(1500);
			obj.findElement(By.id("userDataLightBox_usernameField")).click();
			obj.findElement(By.id("userDataLightBox_usernameField")).clear();
			
			Thread.sleep(1500);
			obj.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("llp");
			obj.findElement(By.id("userDataLightBox_emailField")).sendKeys("katepavan@gmail.com");
			obj.findElement(By.id("userDataLightBox_usernameField")).sendKeys("kp9979");
			Thread.sleep(1500);
			obj.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			System.out.println("jdhc");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void Cproject()
		{
			try
			{
				Thread.sleep(2000);
				obj.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
				Thread.sleep(2000);
				obj.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
				Thread.sleep(2000);
				obj.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void creatproject()
		{
			try
			{
				Thread.sleep(2000);
				obj.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(1000);
				obj.findElement(By.id("customerLightBox_nameField")).click();
				Thread.sleep(1000);
				obj.findElement(By.id("customerLightBox_nameField")).sendKeys("Rahimkhan");
				Thread.sleep(1500);
				obj.findElement(By.id("customerLightBox_descriptionField")).click();
				Thread.sleep(1000);
				obj.findElement(By.id("customerLightBox_descriptionField")).sendKeys("mango man");
				Thread.sleep(1000);
				obj.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div")).click();
				Thread.sleep(1000);
				obj.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
				Thread.sleep(1000);
				obj.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
				Thread.sleep(1500);
				obj.findElement(By.id("ext-gen53")).click();
				Thread.sleep(1500);
				obj.findElement(By.xpath("ext-gen250")).click();
				Thread.sleep(1500);
				obj.findElement(By.id("ext-gen174")).click();
				Thread.sleep(1500);
				obj.findElement(By.id("createTasksPopup_newProject")).click();
				Thread.sleep(1500);
				obj.findElement(By.id("createTasksPopup_newProject")).sendKeys("sell mango");
				Thread.sleep(1500);
				System.out.println("fkjn");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
