package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
	
	public WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By search=By.className("search-keyword");
	By productname=By.cssSelector("h4.product-name");
	
	By topdeal=By.linkText("Top Deals");
	By increment=By.className("increment");
	By addtocart=By.className("product-action");
	
	public void searchitem(String name) {
		driver.findElement(search).sendKeys(name);
		}
	
	public void getsearchtext() {
		driver.findElement(search).getText();
		}

	public String getproductname() {
		 return driver.findElement(productname).getText();
	}
	
	public void selecttopdealpage() {
		driver.findElement(topdeal).click();
		
	}
	
	public String gettitleLandingpage() {
		return driver.getTitle();
	}
	
	public void Increment(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
		driver.findElement(increment).click();
		i--;
		}
	}
	
	public void Addtocart() {
		driver.findElement(addtocart).click();
		}
	
	
}
