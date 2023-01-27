package day19;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import utils.ConfigReader;

import java.io.File;
import java.io.IOException;

import static utils.BaseClass.*;

public class _02ScreenshotSelenium4 {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com");

        WebElement txtUsername = driver.findElement(By.id("txtUsername"));
        send_Text(txtUsername, ConfigReader.getProperties("user"));

        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        send_Text(txtPassword, ConfigReader.getProperties("password"));

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        click_clickAbility(btnLogin);

        /**
         *  In Selenium 4 we have two new methods for taking Screenshots.
         *  They are called:
         *      1. getScreenshotAs();
         *      2. getFullPageScreenshotAs();   <== this method is ONLY available with Firefox driver.
         *
         *      These methods are new to Selenium 4, and are not available in Selenium 3.
         *      Using these methods we can take screenshots in two different ways:
         *        1. Section-level screenshots, specific to particular web element of the page.
         *        2. Full-page screenshots, entire page.
         *
         */

        WebElement quickLaunch = driver.findElement(By.className("quickLaungeContainer"));
        screenshot(quickLaunch, quickLaunch.getText());
        tearDown();
    }


}
