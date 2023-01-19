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
        System.out.println("actual size of table = " + tableName.size());
        //td[text() = 'Paul Brown']//preceding-sibling::td//input

        for (int i = 0; i < tableName.size(); i++) {
            if (tableName.get(i).getText().equals(expectedValue)){
                driver.findElement(By.xpath("//td[text() = '" + tableName.get(i).getText() + "']//preceding-sibling::td//input")).click();
            }
        }

        WebElement delete_button = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        click_clickAbility(delete_button);

        List<WebElement> tableName2 = driver.findElements(By.cssSelector("table.SampleTable tr td:nth-child(2)"));
        System.out.println("Current size of table = " + tableName2.size());
        tearDown();
    }
    /* // 1st way: Ufuk Code:
        List<WebElement> actualValues = driver.findElements(By.xpath("(//table[@class='SampleTable']//tr/td[2])"));
        for (int i = 0; i < actualValues.size(); i++) {
            if (actualValues.get(i).getText().equals(expected_Value)) {
                driver.findElement(By.xpath("(//input[@type='checkbox'])[" + (i + 1) + "]")).click();    // +1 We need to skip header,
                wait(1);
                driver.findElement(By.cssSelector("#ctl00_MainContent_btnDelete")).click();
                wait(1);
                break;
            }
        }*/

    // 2nd way: Dilnoza Code
//        String expectedValue = "Clare Jefferson";
//        List<WebElement> actualValues = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[2]"));
//        for (int i = 0; i < actualValues.size(); i++) {
//            if (actualValues.get(i).getText().equals(expectedValue)) {
//                driver.findElement(By.xpath("(//input[@type='checkbox'])[" + (i+1) + "]")).click();
//                wait(1);
//                driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();//
//                wait(1);
//                break;
//            }
//        }
}
