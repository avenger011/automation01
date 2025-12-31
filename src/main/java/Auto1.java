import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto1 {
    public static void main(String[] args){
        {
            WebDriver driver=new ChromeDriver();
            driver.get( "https://courses.thetestingacademy.com/" );
            driver.manage().window().maximize();
            driver.findElement(By.linkText("ALL COURSES")).click();
            driver.findElement(By.className("zen-course-thumbnail")).click();
            driver.findElement(By.linkText("Sign In")).click();
        }

    }
}
