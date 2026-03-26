package TestSG.login;

import TestSG.Util.waithelp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public  class mainLogin {

    static By search=By.xpath("(//input[@placeholder='Search any Location, City, State or Country'])[1]");
    static By Dropdown=By.xpath("//div[@class='results flex gap-[1rem] flex-col w-full']/a[@data-search-type=\"stateId\"]");
    static By x=By.xpath("//*[name()='path' and contains(@d,'M19.7076 1')]");

    public static void proces1(WebDriver driver)
    {  waithelp wh=new waithelp();
        wh.visbwait(driver,10,x);
        driver.findElement(x).click();
       driver.findElement(search).sendKeys("Delhi");
        List<WebElement> ddlist=driver.findElements(Dropdown);


    }











}
