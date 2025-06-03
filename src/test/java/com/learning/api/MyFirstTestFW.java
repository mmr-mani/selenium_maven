package com.learning.api;

import com.learning.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyFirstTestFW extends BaseTest {

    @Test(dataProvider = "loginData")
    public static void LoginTest(String userName) throws InterruptedException {
        driver.findElement(By.linkText("Sign In")).click(); // locators -- properties
        Thread.sleep(3000);
        driver.findElement(By.id("login_id")).sendKeys(userName); // locators -- properties
        Thread.sleep(3000);
        driver.findElement(By.id("nextbtn")).click(); // locators -- properties
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"mareddy1@mail.com"},
                {"mareddy2@mail.com"}
        };
    }
}