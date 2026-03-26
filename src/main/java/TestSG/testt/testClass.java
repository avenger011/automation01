package TestSG.testt;

import TestSG.DriverM.Drivermanage;
import TestSG.Util.dataReader;
import TestSG.login.mainLogin;
import org.junit.Test;

import java.io.IOException;

import static TestSG.DriverM.Drivermanage.driver;

public class testClass {

    @Test
    public void test1() throws IOException {
        Drivermanage.driv(dataReader.run("BRO"));
        driver.get(dataReader.run("URL"));
        driver.manage().window().maximize();
        mainLogin.proces1(driver);

    }
}
