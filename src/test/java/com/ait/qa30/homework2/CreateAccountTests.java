package com.ait.qa30.homework2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void createNewAccountPositiveTest() {
        //click on Login link
        driver.findElement(By.cssSelector("[href='/login']")).click();
        //enter email
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("allakarlovic@gmail.com");
        //enter password
           driver.findElement(By.name("Password")).click();
           driver.findElement(By.name("Password")).clear();
           driver.findElement(By.name("Password")).sendKeys("15061982a$");
        driver.findElement(By.cssSelector("[href='/customer/info']")).click();

         // Assert.assertTrue(isElementPresent(By.cssSelector("button")));


    }

    public boolean isElementPresent(By button) {
        return false;
    }
}

