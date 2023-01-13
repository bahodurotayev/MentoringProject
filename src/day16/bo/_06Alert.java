package day16.bo;
import org.openqa.selenium.By;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;
public class _06Alert {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");
        driver.findElement(By.id("simple")).click();
        waitSecond(2);
        System.out.println(getAlertText());
        acceptAlert();

        driver.findElement(By.id("confirm")).click();
        waitSecond(2);
        System.out.println(getAlertText());
        dismissAlert();

        driver.findElement(By.id("prompt")).click();
        waitSecond(2);
        sendTextAlert("Bo");
        System.out.println(getAlertText());
        acceptAlert();
        tearDown();
    }
}
