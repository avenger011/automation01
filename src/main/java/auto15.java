import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
//                         handeling search /element like autogenerating

public class auto15 {
    public static void main(String[] args){


        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("banglore to ");
        List<WebElement> st=driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul[@class=\"G43f7e\"]/li[@data-attrid=\"AutocompletePrediction\"]"));
       for(WebElement s:st)
       {
          if( s.getText().contains("flight"))
          {s.click();}
       }


    }
}
