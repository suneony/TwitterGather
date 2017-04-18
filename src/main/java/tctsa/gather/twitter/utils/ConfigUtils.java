package tctsa.gather.twitter.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by suneony on 4/18/17.
 */
public class ConfigUtils {
    private static InputStream configFileStream=null;
    private static Properties properties=null;
    static{
        properties=new Properties();
        try {

            configFileStream=new FileInputStream("/config.properties");
            properties.load(configFileStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                configFileStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
