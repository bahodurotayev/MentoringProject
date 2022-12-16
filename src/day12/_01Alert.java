package day12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _01Alert {
    public static void main(String[] args) throws InterruptedException {
        setUp();
        WebElement simpleAlert = driver.findElement(By.cssSelector("input#simple"));
        simpleAlert.click();

        Thread.sleep(300);

        driver.findElement(By.xpath("//div[text()='Search']")).click();

        /*Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();*/

        driver.navigate().back();


        //tearDown();
    }
}
