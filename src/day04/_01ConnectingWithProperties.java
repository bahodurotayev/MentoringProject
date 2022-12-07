package day04;

import utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class _01ConnectingWithProperties {
    public static void main(String[] args) throws IOException {

        /*ConfigReader.loadProperties(Constant.CONFIGURATION_FILEPATH);
        String url = ConfigReader.getProperties("url");
        System.out.println("url = " + url);*/

        //String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
        String filePath = Constant.CONFIGURATION_FILEPATH;
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        String url = properties.getProperty("url");
        System.out.println("url = " + url);

        String edge = properties.getProperty("edge");
        System.out.println("edge = " + edge);

        //printing only values
        Collection<Object> values = properties.values();
        for (Object eachValue:values) {
            System.out.println(eachValue);
        }

        //printing keys and value
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for(Map.Entry<Object, Object> each: entries){
            System.out.println("Key : " + each.getKey() + " || " + "Value: " + each.getValue());
        }
    }
}
