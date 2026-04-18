package TestSG.testt;

import TestSG.DriverM.Driverm;
import TestSG.login.login;
import org.junit.Test;

import static TestSG.DriverM.Driverm.driver;

public class testRun {

    @Test
    public void T1(){
        Driverm dr=new Driverm();
        dr.r1();
        driver.get("https://www.aqi.in/");
        login lg=new login();
        lg.p1(driver);
    }
}
