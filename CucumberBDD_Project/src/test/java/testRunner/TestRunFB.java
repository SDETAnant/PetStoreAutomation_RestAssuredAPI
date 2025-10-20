package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "Features/Login.feature",
			glue = {"stepDefination"},
			dryRun=false,
			plugin= {"pretty", "html:Reports/CucumberReports.html"},
			monochrome=true
					
			)
		
	public class TestRunFB {	

}
