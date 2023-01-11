package day16.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import static utils.BaseClass.*;
/**
 *  To access method of one class from another class/package.
 *      1. import statically
 *      2. Extends nameOfCLass
 *      3. NameOfClass.method()
 */

public class _01LoginTest {
    public static void main(String[] args) {

        setUp("https://exelentersdet.com/");

        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        //username.sendKeys("Admin");
        send_Text(username, ConfigReader.getProperties("user"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        send_Text(password, ConfigReader.getProperties("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));



        //tearDown();

    }
    public static void send_Text(WebElement element, String string){
        element.sendKeys(string);
    }
}
