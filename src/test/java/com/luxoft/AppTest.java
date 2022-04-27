package com.luxoft;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.luxoft.Hooks.createDriver;





@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/luxoft/features",
        glue = "com.luxoft.steps",
        tags = "@task2",
        dryRun = false,
        strict = true,
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "json:target/cucumber3.json",
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
        }
)





public class AppTest {

//        @BeforeClass
//        public static void startDriver(){
//                createDriver();
//        }
//
//        @AfterClass
//        public static void tearDown(){
//                auxillary.getDriver().get().quit();
//        }




//        @Given("'home page' page is opened")
//        public void
        @When("user go to \"timetable\" page")
        clickContactLink();
        @Then("page contains button(.*)$")
        checkSearchButton1Displayed();
        checkSearchButton2Displayed();
        checkSearchButton3Displayed();


        public static void getPrint() {
            System.out.println("test ends");
        }


}
