package _WebDriverDifferentTypeOfCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _6StepReadattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		// open browser
		WebDriver driver = new FirefoxDriver();
		// pass url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement getcss = driver.findElement(By.name("websubmit"));
		System.out.println(getcss.getCssValue("font-family"));
		System.out.println(getcss.getCssValue("font-weight"));
		
		driver.close();

}
}