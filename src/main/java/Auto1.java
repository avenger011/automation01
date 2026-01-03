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
            driver.findElement(By.xpath("//*[@id=\"timeline-0-milestone-content-0\"]/ul/li[11]/span/a")).click();
            String str=driver.findElement(By.xpath("//li[@id=\"sectionName\"]")).getText();
            System.out.println(str);

            //*[@id="player"]/div[5]/div[6]/div[1]/button
        }

    }
}
