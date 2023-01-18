package day17.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _02Table {
    public static void main(String[] args) {
        setUp("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        send_Text(username,"Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        send_Text(password,"test");

        WebElement login_button = driver.findElement(By.id("ctl00_MainContent_login_button"));
        click_clickAbility(login_button);

        List<WebElement> tableRows = driver.findElements(By.cssSelector("table.SampleTable tr"));
        //System.out.println(tableRows.get(0).getText());
        System.out.println("Print Rows");
        for (int i = 1; i < tableRows.size(); i++) {
            //System.out.println(tableRows.get(i).getText());
        }

        System.out.println("Print Column");
        List<WebElement> tableColumn = driver.findElements(By.xpath("//table[@class='SampleTable']//tr[1]/th"));
        for (WebElement each:tableColumn) {
            System.out.print(each.getText() + " | ");
        }

        tearDown();
    }
}
