package mutiTdAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class p1 implements Runnable {
    public String browser;

      public p1(String browser)
    { this.browser=browser;}


    @Override
    public void run(){
        WebDriver driver=null;
        if(browser.equalsIgnoreCase("chrome")) {
        driver=new ChromeDriver();}
        else if(browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();}

        if(driver!=null)
        {
            driver.get("https://www.google.com");
            driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys("dog kannada seleb");
           driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).submit();
           System.out.println(browser + " opened Google on Thread: " + Thread.currentThread().getId());

             //driver.quit();
        }



        }

    }


