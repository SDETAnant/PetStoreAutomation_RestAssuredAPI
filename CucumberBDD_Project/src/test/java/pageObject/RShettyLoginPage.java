package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RShettyLoginPage {
	
	public  WebDriver driver;
	
	public RShettyLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//button[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy (xpath="//a[normalize-space()='Login']")
	WebElement loginbtn;
	
	
	@FindBy (xpath="//input[@id='email']")
	WebElement loginbox;
	
	
	public void clickhome()
	{
		homebtn.click();
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
	public void enteremail()
	{
		loginbtn.click();
	}
	
	public void clicklobbox(String email)
	{
		loginbox.click();
		loginbox.sendKeys(email);
	}

}
