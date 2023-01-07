package day15;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _04WaitExplicit {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://omayo.blogspot.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        WebElement dropDownButton = driver.findElement(By.cssSelector(".dropdown button"));
        dropDownButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Face")));
        tearDown();
    }
}
