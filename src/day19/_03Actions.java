package day19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utils.BaseClass.*;

public class _03Actions {
    public static void main(String[] args) {
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

    }
}
