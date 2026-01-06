import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.time.Duration;

public class auto6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.orangehrm.com/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[1]/li[5]/a")).click();



        driver.navigate().to("https://www.orangehrm.com/en/pricing");
        Thread.sleep(5000);
        driver.navigate().back();



    }

}
