package _WebDriverDifferentTypeOfCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _1StepToGetTitleGetUrltoTestingWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		System.out.println(driver.getTitle());// get page title
		String s =driver.getCurrentUrl(); // get url
		System.out.println(s);
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();


		
		driver.close();
		//driver.quit();
		

	}

}