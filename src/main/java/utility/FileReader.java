package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

    Properties pro;

    {

            File file = new File("filepath");
            FileInputStream fs=null;

        try {

            fs = new FileInputStream( file);
            pro = new Properties();
            pro.load(fs);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public String getProperty(String key){
        String keyValue =  pro.getProperty(key);
        return keyValue;
    }


}
