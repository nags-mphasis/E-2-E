package SanityTest.StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step Given");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step When");
		//throw new io.cucumber.java.PendingException();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step And");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step Then");
		//throw new io.cucumber.java.PendingException();
	}

}
