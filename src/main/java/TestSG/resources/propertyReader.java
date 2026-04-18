package TestSG.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyReader {

    public String run(String key) {
        Properties p;
        String Burl = System.getProperty("user.dir");
        String Murl = Burl + "/src/main/java/TestSG/resources/base.properties";
        FileInputStream fp;



        try {
            fp = new FileInputStream(Murl);
            p =new Properties();
            p.load(fp);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return p.getProperty(key);
    }


}
