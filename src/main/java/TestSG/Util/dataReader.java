package TestSG.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class dataReader {

    public static String run(String key) throws IOException {
        Properties p;
        String url=System.getProperty("user.dir");
        String furl=url+"/src/main/java/TestSG/resources/res.properties";

        try {
            FileInputStream fileInputStream=new FileInputStream(furl);
            p=new Properties();
            p.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

     return p.getProperty(key);
    }
}
