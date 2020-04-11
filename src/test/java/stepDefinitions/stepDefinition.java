package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {

	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.out.println("Opened Chrome and started application");
	}

	@When("^I enter valid username as \"([^\"]*)\"$")
	public void i_enter_valid_username_as(String arg1) throws Throwable {
		System.out.println("username entered is: " + arg1);
	}

	@When("^I enter valid password as \"([^\"]*)\"$")
	public void i_enter_valid_password_as(String arg1) throws Throwable {
		System.out.println("password entered is: " + arg1);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("Logged in successfully");
	}
	
	@Then("^Course Displayed are \"([^\"]*)\"$")
	public void course_Displayed_are(String arg1) throws Throwable {
	  System.out.println("cards displayed are: "+arg1);
	}
}
