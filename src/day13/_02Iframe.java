package day13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;
public class _02Iframe {
    static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) {
        setUp(url);
        WebElement element = driver.findElement(By.xpath("//footer/p"));
        String text = element.getText();
        System.out.println(text);
        //tearDown();
    }
}
