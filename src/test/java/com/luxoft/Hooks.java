package com.luxoft;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.W3CHttpCommandCodec;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver = null;
    public static String browser = "chrome";
    public static String baseURL = "https://www.luxoft-training.ru/ ";

//    public static Auxillary auxillary = new Auxillary();
//    @Before()
//    public void startDriver(){
//        if(auxillary.getDriver().get() == null) {
//            createDriver();
//        }
//    }

    @Before
    public static void createDriver(){
        createDriver(browser);
        OpenURL(baseURL);
        }


    public static void createDriver(final String browserID){
        if (browserID.equalsIgnoreCase("chrome"))
            {driver = new ChromeDriver();}
            }

    public static void OpenURL(String baseURL){
        driver.manage().window().maximize();
        driver(baseURL);}



    @After
    public void tearDown(){
        System.out.println("Inside After");
        driver.quit();
    }
}