import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;       //frames

public class auto14 {
public static void main(String[] args) throws InterruptedException {

    WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().window().maximize();
    driver.navigate().to("https://ui.vision/demo/webtest/frames/");
    WebElement fr1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
    driver.switchTo().frame(fr1);
    driver.findElement(By.xpath("//input[@name=\"mytext1\" and @size=\"25\" ]")).sendKeys("sg wrote this");
    driver.switchTo().defaultContent();
    WebElement fr2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
    driver.switchTo().frame(fr2);
    WebElement ss=driver.findElement(By.xpath("//input[@name=\"mytext2\"]"));
    ss.sendKeys("hellow");
    driver.switchTo().defaultContent();
    WebElement fr3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
    driver.switchTo().frame(fr3);
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//div[@class=\"vd3tt\"]/div[@class=\"AB7Lab Id5V1\"]")).click();
   driver.findElement(By.xpath("//span[@class=\"vRMGwf oJeWuf\" and text()=\"Choose\"]")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@data-value=\"Yes\"]")).click();


//data-value="Well, now I know :-)"

}
}
