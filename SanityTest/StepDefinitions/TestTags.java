package SanityTest.StepDefinitions;

import io.cucumber.java.en.*;

public class TestTags {
	
	@Given("SanityTest tag is chosen")
	public void sanity_test_tag_is_chosen() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println("Test tag given");
	}

	@When("in the class file")
	public void in_the_class_file() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println("Test tag when");
	}

	@Then("execute this section")
	public void execute_this_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println("Test tag then");
	}

}
