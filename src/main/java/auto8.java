import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class auto8 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/onetap/?next=%2F&hl=en");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input")).sendKeys("mr._sandeepp");
        Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[2]/div/label/input")).sendKeys("samsung01");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_QE\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/span/div/a/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_hs\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/input")).sendKeys("sai_ganesh_01");
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_hs\"]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/a/div[1]/div/div")).click();

    }
}
