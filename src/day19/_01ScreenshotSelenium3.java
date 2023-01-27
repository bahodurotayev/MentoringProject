package day19;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

import java.io.File;
import java.io.IOException;

import static utils.BaseClass.*;

public class _01ScreenshotSelenium3 {
    public static void main(String[] args) {

        setUp("https://exelentersdet.com");
        WebElement txtUsername = driver.findElement(By.id("txtUsername"));
        send_Text(txtUsername, ConfigReader.getProperties("user"));

        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        send_Text(txtPassword, ConfigReader.getProperties("password"));

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        click_clickAbility(btnLogin);

        /**
         *  In Selenium 3, we use 'TakesScreenshot' interface to take snapshots of web pages.
         *  For copying file from source (webpage) to destination (your local folder), we can use either:
         *      1. FileUtils.copyFile(sourceFile, destinationFile)  <== from Commons IO, an Apache Library
         *      2. FileHandler.copy(sourceFile, destinationFile)    <== from Selenium Library
         */

        // Before taking screenshot, wait for any element (yellow circle) to become present
        // One way: local Explicit wait used here.
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.className("flot-overlay")));

        WebElement element = driver.findElement(By.className("flot-base"));//after login "Yellow circle" for "Employee Distribution by Subunit" ELEMENT
        wait_for_click(element);

        screenshotFull();
        tearDown();
    }

}
