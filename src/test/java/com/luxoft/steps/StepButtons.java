package com.luxoft.steps;
import com.luxoft.pages.TimetablePage;
import com.luxoft.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.luxoft.Hooks.auxillary;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class StepButtons {

    String button = "Расписание";

    @FindBy(xpath = "//a[contains(text(), 'Расписание')]")
    WebElement LinkTimetable;

    @FindBy(xpath = "//a[contains(text(), 'Расписание')]")
    WebElement Button1;

    @FindBy(xpath = "//a[contains(text(), 'Бесплатные семинары')]")
    WebElement Button2;

    @FindBy(xpath = "//a[contains(text(), 'On-line курсы')]")
    WebElement Button3;

    private HomePage homePage = new HomePage(auxillary.getDriver().get());

    @Given("{string} page is opened")
    public void home_page_is_opened(String arg0) {
    }

    }



    @When("User go to Timetable")
    @Step("click timetable link")

    public HomePage LinkTimetable(){
        LinkTimetable.click();

    }

    @Then("page contains button")

    public void main_menu_contain(List<String> buttons) {
        Assertions.assertTrue(TimetablePage.verifyButtons(buttons));
    }




//    @Step("check search button Расписание")
//    public void checkSearchButton1Displayed(){
//        assertThat(Button1.isDisplayed(), equalTo(true));
//
//    @Step("check search button Бесплатные семинарыэ")
//    public void checkSearchButton2Displayed(){
//        assertThat(Button2.isDisplayed(), equalTo(true));
//
//    @Step("check search button ОнЛайн курсы")
//    public void checkSearchButton3Displayed(){
//        assertThat(Button3.isDisplayed(), equalTo(true));

}
