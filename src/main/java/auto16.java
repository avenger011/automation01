import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class auto16 {

    //find the aqi of banglore

    public static void main(String[] args){
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.aqi.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@placeholder='Search any Location, City, State or Country'])[1]")).sendKeys("delhi");
         List<WebElement> str=driver.findElements(By.xpath("//div[@class='results flex gap-[1rem] flex-col w-full']/a[@data-search-type=\"stateId\"]"));
        for(WebElement s:str)
        {
           if(s.getText().contains("Delhi"))
           {s.click();}

        }
        WebElement s11=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[1])[1]"));
        WebElement s12=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[2])[1]"));
        System.out.println("the aqi of "+s11.getText()+" "+s12.getText());

        WebElement s21=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[1])[2]"));
        WebElement s22=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[2])[2]"));
        System.out.println("the aqi of "+s21.getText()+" "+s22.getText());

        WebElement s31=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[1])[3]"));
        WebElement s32=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[2])[3]"));
        System.out.println("the aqi of "+s31.getText()+" "+s22.getText());

        WebElement s41=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[1])[4]"));
        WebElement s42=driver.findElement(By.xpath("(//div[@class=\"info w-full font-bold min-w-0\"]/p[2])[4]"));
        System.out.println("the aqi of "+s41.getText()+" "+s42.getText());

    }

}
