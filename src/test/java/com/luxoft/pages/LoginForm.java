package com.luxoft.pages;

import com.luxoft.pages.HomePage;
import com.luxoft.pages.SetUp;
import com.luxoft.pages.LoginForm;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
//import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginForm extends HomePage {
        //private final WebDriver driver;
        private WebDriver driver;

        public LoginForm LoginForm(WebDriver driver, CharSequence lastName, String firstName) {
            this.driver = driver;
            PageFactory.initElements(driver, this);


        //private WebDriver driver;

        @FindBy(id = "form_CONTACT_NAME")
        WebElement firstNameField;

        @FindBy(id = "form_CONTACT_LAST_NAME")
        WebElement lastNameField;

        @FindBy(xpath = "//div[@class='inner__info']/h4")
        WebElement smallHeader;

        public LoginForm setName(String firstName,  String lastName){
        firstNameField.clear();
        firstNameField.sendKeys(Keys.CONTROL + "v");
        lastNameField.sendKeys(lastName);
        return this;
    }

        public LoginForm verifySignInForm(String firstName, String lastName){
        System.out.println(firstNameField.getCssValue("font-size"));
        System.out.println(smallHeader.getText());
        Assertions.assertAll(
                ()->assertEquals(firstNameField.getAttribute("value"), firstName),
                ()->assertEquals(lastNameField.getAttribute("value"), lastName),
                ()->assertTrue(lastNameField.getAttribute("data-validation-length").equalsIgnoreCase("max60"))
        );
        return this;
    }




}
