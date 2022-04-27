package com.luxoft.pages;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public abstract class CatalogPage<string> extends CommonPage{
    private final WebDriver driver;
    public CatalogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Каталог")
    WebElement CatalogPage;




    // Перейти на страницу Каталог
    public void clickCatalogLink(){
        CatalogPage.click(); }



    @FindBy(xpath = "//a[contains(text(), 'По направлениям')]")
    WebElement SearchField;

    @ParameterizedTest
    @MethodSource(String string = "SQA-050", "SQA-051" )

    public void sendKeysNameCourse(<string>, Object string) {

    // Ввести в поле поиска SQA-050
    //public void sendKeysNameCourse(){
//        Action builder = new Action(driver);
//        builder.clear(SearchField).sendKeys("SQA-050").sendKeys(Keys.ENTER).perform();
        SearchField.click();
        SearchField.clear();
        SearchField.sendKeys(<string>);
        SearchField.sendKeys(Keys.ENTER);

    }

    @FindBy(xpath = "//a[contains(text(), 'SQA-05(0|1)')]")
    WebElement courseLink;

    protected static boolean verifyCourseLink(List<String> courseLink) {
        assertThat(courseLink.isDisplayed());

    }


}
