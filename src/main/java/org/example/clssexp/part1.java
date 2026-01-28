package org.example.clssexp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class part1{

    protected WebDriver driver;
    part1(){
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();


}}