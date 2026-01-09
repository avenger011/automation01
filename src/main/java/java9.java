import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// to get the titel of all the web page visited using webhandles
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class java9 {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver=new ChromeDriver();
        URL link=new URL("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7696604824279790624&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9214383&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to(link);
        String str=driver.getWindowHandle();
        System.out.println(str);
        driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]")).sendKeys("laptop");
        driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\" and @type=\"submit\" ]")).click();
        driver.findElement(By.xpath("//span[text()=\"HP 15, AMD Ryzen 3 7320U (8GB DDR4, 512GB SSD) FHD, Anti-Glare, Micro-Edge, 15.6''/39.6cm, Win11, M365 Basic(1yr)* Office24, Silver, 1.59kg, fc0500AU, FHD Camera w/Privacy Shutter Laptop\"]")).click();
         Set<String> stSr =driver.getWindowHandles();

         for(String st:stSr)
         {driver.switchTo().window(st); // moving the driver to fous on that perticular page

             System.out.println(driver.getTitle());

         }





    }
}
