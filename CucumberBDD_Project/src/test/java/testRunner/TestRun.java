package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefination"},
    dryRun=true,
    plugin = {"pretty", "html:Reports/CucumberReport.html"},
    monochrome = true
     )
public class TestRun {
}
