package com.saucedemo.steps;

import com.saucedemo.pages.CheckOutPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CheckoutSteps {
    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String first_name, String last_name, String postCode) throws Throwable {

        new CheckOutPage().enterFirstName(first_name);
        new CheckOutPage().enterLastName(last_name);
        new CheckOutPage().enterPostCode(postCode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {

        new CheckOutPage().clickOnContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishButton();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String message) {
        Assert.assertEquals("You have not completed order successfully", message, new CheckOutPage().getOrderCompletedMessage());
    }
}
