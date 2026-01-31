package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class runnerclass extends secondpart {
    runnerclass(){
        //driver.findElement(By.xpath("//div[@class=\"u4Uk3c\"]")).click();
   List<WebElement> sr= driver.findElements(By.xpath("//div[@class=\"erkvQe\"]/div[@role=\"presentation\"]/ul[@role=\"listbox\"]/li"));
   for(WebElement s:sr)
   {
       if(s.getText().contains("satish"))
       {s.click();}
   }
   driver.findElement(By.xpath("//div[@class=\"mXwfNd\"]/span[text()=\"Images\"]")).click();
    }
    public static void main(String[] args){
    runnerclass r1=new runnerclass();

    }
}
