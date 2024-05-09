package cucumberoptions;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//html,xml,json,junit,extent

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",
glue="stepdefinitions",monochrome=true,tags="@PlaceOrder or @Offerpage"
,plugin= {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"rerun:target/failed_scenarios.txt"})

public class JunitTestrunnertest  {
	
	
	}


////,monochrome=true,tags="@tags1")