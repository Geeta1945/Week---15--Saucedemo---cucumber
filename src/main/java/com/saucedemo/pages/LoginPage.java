package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;


    public void enterUsername(String userName) {

        sendTextToElement(username, userName);
        log.info("Entering username : " + userName.toString());
    }

    public void sendPassword(String enterPassword) {
        sendTextToElement(password, enterPassword);
        log.info("Entering password : " + password.toString());
    }

    public void clickOnLoginButton() {

        mouseHoverToElementAndClick(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());
    }
}
