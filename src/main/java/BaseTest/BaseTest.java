package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.ConfigReader;

public class BaseTest {

	public WebDriver driver;
	public String loginUsername, loginPassword,bookingfacility,visitDate;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = ConfigReader.getProperty("url");
		driver.get(url);

		loginUsername = ConfigReader.getProperty("username");
		loginPassword = ConfigReader.getProperty("password");
		
		bookingfacility = ConfigReader.getProperty("facility");
		visitDate = ConfigReader.getProperty("visitdate");
		
	}

	@AfterMethod
	public void close() {

		// driver.close();

	}
}
