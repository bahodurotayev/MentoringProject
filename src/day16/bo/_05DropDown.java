package day16.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;
public class _05DropDown {
    public static void main(String[] args) {
        setUp("https://vitalets.github.io/combodate/");

        WebElement elementDay = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        WebElement elementMonth = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        WebElement elementYear = driver.findElement(By.xpath("(//select[@class='year '])[1]"));

        List<WebElement> elements = driver.findElements(By.xpath("(//select[@class='day '])[1]/option"));
        selectValue(elements, "14");


        selectValue(elementDay, "20");
        selectValue(elementMonth, 2);
        selectValue(elementYear, "2014");

        //tearDown();
    }
}
