package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }


    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password)  {

        new LoginPage().enterUsername(username);
        new LoginPage().sendPassword(password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {

        new LoginPage().clickOnLoginButton();
    }
}
