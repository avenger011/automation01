import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class auto7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> str=driver.findElements(By.xpath("//*[@id=\"navbarNav\"]/ul[1]"));

        for(WebElement st:str)
        {
            st.click();
            System.out.println(st.getText());


        }

    }
}
