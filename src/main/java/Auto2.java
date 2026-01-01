import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto2 {
    public static void main (String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.thetestingacademy.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("ALL COURSES")).click();
        driver.findElement(By.partialLinkText("6x -Job Ready Python Automation")).click();
        driver.findElement(By.cssSelector("button.dynamic-button")).click();
        driver.findElement(By.cssSelector("button.zen-subscribe")).click();
        driver.findElement(By.linkText("Redeem Coupon")).click();
        //driver.findElement(By.cssSelector("input.form-control")).sendKeys("whyAreYouGay");
        driver.findElement(By.cssSelector("input#inputSuccess2")).sendKeys("whyAreYouGay");
        driver.findElement(By.cssSelector("a.dynamic-button")).click();
    }

    public static class Auto3 {
    }
}


