package webdriver_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.*;
//import org.openqa.selenium.edge;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		
       //1. Find total no of rows in table
		int rows= driver.findElements(By.xpath("//table[contains(@name,'BookTable')]//tr")).size();
		System.out.println("No of rows : "+rows);
		
 //2. Find total no of columns in table
		// Columns are present in first <tr> tag below the <tbody> tag
		int colm= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		// or driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("No of colm : "+colm);
		
//3. Read data from specific row and column
  String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	   System.out.println(data);
	 
//capturing javascript in 7th row and 5th column
	//   String data2=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[8]")).getText();
	//	System.out.println(data2);
		
	   //4. Read data from all rows and column
	   /* We have to use nested for loop for reading all data because we have rows and columns here so to increment rows and column
		we need 2 for loops, outer for loop is for repeating rows and inner for loop is for replating the col in each row
		
		
		*/
		for(int r=2;r<=rows;r++) // r=2 bec first row we ignoring because first row having header only so we are string from 2nd row bec actual
			         //data starts from 2nd row
		{
			for(int c=1;c<=colm;c++) // 2nd for loop is for incrementing the columns
			{
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();  // "+r+" .. we are adding the variables in this syntax
			System.out.print(value+"\t");
			}
			System.out.println();
		}
	
//5. Print book names whose author is Mukesh
		for(int r=2;r<=rows;r++)
		{
			String authname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();  // "+r
			if(authname.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				//String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				System.out.println(bookname+"\t"+authname+"\t");
			}
		}

}

	}


