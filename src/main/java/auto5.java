import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class auto5 {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
//        driver.get("https://zoom.earth/maps/satellite/#view=22.22,78.49,5z/place=33.041824,76.042969");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button.geolocation")).click();



        String temp=driver.findElement(By.xpath("/html/body/main/aside[4]/section/table/tbody/tr[1]/td[3]")).getText();








    }
}
