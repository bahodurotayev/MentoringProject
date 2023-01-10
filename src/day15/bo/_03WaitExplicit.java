package day15.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;
public class _03WaitExplicit {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        try {
            driver.findElement(By.cssSelector("div#start button")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish h4")));
            WebElement textElement = driver.findElement(By.cssSelector("div#finish h4"));
            System.out.println(textElement.getText());
        }catch (NoSuchElementException exception){
            System.out.println("Elements are not found");
        }
        tearDown();
    }
}
