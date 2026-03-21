package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjectModel.LoginTests;
import waitHelper.propertyReader;

public class testPOM {

    WebDriver driver=new ChromeDriver();


    @Test
    public void test1(){
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        LoginTests loginTests=new LoginTests(driver);
        loginTests.Login(propertyReader.readKey("user"),propertyReader.readKey("pass"));
    }















}
