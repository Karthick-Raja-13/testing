package bdd;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	@When("I go to the URL")
	public void iGoToTheURL() {
		System.out.println("Run");
	}
	@When("I enter a valid username student and a valid password Password123")
	public void iEnterAValidUsernameStudentAndAValidPasswordPassword123() {
	   System.out.println("Run");
	   }
	@When("I click the submit button")
	public void iClickTheSubmitButton() {
		System.out.println("Run");
	}
	@Then("I should see a welcome message")
	public void iShouldSeeAWelcomeMessage() {
		System.out.println("Run");
	}
}
