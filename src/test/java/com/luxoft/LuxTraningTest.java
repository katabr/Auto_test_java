package com.luxoft;

//package com.luxoft.web;
import com.luxoft.pages.HomePage;
import com.luxoft.pages.SetUp;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;


//public class LuxTraningTest extends SetUp  {

    //private static final HomePage homePage = new HomePage(driver);
    //private final HomePage homePage = new HomePage(driver);


//
//
//    //verifySignInForm//
//    @Test1
//    public static void verifySignInForm(){
//        LuxTraningTest loginForm;
//        loginForm.verifySignInForm();
//    Assertions.assertTrue(loginForm.verifySignInForm(  ));
//
//
//     //verifyMainMenuItems
//    @Test
//    public static void verifyMainMenuItems(){
//    //homePage.checkSearchButtonDisplayed();
//        homePage. verifyMainMenuItems();
//        Assertions.assertTrue(homePage.verifyMainMenuItems(
//            Arrays.asList("HOME","INSIGHTS","SERVICES","INDUSTRIES","CAREERS","CONTACT US")
//    ));
//
//    //verifyMainMenuItemsParam
//    @ParameterizedTest
//    @CsvFileSource(resources = "/testDataMainMenu.csv", delimiter = ';', numLinesToSkip = 3)
//    void boolean verifyMainMenuItems(){
//        //homePage.checkSearchButtonDisplayed();
//        homePage. verifyMainMenuItems();
//
//                Assertions.assertEquals(homePage.verifyMainMenuItems(), homePage.menuItems);
//
//
//
//    }
//

public class LuxTraningTest {

    private static WebDriver driver;
    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    void testSearch(){
        driver.get ("https://www.luxoft-training.ru/");
        WebElement search = driver.findElement(By.linkText("Расписание"));
        search.click();
    }
}



