package pageobject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public Landingpage landingpage;
	public WebDriver driver;
	public Offerpage offerpage;
	public Checkoutpage  checkoutpage;
	
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver=driver;
		
	}
	 
	public Landingpage getLandingpage() {
		
		 landingpage=new Landingpage(driver);
		 return  landingpage;
	}
	
	public Offerpage getofferpage() {
		 offerpage=new Offerpage(driver);
		 return  offerpage;
	}
	
	public Checkoutpage getcheckoutpage() {
		checkoutpage=new Checkoutpage(driver);
		 return checkoutpage;
	}

}
