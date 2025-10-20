package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class StepsFB {
	public static WebDriver driver;
	public static LoginPage lpfb;
	
	@Given("User launch edge browesr")
	public void user_launch_edge_browesr() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  lpfb=new LoginPage(driver);
	}

	@When("User opens URL facebook page {string}")
	public void user_opens_url_facebook_page(String urlfb) {
	  driver.get(urlfb);
	  driver.manage().window().maximize();
	}

	@When("User enters email as {string} and Password {string}")
	public void user_enters_email_as_and_password(String email, String pwd) 
	{
	   lpfb.setUserName(email);
	   lpfb.setPassword(pwd);
	}

	@When("click on try another way")
	public void click_on_try_another_way() 
	{
	 lpfb.clickLogin();
	}

	

}
