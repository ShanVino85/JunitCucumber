package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobject.PageObjectManager;

public class Testcontextsetup {

	public  WebDriver driver; 
	public String landingpageproductname;
	public PageObjectManager PageObjectManager; 
	public TestBase testbase;
	public Genericutils genericutils;
	
	public Testcontextsetup() throws IOException {
		
		testbase= new TestBase();
		PageObjectManager=new PageObjectManager(testbase.WebDriverManager());
		genericutils=new Genericutils(testbase.WebDriverManager());
	}
}
