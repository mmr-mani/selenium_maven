package com.learning.api;

import com.learning.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class MyFirstTest {

    @BeforeTest
    public void LoginIntoApp(){
        System.out.println("LoginIntoApp");
    }

    @AfterTest
    public void LoginOutApp(){
        System.out.println("LoginIntoApp");
    }

    @BeforeMethod
    public void ConnectToDB(){
        System.out.println("ConnectToDB");
    }

    @AfterMethod
    public void DisconnectToDB(){
        System.out.println("DisConnect from DB");
    }

    @Test(groups = "smoke")
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = {"smoke","regression"})
    public void test2(){
        System.out.println("test2");
    }

    @Test(groups = {"smoke","regression"})
    public void test3(){
        System.out.println("test3");
    }

    @Test(groups = "regression")
    public void test4(){
        System.out.println("test4");
    }

}
