$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4008626100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 135072200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "LoginSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 277560600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 20331779200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "ProductSteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 4264615200,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 135916900,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 82594100,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 84400000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "CheckoutSteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 327404500,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 97403300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 90105100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 33
    }
  ],
  "location": "CheckoutSteps.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 46571500,
  "status": "passed"
});
formatter.after({
  "duration": 740524500,
  "status": "passed"
});
});