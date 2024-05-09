package stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Landingpage;
import pageobject.Offerpage;
import pageobject.PageObjectManager;
import utils.Genericutils;
import utils.Testcontextsetup;

public class Offersteps {
	public  WebDriver driver; 
	//public String landingpageproductname;
	public String offerpageproductname;
   Testcontextsetup testcontextsetup;
   PageObjectManager PageObjectManager;
	
	public Offersteps(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	

	@Then("^user searched for(.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortname) throws InterruptedException {
	   
	    
		//moving to parent to child window//
		switchtoofferspage();
		//Offerpage offerpage=new Offerpage(testcontextsetup.driver);
		
		Offerpage offerpag=testcontextsetup.PageObjectManager.getofferpage();
		offerpag.searchitem(shortname);
		
		//testcontextsetup.driver.findElement(By.id("search-field")).sendKeys(shortname);
		Thread.sleep(2000);
		 offerpageproductname=offerpag.getproductname();
		}
	
	public void switchtoofferspage() {
		
		//PageObjectManager=new PageObjectManager(testcontextsetup.driver);
		Landingpage landingpage=testcontextsetup.PageObjectManager.getLandingpage();
		
		//Landingpage landingpage=new Landingpage(testcontextsetup.driver);
		landingpage.selecttopdealpage();
		 Genericutils genericutils=new Genericutils(driver);
		 testcontextsetup.genericutils.SwitchWindowToChild();
		 
		 //explicit wait,Parse string
		
		
		
	}
	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	  Assert.assertEquals(offerpageproductname,testcontextsetup.landingpageproductname);
	}

}
