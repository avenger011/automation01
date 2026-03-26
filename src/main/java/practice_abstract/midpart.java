package practice_abstract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

 class midpart extends start{
    midpart() throws InterruptedException {
        driver.findElement(By.xpath("//form[@action=\"/results\"]/input[@name=\"search_query\"]")).sendKeys("arpitbala");
       driver.findElement(By.xpath("//button[@title='Search']")).click();
       Thread.sleep(7000);
      List <WebElement> str=driver.findElements(By.xpath("//a[@id=\"video-title\"]/yt-formatted-string[@class=\"style-scope ytd-video-renderer\"]"));
       for(WebElement s:str)
       {
           if(s.getText().contains("Prakhar Gupta x Arpit Bala"))
           {
               s.click();
           }

       }

    }

}
