import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto4 {
    // change language udsing relative xpath
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.netflix.com/in/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.findElement(By.cssSelector("input[name=\"userLoginId\"]")).sendKeys("saiganesh@tcs.com");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("12334567890");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        driver.findElement(By.xpath("//a[text( )='Forgot password?']")).click();
        driver.findElement(By.xpath("//input[@value='text']")).click();









    }
}
