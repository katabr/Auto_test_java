package com.luxoft.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContactPage extends CommonPage{


    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(), 'Москва')]")
    WebElement City1;

    @FindBy(xpath = "//a[contains(text(), 'Санкт-Петербург')]")
    WebElement City2;

    @FindBy(xpath = "//a[contains(text(), 'Омск')]")
    WebElement City3;

    @FindBy(xpath = "//a[contains(text(), 'Екатеринбург')]")
    WebElement City4;


    @Override
    public WebElement getElement(String name) {
        return null;
    }

    ArrayList city = new ArrayList<>(City1, City2, City3, City4);


    public boolean verifyCity(ArrayList<String> city){

        List<WebElement> City = driver.findElements(FindBy.xpath("//*[@class='addition-menu']/li/a"));

        for(WebElement we:City){

            if(!city.contains(we.getText()))
                return false;
        }
        return true;
    }





}
