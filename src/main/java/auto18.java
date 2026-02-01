import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class auto18 {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@aria-label='Select Date of Journey. Current date: 01 Feb, 2026']")).click();
       String date="13";
       String monyth="january";
       String years="2029";



        while(true)
        { WebElement str=driver.findElement(By.xpath("(//p[@class='monthYear___f6ba90'])[1]"));
            String fundmondate=str.getText();
            String[] fundmondate2=fundmondate.split(" ");
            System.out.println(fundmondate2[0]+" "+fundmondate2[1]);
            String Fmonth=fundmondate2[0];
            String Fyear=fundmondate2[1];
            if(Fmonth.equalsIgnoreCase(monyth) && Fyear.equalsIgnoreCase(years))
            {break;}

           else{
               driver.findElement(By.xpath("//i[@class=\"icon icon-arrow arrow___d574fb right___8f9055 \" and @role=\"button\"]")).click();




           }
            List<WebElement> ss= driver.findElements(By.xpath("//div[@role='row']/li[@class=\"dateItem___3dae08 date\"]"));
            for(WebElement s:ss)
            {   if(s.getText().equalsIgnoreCase(date))
            { s.click();
                break;}

            }

        }
    }
}
