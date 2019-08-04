package _Businessprocess;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class _Complatly_Business_process {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
		userName.clear();
		userName.sendKeys("a");
		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		password.clear();
		password.sendKeys("a");
		WebElement login = driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		login.click();
		WebDriverWait pageload = new WebDriverWait(driver, 10);
		pageload.until((Function) ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[contains(@name,'passCount')]")));

		//book a flight
			WebElement radioOneWay = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		radioOneWay.click();
		Select passengerCount = new Select(driver.findElement(By.xpath("//select[contains(@name,'passCount')]")));
		passengerCount.selectByIndex(0);
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select selectfromPort = new Select(fromPort);
		selectfromPort.selectByIndex(1); 
		WebElement fromMonth = driver.findElement(By.name("fromMonth"));
		Select selectfromMonth = new Select(fromMonth);
		selectfromMonth.selectByIndex(6);
		WebElement fromDay = driver.findElement(By.name("fromDay"));
		Select selectfromDay = new Select(fromDay);
		selectfromDay.selectByIndex(29);
		WebElement toPort = driver.findElement(By.name("toPort"));
		Select selecttoPort = new Select(toPort);
		selecttoPort.selectByIndex(6);
		WebElement toMonth = driver.findElement(By.name("toMonth"));
		Select selecttoMonth = new Select(toMonth);
		selecttoMonth.selectByIndex(7);
		WebElement toDay = driver.findElement(By.name("toDay"));
		Select selecttoDay = new Select(toDay);
		selecttoDay.selectByIndex(4);
		WebElement airline = driver.findElement(By.name("airline"));
		Select selectairline = new Select(airline);
		selectairline.selectByIndex(2);
		WebElement findFlights = driver.findElement(By.name("findFlights"));
		findFlights.click();
		// WebDriverWait pageload = new WebDriverWait(driver,10);
		// pageload.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input"
		// )));

			WebElement outFlight = driver.findElement(By.xpath(
				"//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input[1]"));
		String get = outFlight.getTagName();
		System.out.println(get);
		outFlight.click();
		WebElement reserveFlights = driver.findElement(By.name("reserveFlights"));
		reserveFlights.click();

		WebDriverWait pageload1 = new WebDriverWait(driver, 10);
		pageload1.until(ExpectedConditions.visibilityOfElementLocated(By.name("creditnumber")));
		WebElement creditNumber = driver.findElement(By.name("creditnumber"));
		creditNumber.sendKeys("1234567890123456");
		WebElement buyFlight = driver.findElement(By.name("buyFlights"));
		buyFlight.click();


		WebElement signOff = driver.findElement(By.cssSelector(
				"body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(1) > a"));
		signOff.click();
	
		driver.close();
	}


	}

