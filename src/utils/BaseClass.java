package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    public static WebDriver driver;

    public static void setUp(){
        ConfigReader.loadProperties(Constant.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getProperties("edge").toLowerCase()){
            case "chrome" ->{
                System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.edge.verboseLogging", Constant.EDGE_DRIVER_PATH);
                driver = new EdgeDriver();
            }
        }
    }
    public static void tearDown(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        if (driver != null) {     // This line is optional. We only use it to prevent NullPointerException.
            driver.quit();
        }
    }
}
