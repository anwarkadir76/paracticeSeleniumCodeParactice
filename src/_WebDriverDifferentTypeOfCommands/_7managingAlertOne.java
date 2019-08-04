package _WebDriverDifferentTypeOfCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javafx.scene.control.Alert;

public class _7managingAlertOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		// open browser
		WebDriver driver = new FirefoxDriver();
		// pass url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = (Alert) driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getContentText());
		((org.openqa.selenium.Alert) alert).accept();
		((WebElement) alert).sendKeys("a");
}
}