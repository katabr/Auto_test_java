package com.luxoft.steps;

import com.luxoft.pages.ContactPage;
import com.luxoft.pages.HomePage;
import com.luxoft.pages.TimetablePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.List;


public abstract class StepCity extends HomePage {

        public StepCity(WebDriver driver) {
            super(driver);
        }

    @Given("Home page {string} is opened")
    @Step("Page {string} is opened")
    public void home_page_is_opened(String arg0) {
    }

    @When("user go to Contacts page")
    @Step("Click timetable link")
    @Override
    public void clickContactLink(){
        super.clickContactLink();
    };

    //@Then("^Page contains city (.*)$")
    @Then("^page (contains|does not contain) <City>$")
    @Step("Check able city ")
    public void page_contain_or_not(List<String> city) {
        Assertions.assertTrue(ContactPage.verifyCity(city));
    }


}
