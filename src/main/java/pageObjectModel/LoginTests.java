package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import waitHelper.WaitHelper;

public class LoginTests {



    WebDriver driver;

    public LoginTests(WebDriver driver)
    {
        this.driver=driver;
    }

    By username= By.xpath("//input[@name=\"username\"]");
    By pass=By.xpath("//input[@name=\"password\"]");
    By subButton=By.xpath("//button[@type=\"submit\"]");


    public void Login(String name,String password){
        //driver.findElement(username).sendKeys(name);
        waitHelper.WaitHelper.visibleWait(driver,5,username);
        driver.findElement(pass).sendKeys(password);

        waitHelper.WaitHelper.visibleWait(driver,5,subButton);
    }
}
