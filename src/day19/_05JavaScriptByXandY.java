package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _05JavaScriptByXandY {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/large");

        WebElement table = driver.findElement(By.id("large-table"));

        ((JavascriptExecutor)driver).executeScript("window.scrollBy(770,2670)");

        //tearDown();
    }
}
