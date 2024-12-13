package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
	WebDriver driver;
	public ConfirmationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css ="div h2")
	WebElement confirmationTag;
	
	
	@FindBy(id="facility")
	WebElement facilityConfirmation;
	
	@FindBy(id="visit_date")
	WebElement vistedDateConfirmation;
	
	public String getConfirmationTag()
	{
		return confirmationTag.getText();
	}
	
	public String getfacilityDetails()
	{
		return facilityConfirmation.getText();
	}
	public String getVisitDate()
	{
		return vistedDateConfirmation.getText();
	}
	
}
