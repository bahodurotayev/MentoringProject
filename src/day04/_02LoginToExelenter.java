package day04;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.Constant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _02LoginToExelenter {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        String filePath = Constant.CONFIGURATION_FILEPATH;
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        String browser = properties.getProperty("chrome");
        switch (browser.toLowerCase()){
            case "chrome" ->{
                System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.edge.verboseLogging", Constant.EDGE_DRIVER_PATH);
                driver = new EdgeDriver();
            }
        }

        driver.get("https://www.wrike.com/project-management-guide/project-management-basics/");
        Thread.sleep(2000);
        //driver.close();
    }
}
