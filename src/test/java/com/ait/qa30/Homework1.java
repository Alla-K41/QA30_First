package com.ait.qa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework1 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
                driver.get("https://demowebshop.tricentis.com/");
                driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByCss(){

        driver.findElement(By.cssSelector("h1"));
        //id
        driver.findElement(By.cssSelector("#bar-notification"));

        //className
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        //attr - par == [attr='par']
        driver.findElement(By.cssSelector("[value=\"Search store\"]"));
    }
    @Test
    public void findElementByXpath() {
        //  //tag[@attr='par']
        //id == //tag[@id='par']

        driver.findElement(By.xpath("//span[@class='close']"));
        //className == //tag[@class='par']

        driver.findElement(By.xpath("//label[@class='input-label'"));
        //contains //tag[contains(.,'Text')]
        driver.findElement(By.xpath("span[@class='close']"));
        driver.findElement(By.xpath("//*[text()='Register']"));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

