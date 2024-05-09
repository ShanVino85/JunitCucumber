package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	
	public WebDriver driver;
	
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	By cart=By.cssSelector("img[alt='Cart']");
	By proceedtocheckout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promobtn=By.cssSelector(".promoBtn");
	By placeorder=By.xpath("//button[contains(text(),'Place Order')]");
	
	
	
	public void Cartproduct() {
		driver.findElement(cart).click();
		}
	
	public void Proceedtocheckout() {
		driver.findElement(proceedtocheckout).click();
		}
	
	public boolean VerifyPromobtn() {
		return driver.findElement(promobtn).isDisplayed();
		}
	public  boolean VerifyPlaceorder() {
		return driver.findElement(placeorder).isDisplayed();
		}
	
}
