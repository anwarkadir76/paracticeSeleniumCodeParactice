package _WebDriverDifferentTypeOfCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _4StetReadRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		// open browser
		WebDriver driver = new FirefoxDriver();
		// pass url
		driver.get("http://www.newtours.demoaut.com/");
		//System.out.println(driver.findElement(By.name("userName")));
		// pass some credentials
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		
		
		driver.close();
	}

}