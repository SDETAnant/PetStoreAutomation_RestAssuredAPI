package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class XPathDemo {
	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://example.com/opencart");
	        driver.manage().window().maximize();
	        
	        // XPath with single attribute
	        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("t-shirts");
	        
	        // XPath with multiple attributes
	        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("t-shirts");
	        
	        // XPath with AND operator
	        driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("t-shirts");
	        
	        // XPath with OR operator
	        driver.findElement(By.xpath("//input[@name='search' or @placeholder='xyz']")).sendKeys("t-shirts");
	        
	        // XPath with text()
	        driver.findElement(By.xpath("//a[text()='MacBook']")).click();
	        
	        // XPath with contains()
	        driver.findElement(By.xpath("//input[contains(@placeholder,'ear')]")).sendKeys("t-shirts");
	        
	        // XPath with starts-with()
	        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("t-shirts");
	        
	        // Chained XPath
	        boolean imageStatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	        System.out.println("Image displayed: " + imageStatus);
	        
	        driver.quit();
              

	}

}
