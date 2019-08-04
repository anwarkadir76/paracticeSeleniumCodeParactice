package _WebDriverDifferentTypeOfCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _2StepFindElementtoTestingGmailAccountLoginWebsite {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
	
	// open browser
	WebDriver driver = new FirefoxDriver();
	
	// pass url
	driver.get("https://accounts.google.com");
	System.out.println(driver.findElement(By.name("firstName")));
	System.out.println(driver.findElement(By.name("lastName")));
	System.out.println(driver.findElement(By.name("Username")));
	System.out.println(driver.findElement(By.name("Passwd")));
	System.out.println(driver.findElement(By.name("ConfirmPasswd")));
	
	
	
	driver.close();
}

}