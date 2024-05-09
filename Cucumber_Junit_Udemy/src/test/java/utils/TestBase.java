package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public WebDriver driver;
	
	public WebDriver WebDriverManager()  throws IOException 
	{
		 
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		
		//getting browser from property file
		String browser_Property=prop.getProperty("browser");
		
		//getting browser from mavencommandline
		String browser_maven=System.getProperty("browser");
		
		//result=testCondition? value1: value2;
		//if testCondition is true first condition1 satisfied otherwise 2 satisfied.
		
		String browser=browser_maven!=null ? browser_maven:browser_Property;
		
		if(driver==null) 
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
		
		    WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		     }
		if(browser.equalsIgnoreCase("firefox"))
			{
			 WebDriverManager.firefoxdriver().setup();
		     driver=new FirefoxDriver();
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
			
		}
		 return driver;
}

}

