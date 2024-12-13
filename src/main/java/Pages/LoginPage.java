package Pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		logger.info("LoginPage object initialized.");
	}
	
	private static final Logger logger = (Logger) LogManager.getLogger(LoginPage.class);
	@FindBy(id = "txt-username")
	WebElement userName;

	@FindBy(id = "txt-password")
	WebElement passWord;

	@FindBy(id = "btn-login")
	WebElement loginButton;

	public void login(String user, String pass) {
		userName.sendKeys(user);
		passWord.sendKeys(pass);
		loginButton.click();
	}

}
