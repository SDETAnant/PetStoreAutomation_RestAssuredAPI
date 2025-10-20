package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFB {
	
	WebDriver driver;
  public LoginPageFB(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
    @FindBy(id="email")
    WebElement txtemail;
    
    @FindBy(id="pass")
    WebElement txtpass;
    
    @FindBy(id="loginbutton")
    WebElement logbtn;
    
    public void setUsername(String uname)
    {
    	 txtemail.click();
    	 txtemail.sendKeys(uname);
    	 
    }
    public void setUserpwd(String userpwd)
    {
    	txtpass.click();
    	txtpass.sendKeys(userpwd);	 
    }
    
    public void clicklogin()
    {
    	logbtn.click();
    	
    }
}
