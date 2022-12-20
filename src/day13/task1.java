package day13;

import static utils.BaseClass.*;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class task1 {

  @Test
    void test1(){
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

    Assert.assertEquals(alertText, "Sample alert");

    //for Confirm

    WebElement confirm = driver.findElement(By.xpath("//a[@onclick='window.confirm(\"Are you sure?\")']"));
    confirm.click();
    //Alert confirmAlert = driver.switchTo().alert();
    String confirmText = alert.getText();
    System.out.println(confirmText);
    alert.accept();
    //Thread.sleep(3000);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));


  }
}
