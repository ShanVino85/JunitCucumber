package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerpage {
	
public WebDriver driver;
	
	public Offerpage(WebDriver driver) {
		this.driver=driver;
		
	}
	By search=By.id("search-field");
	//By search=By.className("search-keyword");
	By productname=By.cssSelector("tr > td:nth-child(1)");
	
	
	
	public void searchitem(String name) {
		driver.findElement(search).sendKeys(name);
		}
	
	public void getsearchtext() {
		driver.findElement(search).getText();
		}

	public String getproductname() {
		return driver.findElement(productname).getText();
	}

}
