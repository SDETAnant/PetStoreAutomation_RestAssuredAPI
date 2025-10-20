package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.RShettyLoginPage;

public class StepsRShetty {
	public static WebDriver driver;
	public RShettyLoginPage rshettylog;
	
	@Given("User launches the chrome browser")
	public void user_launches_the_chrome_browser() 
	{
		
		
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  rshettylog =new RShettyLoginPage(driver);
	  
	}

	@When("user opens the URL  {string}")
	public void user_opens_the_url(String url) 
	{
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("user clicks on home page")
	public void user_clicks_on_home_page() 
	{
	 rshettylog.clickhome();
	 System.out.println("Succuessfully clicked 0");
	}

	@When("user clicks on login")
	public void user_clicks_on_login() 
	{
		 rshettylog.clicklogin();
		 System.out.println("Succuessfully clicked 1");
	}

	@When("user enters the invalid email as {string}")
	public void user_enters_the_invalid_email_as(String email) throws InterruptedException 
	{
		 rshettylog.clicklobbox(email);
		 System.out.println("Succuessfully clicked 2");
		 Thread.sleep(5000);
	}

	@Then("user should see the text {string}")
	public void user_should_see_the_text(String email) 
	{
		 String pg = driver.getPageSource();
	        if (pg.contains("To log in, enter the code sent to your email")) {
	            System.out.println("test case is pass");
	        } else 
	        {
	            System.out.println("String not found");
	        }
	        driver.quit(); // ✅ use quit, not close
	}



}
