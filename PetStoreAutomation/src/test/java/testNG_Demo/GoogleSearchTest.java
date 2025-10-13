package testNG_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        // Launch Chrome
       // System.setProperty("webdriver.chrome.driver",    "path_to_chromedriver");
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
    @DataProvider(name = "searchData")
    public Object[][] getData() 
{
        return new Object[][] 
{
            {"India", "Qutub Minar"},
            {"Agra", "Taj Mahal"},
            {"Hyderabad", "Char Minar"}
        };
    }
    @Test(dataProvider = "searchData")
    public void searchMonument(String city, String monument) throws InterruptedException {
        // Step 2: Search for monument
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(city + " " + monument);
        searchBox.submit();

        Thread.sleep(2000); // Just for demo purposes (not recommended in real automation)
        System.out.println("Searched: " + city + " " + monument);
    }
    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
