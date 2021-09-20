package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RafflePage;
import utils.CommonMethods;

public class RaffleSteps extends CommonMethods {

    @When("user provides {string}, valid {string} and validate {string}")
    public void user_provides_valid_and_validate(String Name, String Age, String Email) {
        sendText(rafflePage.name, Name);
        sendText(rafflePage.age, Age);
        sendText(rafflePage.email, Email);
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        click(rafflePage.submitButton);
    }

    @Then("user is successfully entered a raffle")
    public void user_is_successfully_entered_a_raffle() {
        Assert.assertTrue(rafflePage.confirmationAndnumberOfEntries.isDisplayed());
    }

    @When("user provides {string}, valid {string} ,validate {string} and {string}")
    public void user_provides_valid_validate_and(String Name, String Age, String Email, String Reason) {
        sendText(rafflePage.name, Name);
        sendText(rafflePage.age, Age);
        sendText(rafflePage.email, Email);
        sendText(rafflePage.reason, Reason);
    }

    @When("user  doesnt provide  {string}, valid {string} and validate {string}")
    public void user_doesnt_provide_valid_and_validate(String Name, String Age, String Email) {
        sendText(rafflePage.name, Name);
        sendText(rafflePage.age, Age);
        sendText(rafflePage.email, Email);
    }

    @When("user provides {string}, invalid {string} and validate {string}")
    public void user_provides_invalid_and_validate(String Name, String Age, String Email) {
        sendText(rafflePage.name, Name);
        sendText(rafflePage.age, Age);
        sendText(rafflePage.email, Email);
    }

    @When("user provides {string}, {string} and {string} is not validated")
    public void user_provides_and_is_not_validated(String Name, String Age, String Email) {
        sendText(rafflePage.name, Name);
        sendText(rafflePage.age, Age);
        sendText(rafflePage.email, Email);
    }

    @Then("user refreshes the page to enter the raffle again")
    public void user_refreshes_the_page_to_enter_the_raffle_again() {
        rafflePage.refresh();
    }

    @When("user  doesnt provide {string}, with valid {string} and {string}")
    public void user_doesnt_provide_with_valid_and(String Name, String Age, String Email) {
        sendText(rafflePage.name, Name);
        sendText(rafflePage.age, Age);
        sendText(rafflePage.email, Email);
    }

    @When("user  doesnt provides {string} with valid {string} and {string}")
    public void user_doesnt_provides_with_valid_and(String Age, String Name, String Email) {
        sendText(rafflePage.name, Name);
        sendText(rafflePage.age, Age);
        sendText(rafflePage.email, Email);
    }

    @Then("user failed to enter a raffle")
    public void user_failed_to_enter_a_raffle() {
        Assert.assertTrue(rafflePage.EnterChanceToWinText.isDisplayed());
    }

    @Then("user see text {string}")
    public void user_see(String text) {
        String actualText = rafflePage.mustBe18Text.getText();
        Assert.assertEquals(text, actualText);
    }

    @Then("user has to re-enter email")
    public void user_has_to_re_enter_email() {
        String emailText = rafflePage.email.getText();
        Assert.assertTrue(emailText.equals(""));
    }

    @Then("user see submission confirmed text with number of entries")
    public void user_see_submission_confirmed_text_with_number_of_entries() {
        Assert.assertTrue(rafflePage.confirmationAndnumberOfEntries.isDisplayed());
    }

    @Then("user stays on the landing page")
    public void user_stays_on_the_landing_page() {
        Assert.assertTrue(rafflePage.submitButton.isDisplayed());
    }


}
