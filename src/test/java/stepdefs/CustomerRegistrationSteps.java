package stepdefs;

import Context.TestContext;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CustomerRegistrationPage;

public class CustomerRegistrationSteps {

    TestContext testContext;
    CustomerRegistrationPage customerRegistrationPage;

    public CustomerRegistrationSteps(TestContext context) {
        testContext = context;
        customerRegistrationPage = testContext.getPageObjectManager().getCustomerRegistrationPage();
    }

    @Given("^customer wishes to sign up for bill payment$")
    public void customer_wishes_to_sign_up_for_bill_payment() throws Throwable {
        Assert.assertTrue(customerRegistrationPage.displayLogo());
    }

    @When("^a valid email address is provided by the customer$")
    public void a_valid_email_address_is_provided_by_the_customer() throws Throwable {
        customerRegistrationPage.enterEmailAddress();
        customerRegistrationPage.clickContinueButton();
    }

    @Then("^a wallet is created and registered for the customer$")
    public void a_wallet_is_created_and_registered_for_the_customer() throws Throwable {
        Assert.assertTrue(customerRegistrationPage.walletDisplay());
    }

    @When("^a customer provides an invalid email address$")
    public void a_customer_provides_an_invalid_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^an appropriate error message is displayed$")
    public void an_appropriate_error_message_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^customer provides an email address that is already in the system$")
    public void customer_provides_an_email_address_that_is_already_in_the_system() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
