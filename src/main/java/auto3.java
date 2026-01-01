import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto3 {
    public static void main(String[] args){
        //netflix forgot password automation
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("saiganesh@gmail.com");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("posgg");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.cssSelector("div.default-ltr-iqcdef-cache-7y4fmk")).click();




    }
}
