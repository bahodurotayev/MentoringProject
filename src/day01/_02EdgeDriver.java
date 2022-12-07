package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.ConfigReader;
import utils.Constant;

public class _02EdgeDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.verboseLogging", Constant.EDGE_DRIVER_PATH);
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");

    }
}
