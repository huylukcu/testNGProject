package techproed.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //This class reads the configuration.properties file.bu dosya sabit bir kere olustursan yeter
    //Create Properties instance
    private static Properties properties;//hemen properties dosyasi olussun diye static
    static {
        //path of the configuration file  //static block: it works before everything
        String path="configuration.properties";
        try {
            //Opening configuration.properties file using FileInputStream.dosyayi tanitma
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();//
            properties.load(fileInputStream);
            //close the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method will get the key from properties file,
    //And return the value as String
    //We create this method to read the file
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
    //TEST IF LOGIC WORKS
//    public static void main(String[] args) {
//        System.out.println(properties.getProperty("qa_environment"));
//    }








}
