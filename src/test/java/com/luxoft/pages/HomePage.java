package com.luxoft.pages;

import com.luxoft.pages.LoginForm;
import com.luxoft.pages.HomePage;
import com.luxoft.pages.SetUp;
import com.luxoft.pages.LoginForm;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
//import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends CommonPage{
    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(href = "/timetable/")
    WebElement timeTable;




    @FindBy(id = "form_CONTACT_NAME")
    WebElement firstNameField;

    @FindBy(id = "form_CONTACT_LAST_NAME")
    WebElement lastNameField;

    @FindBy(xpath = "//div[@class='inner__info']/h4")
    WebElement smallHeader;

    //@Step("set name {1}")
    public HomePage setName(String firstName, String lastName){
        firstNameField.clear();
        firstNameField.sendKeys(Keys.CONTROL + "v");
        lastNameField.sendKeys(lastName);
        return this;
    }

    //@Step("check data {lastName} - {firstName}")
    public HomePage verifyData(String firstName, String lastName){
        System.out.println(firstNameField.getCssValue("font-size"));
        System.out.println(smallHeader.getText());
        Assertions.assertAll(
                ()->assertEquals(firstNameField.getAttribute("value"), firstName),
                ()->assertEquals(lastNameField.getAttribute("value"), lastName),
                ()->assertTrue(lastNameField.getAttribute("data-validation-length").equalsIgnoreCase("max60"))
        );
        return this;
    }

// описание страницы Главного меню

    @FindBy(className = "header__menu")
    WebElement headerMenu;

    @FindBy(xpath = "//span[@class='icomoon-search']")
    WebElement searchButton;

    @FindBy(linkText = "HOME")
    WebElement homeLink;

    @FindBy(linkText = "CONTACT US")
    WebElement contactLink;

    @FindBy(xpath = "//a[text()='Report copyright violation']")
    WebElement violationLink;

    @FindBy(xpath = "//*[@class='header__menu']/ul/li/a")
    public
    List<WebElement> menuItems;

    @FindAll(
            {
                    @FindBy(css = ".switchAll"),
                    @FindBy(id = "menu-switcher")
            }
    )
    WebElement menuSwitcher;

    @FindBy(id = "CybotCookiebotDialogBodyButtonAccept")
    WebElement acceptCookies;

    @FindBy(xpath = "//a[contains(text(),'About us')]")
    List<WebElement> aboutUsLinks;

//    @Step("check search button")
//    public void checkSearchButtonDisplayed(){
//        assertThat(searchButton.isDisplayed(), equalTo(true));
//        assertThat(menuSwitcher.isDisplayed(), equalTo(true));
//    }

    @Step("проверить что в меню отображаются {items}")
    public boolean verifyMainMenuItems(List<String> items){
        for(WebElement we:menuItems){
            if(!items.contains(we.getText()))
                return false;
        }
        return true;
    }

    @Step("click contact link")
    public HomePage clickContactLink(){
        contactLink.click();
        return this;
    }







}
