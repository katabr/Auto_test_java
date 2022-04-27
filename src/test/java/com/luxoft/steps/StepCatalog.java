package com.luxoft.steps;

import com.luxoft.pages.CatalogPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.util.List;


public abstract class StepCatalog<string> extends CatalogPage {


//    @Given("Home page {string} is opened")
//    @Step("Page {string} is opened")
//    public void home_page_is_opened(String arg0) {
//    }

    @When("user goes to Catalog page")
    @And("user requests SQA-050")
    @Step("Click Catalog link")
    @Override
    public void clickCatalogLink() {
        super.clickCatalogLink();
    }



    @Step("Requests SQA-050")
    @Override
    public void sendKeysNameCourse(string, Object string){
        super.sendKeysNameCourse(string);
    }



    @Then("page contains CourseLink")
    @Step("Check CourseLink")
    public void page_contains_course_link(List<String> CourseLink) {
        Assertions.assertTrue(com.luxoft.pages.CatalogPage.verifyCourseLink(CourseLink));
    }


}
