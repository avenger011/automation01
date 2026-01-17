import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
                             // dropdown example
import java.sql.Driver;
import java.time.Duration;

public class auto13 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("http://eaapp.somee.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id=\"loginLink\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"UserName\" and @name=\"UserName\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id=\"Password\" and @name=\"Password\" and @type=\"password\"]")).sendKeys("password");
         driver.findElement(By.xpath("//input[@id=\"loginIn\" and @value=\"Log in\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Employee List\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Manage Users\"]")).click();
      WebElement dd= driver.findElement(By.xpath("//*[@id=\"RoleName\"]"));
      Select select=new Select(dd);
      select.selectByContainsVisibleText("Guest");
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[4]/input")).click();
    }}
