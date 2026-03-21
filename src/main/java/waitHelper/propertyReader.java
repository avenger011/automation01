package waitHelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.Properties;

public class propertyReader {
    public static String readKey(String key){
        Properties p;
        String startpath=System.getProperty("user.dir");
        String filePath=startpath+"/src/main/java/waitHelper/data.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(filePath);
            p=new Properties();
            p.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     return p.getProperty(key);

    }

}
