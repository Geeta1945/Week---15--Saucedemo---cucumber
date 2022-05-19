package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortProducts_DropDown;

    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElement> allProducts;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement highestPrice_AddToCart;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement lowestPrice_AddToCart;
    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    WebElement cart;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;



    public void clickOnSortByDropDown_SelectHighToLow(String option) throws InterruptedException {

        clickOnElement(sortProducts_DropDown);
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(sortProducts_DropDown,option);
       Thread.sleep(2000);

    }

    public void selectingLowestAndHighest_PriceProduct(){

    clickOnElement(highestPrice_AddToCart);
    clickOnElement(lowestPrice_AddToCart);


    }
    public void clickOnCart(){
        clickOnElement(cart);
    }
    public void clickOnCheckout(){
        clickOnElement(checkout);
    }







}
