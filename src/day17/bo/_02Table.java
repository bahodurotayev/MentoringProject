package day17.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

        tearDown();
    }
}
