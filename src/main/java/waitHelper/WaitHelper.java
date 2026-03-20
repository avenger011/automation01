package waitHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

    public static void visibleWait(WebDriver driver, int time, By element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
         wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }







}
