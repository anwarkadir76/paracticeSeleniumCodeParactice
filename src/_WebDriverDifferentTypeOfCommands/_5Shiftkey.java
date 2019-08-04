package _WebDriverDifferentTypeOfCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _5Shiftkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//System.out.println(driver.findElement(By.name("userName")));
		driver.findElement(By.name("userName")).sendKeys(Keys.SHIFT,"a");
		driver.findElement(By.name("password")).sendKeys(Keys.SHIFT,"a");
		driver.findElement(By.name("login")).click();
	
	}
}
