import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Auto10 {

    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/cr-decals-designs-axor-retro-dominator-dull-black-helmet-motorbike/p/itm8759f35fc308f");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/a/span")).click();
         driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div")).click();
        Set<String> str=driver.getWindowHandles();
        System.out.println(str);
        String str2=driver.getWindowHandle();
        str.remove(str2);
        driver.switchTo(str);
        System.out.println(str2);

    }
}
