package TestSG.login;

import TestSG.Util.waitHelperrr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import waitHelper.WaitHelper;

import java.util.List;

public  class login {
   By search=By.xpath("(//input[@placeholder='Search any Location, City, State or Country'])[1]");
     By Dropdown=By.xpath("//div[@class='results flex gap-[1rem] flex-col w-full']/a[@data-search-type=\"stateId\"]");
     By x=By.xpath("//*[name()='path' and contains(@d,'M19.7076 1')]");

public void p1(WebDriver driver){
    waitHelperrr.waitt(driver,x);
    driver.findElement(x).click();
    driver.findElement(search).sendKeys("Delhi");
    List<WebElement> ddlist=driver.findElements(Dropdown);


}
}
