package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = ".//Features/RShetty.feature",
		glue="stepDefination",
		dryRun=false,
		plugin= {"pretty", "html:Reports/CucumberReportsRshetty.html"},
		monochrome=true					
)


public class TestRunRshetty 
{

}
