import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class auto12 {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/cr-decals-designs-axor-retro-dominator-dull-black-helmet-motorbike/p/itm8759f35fc308f");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div")).click();
        Set<String> str=driver.getWindowHandles();//storing tab ids in Set
        List<String> str2=new ArrayList<>(str); //converting set to list , so that we can accees by index using  get()
        driver.switchTo().window(str2.get(0));
        driver.close();  // we are trying to close the one of the two tab , utilizing the tab id{windowHandel}
         driver.switchTo().window(str2.get(1));
         String st=driver.getTitle();
          System.out.println(st) ;
           Alert myalert=driver.switchTo().alert();
           String s=myalert.getText();
           myalert.accept();


    }
}
