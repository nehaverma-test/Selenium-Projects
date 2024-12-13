package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {

	WebDriver driver;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		logger.info("On Booking page");
	}
	private static final Logger logger = (Logger) LogManager.getLogger(LoginPage.class);
	@FindBy(id ="combo_facility")
	WebElement facilityDropdown;

	// Hongkong CURA Healthcare Center

	@FindBy(id = "txt_visit_date")
	WebElement visitDateField;

	@FindBy(id = "txt_comment")
	WebElement commentsSection;
	
	@FindBy(id="btn-book-appointment")
	WebElement booking;

	public void enterBookingDetails(String facility, String visitDate, String comments) {
		Select s1 = new Select(facilityDropdown);
		s1.selectByValue(facility);

		visitDateField.sendKeys(visitDate);
		commentsSection.sendKeys(comments);
        booking.click();
	}

}
