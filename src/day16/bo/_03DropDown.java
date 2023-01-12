package day16.bo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.click_radio_or_checkbox;

public class _03DropDown {
    public static void main(String[] args) {

        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement country = driver.findElement(By.name("country"));


        selectDropDown(country, "Andorra");

        tearDown();
    }

    public static void selectDropDown(WebElement element, String expected) {
        Select select = new Select(element);
        for (int i = 0; i < select.getOptions().size(); i++) {
           if (select.getOptions().get(i).getText().equalsIgnoreCase(expected)){
               select.getOptions().get(i).click();
               break;
           }
        }
    }
}
