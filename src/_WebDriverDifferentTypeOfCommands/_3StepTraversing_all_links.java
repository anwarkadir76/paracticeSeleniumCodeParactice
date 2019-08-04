package _WebDriverDifferentTypeOfCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class _3StepTraversing_all_links {

	public static void main(String[] args) {
		 String baseUrl = "http://newtours.demoaut.com/";
		 System.out.println("launching firefox browser"); 
		 String driverPath = "C:\\Program Files\\geckodriver.exe";
		 WebDriver driver;
		 String expected = null;
		 String actual = null;
		 
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver= new FirefoxDriver();
		driver.get(baseUrl);
		//check title
	    String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		//check register link
		driver.findElement(By.linkText("REGISTER")).click() ;
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		//Check support link
		driver.findElement(By.linkText("SUPPORT")).click() ;
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		//check home link
		driver.findElement(By.linkText("Home")).click() ;
		driver.close();
		 
		 }

			
		}
