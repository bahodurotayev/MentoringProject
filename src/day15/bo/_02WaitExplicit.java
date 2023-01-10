package day15.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

import static utils.BaseClass.*;
public class _02WaitExplicit {
    public static void main(String[] args) {
        setUp("http://uitestpractice.com/Students/Contact");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(55));

        try {
            WebElement ajaxLink = driver.findElement(By.linkText("This is a Ajax link"));
            ajaxLink.click();

            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ContactUs p")));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.ContactUs p")));

            WebElement contactUsText = driver.findElement(By.cssSelector("div.ContactUs p"));
            System.out.println(contactUsText.getText());
        }catch (Exception exception){
            System.out.println("Elements are not found");
        }
        tearDown();
    }
}
