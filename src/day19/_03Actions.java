package day19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

import static utils.BaseClass.*;

public class _03Actions {
    public static void main(String[] args) throws AWTException {
        setUp("https://www.ebay.com");

        WebElement my_eBay = driver.findElement(By.linkText("My eBay"));
        Actions action = new Actions(driver);
        action.moveToElement(my_eBay).perform();

        String summaryText = driver.findElement(By.xpath("(//ul[@id='gh-ul-nav']//a)[1]")).getText();
        if (summaryText.contains("Summary")){
            System.out.println("Hover over to MyEbay - Summary worked!!! ");
        }else {
            System.out.println("Error!!!");
        }

        WebElement electronics = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab'][2]"));
        action.moveToElement(electronics).perform();
        action.contextClick(electronics).perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        waitSecond(1);
        driver.navigate().to("https://demoqa.com/buttons");    // We are navigating from eBay to this new website
        waitSecond(1);
        // Here we are locating 'Double Click Me' button and using double click on it from the Actions Class.
        action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());     // Locating and Printing message for Double Click Me.
        waitSecond(1);

    }
}
