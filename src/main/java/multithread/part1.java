package multithread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class part1 implements Runnable{
   private String browser;



    public part1(String browser) {
        this.browser = browser;
    }

    @Override
    public void run(){
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")) {
            // Ensure chromedriver is in your PATH or set system property
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Ensure geckodriver is in your PATH or set system property
            driver = new FirefoxDriver();
        }

        if (driver != null) {
            driver.get("https://www.google.com");
            driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys("dog kannada seleb");
            driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).submit();
            System.out.println(browser + " opened Google on Thread: " + Thread.currentThread().getId());
            // driver.quit(); // Uncomment to close after opening
        }





    }



}
class part2{
    public static void main(String[] args){

        Thread t1 = new Thread(new part1("chrome"));
        Thread t2 = new Thread(new part1("firefox"));

        t1.start();
        t2.start();
    }


    }

