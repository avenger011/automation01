import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class auto17 {
    public static void main (String [] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://track.thetestingacademy.com/student/live-test");
        driver.manage().window().maximize();
        List<WebElement> ss=driver.findElements(By.xpath("//div[@class=\"flex items-center gap-1 ml-1\"]/button"));
        for(WebElement s:ss)
        {s.click();
        Thread.sleep(500);
        }
    }
}
