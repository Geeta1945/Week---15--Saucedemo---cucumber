package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postcode;
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continue_Button;


    @FindBy(xpath = "//button[@id='finish']")
    WebElement finish_Button;

    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement completeOrder_Message;


    public void enterFirstName(String myFirstName) {

        sendTextToElement(firstName, myFirstName);
        log.info("Entering first name: " + myFirstName.toString());


    }

    public void enterLastName(String myLastName) {

        sendTextToElement(lastName, myLastName);
        log.info("Entering last name: " + myLastName.toString());

    }

    public void enterPostCode(String myPostCode) {

        sendTextToElement(postcode, myPostCode);
        log.info("Entering postcode: " + myPostCode.toString());
    }

    public void clickOnContinueButton() {

        clickOnElement(continue_Button);
        log.info("Clicking on continue  button : " + continue_Button.toString());
    }

    public void clickOnFinishButton() {

        clickOnElement(finish_Button);
        log.info("Clicking on finish  button : " + finish_Button.toString());
    }

    public String getOrderCompletedMessage() {
        log.info("getting Order completed message : " + completeOrder_Message.toString());
        return getTextFromElement(completeOrder_Message);
    }

}
