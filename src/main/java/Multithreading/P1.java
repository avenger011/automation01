package Multithreading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1 {
      static WebDriver driver;
     public P1(String s)
    {
        if(s.equalsIgnoreCase("Chrome"))
        { driver=new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6o3s351fev_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=8772886969737696944&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300342&hvtargid=kwd-300061672064&hydadcr=5621_2359492&gad_source=1");
        driver.manage().window().maximize();

        }

        else if(s.equalsIgnoreCase("firefox"))
        { driver=new FirefoxDriver();
            driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6o3s351fev_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=4285236133922493913&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300342&hvtargid=kwd-300061672064&hydadcr=5621_2359492&gad_source=1");
            driver.manage().window().maximize();

            //input[@type="search"]
        }
    }

    public P1() {
    }
}
