package com.saucedemo.steps;

import com.saucedemo.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import gherkin.lexer.Th;

public class ProductSteps {
    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String option) throws InterruptedException {

        new ProductPage().clickOnSortByDropDown_SelectHighToLow(option);

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {

        new ProductPage().selectingLowestAndHighest_PriceProduct();

    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {

        new ProductPage().clickOnCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ProductPage().clickOnCheckout();
    }
}