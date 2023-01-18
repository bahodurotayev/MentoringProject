package day17.bo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

import static utils.BaseClass.*;
import static utils.CommonMethods.click_clickAbility;
import static utils.CommonMethods.send_Text;

public class _03Table {
    public static void main(String[] args) {
        setUp("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        send_Text(username,"Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        send_Text(password,"test");

        WebElement login_button = driver.findElement(By.id("ctl00_MainContent_login_button"));
        click_clickAbility(login_button);

        String expectedValue = "Steve Johns";

        
        List<WebElement> tableCheckbox = driver.findElements(By.cssSelector("table.SampleTable tr td:nth-child(1)"));
        List<WebElement> tableName = driver.findElements(By.cssSelector("table.SampleTable tr td:nth-child(2)"));
        //td[text() = 'Paul Brown']//preceding-sibling::td//input

        driver.findElement(By.xpath("//td[text() = '" + expectedValue + "']//preceding-sibling::td//input"));

        for (int i = 0; i < tableName.size(); i++) {
            if (tableName.get(i).getText().equals(expectedValue)){
                driver.findElement(By.xpath("//td[text() = '" + tableName.get(i).getText() + "']//preceding-sibling::td//input")).click();
            }
        }

        WebElement delete_button = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        click_clickAbility(delete_button);

        tearDown();
    }
}
