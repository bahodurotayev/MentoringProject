package day16.bo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.selectValue;

public class _04DropDown2 {
    public static void main(String[] args) throws InterruptedException {

        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");


        String expectedText = "January";
        String expectedText2 = "May";

        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("select[name='Month'] option"));
        WebElement monthsDD = driver.findElement(By.cssSelector("select[name='Month']"));

        selectValue(monthsDD,expectedText);

        selectValue(listOfMonths, expectedText2);

        selectValue(monthsDD, 11);

        //tearDown();

    }


}
