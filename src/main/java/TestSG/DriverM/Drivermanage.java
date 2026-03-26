package TestSG.DriverM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivermanage {
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

   public static WebDriver driver;

    public static void driv(String Bro)
    {
        switch (Bro) {
            case "chrome":driver=new ChromeDriver();
            break;

            case "fireFox":driver=new FirefoxDriver();
            break;



        }
    }



}
