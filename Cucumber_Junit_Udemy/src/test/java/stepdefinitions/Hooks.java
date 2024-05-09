package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.Testcontextsetup;

public class Hooks {
	Testcontextsetup testcontextsetup;
	
	public Hooks(Testcontextsetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}	
	@After
	public void Afterscenario() throws IOException 
	{
		testcontextsetup.testbase.WebDriverManager().quit();
		
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException 
	{
		WebDriver driver =testcontextsetup.testbase.WebDriverManager();
		if(scenario.isFailed()) 
		{
			//screenshot
			File sourcepath= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent =FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
    }
}
