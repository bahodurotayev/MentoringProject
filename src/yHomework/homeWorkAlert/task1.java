package yHomework.homeWorkAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static utils.BaseClass.*;

public class task1 {

    String url ="https://www.selenium.dev/documentation/webdriver/interactions/alerts/";
    @Test
    void task1(){
        // 1 step
        setUp();

        // 2 step
        WebElement alertLink = driver.findElement(By.xpath("//a[@onclick='window.alert(\"Sample alert\")']"));
        alertLink.click();

        // 3 step
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

        //for Confirm

        WebElement confirm = driver.findElement(By.xpath("//a[@onclick='window.confirm(\"Are you sure?\")']"));
        confirm.click();
        String confirmText = alert.getText();
        System.out.println(confirmText);
        alert.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //for prompt

         tearDown();

    }
}
