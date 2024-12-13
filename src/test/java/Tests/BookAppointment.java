package Tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import Pages.BookingPage;
import Pages.ConfirmationPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class BookAppointment extends BaseTest {

	@Description("This is for Making Appointments")
	@Severity(SeverityLevel.NORMAL)
	@Story("As a user I should be able to login to make appointments")
	@Test
	public void bookAppointment() {
		HomePage homepage = new HomePage(driver);
		homepage.makeAppointment();

		LoginPage login = new LoginPage(driver);

		login.login(loginUsername, loginPassword);

		BookingPage bookingpage = new BookingPage(driver);

		// Capture current URL after login
		String currentUrl = driver.getCurrentUrl();

		// Attach a screenshot to the Allure report
		

		// Verify login success
		Assert.assertTrue(currentUrl.contains("#appointment"), "Login failed");
		//Make Booking
		bookingpage.enterBookingDetails(bookingfacility, visitDate, "Test comment");
		
		//Confirm Booking
		ConfirmationPage confirmationpage = new ConfirmationPage(driver);
		String tag = confirmationpage.getConfirmationTag();
		String facility = confirmationpage.getfacilityDetails();
		
		String visitDate = confirmationpage.getVisitDate();
		 assertThat(facility).isEqualTo(bookingfacility);
		 
		assertThat(visitDate).isEqualTo(visitDate);
		

	}

	
}
