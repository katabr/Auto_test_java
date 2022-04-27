package com.luxoft.pages;

import org.openqa.selenium.support.ByIdOrName;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class TimetablePage extends CommonPage{
    WebDriver driver;

//    @FindBy(xpath = "//a[contains(text(), listButtons)]")
//    List<WebElement> Buttons;

//    @FindBy(xpath = "//a[contains(text(), 'Расписание')]")
//    WebElement LinkTimetable;


    @FindBy(xpath = "//a[contains(text(), 'Расписание')]")
    WebElement Button1;

    @FindBy(xpath = "//a[contains(text(), 'Бесплатные семинары')]")
    WebElement Button2;

    @FindBy(xpath = "//a[contains(text(), 'On-line курсы')]")
    WebElement Button3;

//
//    public TimetablePage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    @Step("click timetable link")
//    public void GoToTimetablePage(){
//        LinkTimetable.click();
//
//    }
//
//    @Step("check search button Расписание")
//    public void checkSearchButton1Displayed(){
//        assertThat(Button1.isDisplayed(), equalTo(true));
//
//    @Step("check search button Бесплатные семинарыэ")
//    public void checkSearchButton2Displayed(){
//            assertThat(Button2.isDisplayed(), equalTo(true));
//
//    @Step("check search button ОнЛайн курсы")
//    public void checkSearchButton3Displayed(){
//            assertThat(Button3.isDisplayed(), equalTo(true));
//
////    public WebElement getElement(String button){
////        WebElement elem = null;
////        switch(name){
////            case "logo":
////                elem = driver.findElement(By.className("logo")); break;
////        }
////        return elem;
////    }



     ArrayList buttons = new ArrayList<>(Button1, Button2, Button3);


    public boolean verifyButtons(ArrayList<String> buttons){
        List<WebElement> Buttons = driver.findElements(FindBy.xpath("//*[@class='addition-menu']/li/a"));
        for(WebElement we:Buttons){
            if(!buttons.contains(we.getText()))
                return false;
        }
        return true;
    }
}







