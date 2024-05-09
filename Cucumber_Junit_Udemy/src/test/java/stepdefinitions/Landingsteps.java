package stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Landingpage;
import utils.Genericutils;
import utils.Testcontextsetup;

public class Landingsteps {
	public  WebDriver driver; 
	public String landingpageproductname;
	public String offerpageproductname;
	Testcontextsetup testcontextsetup;
	public Landingpage landingpage;
	
	public Landingsteps(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.landingpage=testcontextsetup.PageObjectManager.getLandingpage();
	}
	
	@Given("user is on greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		
		//Assert.assertTrue(landingpage.gettitleLandingpage().contains("Greenkart"));
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver_win32");
		//Genericutils genericutils=new Genericutils(driver);
		//testcontextsetup.testbase.WebDriverManager();
		//Taking driver from PageobjectManager
	}

	@When("^user searched with shortname (.+) and extracted actual name of the product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortname) throws InterruptedException {
		//Landingpage landingpage=new Landingpage(testcontextsetup.driver);
		
		
		landingpage.searchitem(shortname);
		
		//testcontextsetup.driver.findElement(By.className("search-keyword")).sendKeys("Tom");
	    Thread.sleep(2000);
	    testcontextsetup.landingpageproductname=landingpage.getproductname().split("-")[0].trim();
	   System.out.println( testcontextsetup.landingpageproductname + "extracted from homepage");
		
	}
	
	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
	      landingpage.Increment(Integer.parseInt(quantity));
	      landingpage.Addtocart();
	}

	

}
