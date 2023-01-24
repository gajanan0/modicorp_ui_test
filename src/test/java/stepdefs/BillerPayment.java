package stepdefs;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class BillerPayment {

    @When("^they want to transfer funds to their wallet$")
    public void they_want_to_transfer_funds_to_their_wallet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^they should have the option to add funds to their wallet$")
    public void they_should_have_the_option_to_add_funds_to_their_wallet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^customer wants to pay bill$")
    public void customer_wants_to_pay_bill() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^customer selects the biller$")
    public void customer_selects_the_biller() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^they should get unpaid bill for the month$")
    public void they_should_get_unpaid_bill_for_the_month() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^customer has selected a bill$")
    public void customer_has_selected_a_bill() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^a customer selects the pay bill option$")
    public void a_customer_selects_the_pay_bill_option() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the bill should be paid$")
    public void the_bill_should_be_paid() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("customer selects the {string} to pay against the {string} for a given {string}")
    public void the_bill_should_be_paid_multiple() {
        System.out.println("multiple bill payment step");
    }

    @Then("^the amount deducted from the wallet and credited to the biller account$")
    public void the_amount_deducted_from_the_wallet_and_credited_to_the_biller_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^a customer selects the pay bill option with less or zero wallet balance$")
    public void a_customer_selects_the_pay_bill_option_with_less_or_zero_wallet_balance() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the bill should not be paid$")
    public void the_bill_should_not_be_paid() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^an appropriate error message related insufficient wallet balance is displayed$")
    public void an_appropriate_error_message_related_insufficient_wallet_balance_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^customer wants to pay bill for already paid month$")
    public void customer_wants_to_pay_bill_for_already_paid_month() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^an appropriate informative message is displayed for already paid bill$")
    public void an_appropriate_informative_message_is_displayed_for_already_paid_bill() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^customer try to search biller \\(who is not in biller list\\)$")
    public void customer_try_to_search_biller_who_is_not_in_biller_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
