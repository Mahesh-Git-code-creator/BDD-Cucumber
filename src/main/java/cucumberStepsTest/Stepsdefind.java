package cucumberStepsTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepsdefind {

	WebDriver driver;

	@After
	public void Ending() throws Exception {

		Thread.sleep(3000);
		driver.quit();

	}

	@Given("user starts  {string} Browser")
	public void user_starts_browser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":

			driver = new ChromeDriver();

			break;

		case "firefox":

			driver = new FirefoxDriver();

			break;

		case "edge":

			driver = new EdgeDriver();

			break;

		default:
			try {

				throw new Exception();

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
			break;
		}
	}

	@Given("user launch app using  {string}")
	public void user_launch_app_using(String url) {

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("user enters  using xpath {string} text {string} in usernametextbox")
	public void user_enters_using_xpath_text_in_usernametextbox(String xpath, String usernametextbox) {

		driver.findElement(By.xpath(xpath)).sendKeys(usernametextbox);

	}

	@When("user enters text using xpath {string} text {string} in passwordtextbox")
	public void user_enters_text_using_xpath_text_in_passwordtextbox1(String xpath, String passwordtextbox) {

		driver.findElement(By.xpath(xpath)).sendKeys(passwordtextbox);

	}

	@When("user clicks in login button using xpath {string}")
	public void user_clicks_in_login_button_using_xpath(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}

	@Then("user verify picture is xpath {string}")
	public void user_verify_picture_is_xpath(String xpath) {

		Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());

	}

	@Then("user verify Title is {string}")
	public void user_verify_title_is1(String expTitle) {

		Assert.assertEquals(true, driver.getTitle().equalsIgnoreCase(expTitle));

	}

	@Then("user verify Title is  {string}")
	public void user_verify_title_is(String ExpTitle) {

		Assert.assertEquals(true, driver.getTitle().equalsIgnoreCase(ExpTitle));

	}

	@When("user enters in newLoginForm details using xpath {string} and Location is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_location_is(String xpath, String location) {

		driver.findElement(By.xpath(xpath)).sendKeys(location);

	}

	@When("user enters in newLoginForm details using xpath {string} and Hotels  is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_hotels_is(String xpath, String hotel) {

		driver.findElement(By.xpath(xpath)).sendKeys(hotel);
	}

	@When("user enters in newLoginForm details using xpath {string} and RoomType is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_room_type_is(String xpath, String RoomType) {

		driver.findElement(By.xpath(xpath)).sendKeys(RoomType);

	}

	@When("user enters in newLoginForm details using xpath {string} and noOfRooms is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_no_of_rooms_is(String xpath, String noOfRooms) {

		driver.findElement(By.xpath(xpath)).sendKeys(noOfRooms);

	}

	@When("user enters in newLoginForm details using xpath {string} and CheckInDate")
	public void user_enters_in_new_login_form_details_using_xpath_and_check_in_date(String xpath) throws Exception {

		Thread.sleep(3000);

		driver.findElement(By.xpath(xpath)).clear();

	}

	@When("user enters in newLoginForm details using xpath {string} and CheckInDate is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_check_in_date_is(String xpath, String checkInDate)
			throws Exception {

		Thread.sleep(3000);

		driver.findElement(By.xpath(xpath)).sendKeys(checkInDate);

	}

	@When("user enters in newLoginForm details using xpath {string} and CheckOutDate")
	public void user_enters_in_new_login_form_details_using_xpath_and_check_out_date(String xpath) throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath(xpath)).clear();

	}

	@When("user enters in newLoginForm details using xpath {string} and CheckOutDate  is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_check_out_date_is(String xpath,
			String checkOutDate) throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath(xpath)).sendKeys(checkOutDate);

	}

	@When("user enters in newLoginForm details using xpath {string} and AdultsPerRoom is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_adults_per_room_is(String xpath,
			String AdultRoom) {

		driver.findElement(By.xpath(xpath)).sendKeys(AdultRoom);
	}

	@When("user enters in newLoginForm details using xpath {string} and Childrens PerRoom is {string}")
	public void user_enters_in_new_login_form_details_using_xpath_and_childrens_per_room_is(String xpath,
			String childrensRoom) {

		driver.findElement(By.xpath(xpath)).sendKeys(childrensRoom);
	}

	@When("user enters  using xpath {string} text  {string} in usernametextbox")
	public void user_enters_using_xpath_text_in_usernametextbox1(String xpath, String UserName) {

		driver.findElement(By.xpath(xpath)).sendKeys(UserName);

	}

	@When("user clicks in submit button using xpath {string}")
	public void user_clicks_in_submit_button_using_xpath(String submitXpath) {
	    
		driver.findElement(By.xpath(submitXpath)).click();
		
	}



}