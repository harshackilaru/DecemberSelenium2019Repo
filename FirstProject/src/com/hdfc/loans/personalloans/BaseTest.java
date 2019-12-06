package com.hdfc.loans.personalloans;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	
	public static void init() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\FirstProject\\data.properties");
		 p=new Properties();
		p.load(fis);
	}
	
	
	public static void navigateUrl(String url) 
	{
		driver.get(p.getProperty(url));
	}

	public static void launch(String browser) 
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	}

}
