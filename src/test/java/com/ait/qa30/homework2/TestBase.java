package com.ait.qa30.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com");

        //maximize browser to window
        driver.manage().window().maximize();
        //wait for all elements on the website to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
   // @Test
   // public void demowebscop(){

    //}

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();


    }
}
