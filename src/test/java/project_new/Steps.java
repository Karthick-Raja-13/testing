package project_new;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {
	LoginPage page;
	@When("I go to the URL")
	public void iGoToTheURL() {
		page = new LoginPage();
		page.start();
	}
	@When("I enter a valid username student and a valid password Password123")
	public void iEnterAValidUsernameStudentAndAValidPasswordPassword123() {
		page.getUname().sendKeys("student");
		page.getPass().sendKeys("Password123");
	}
	@When("I click the submit button")
	public void iClickTheSubmitButton() {
		page.getLoginBtn().click();
	}
	@Then("I should see a welcome message")
	public void iShouldSeeAWelcomeMessage() {
	   System.out.println("Test Completed");
	}

}
