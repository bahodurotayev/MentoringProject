package day16.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;
public class _02RadioAndCheckBox {
    public static void main(String[] args) {

        setUp("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");

        List<WebElement> elements = driver.findElements(By.name("color"));
        List<WebElement> elements2 = driver.findElements(By.name("browser"));

        click_radio_or_checkbox(elements2, "Opera");
        click_radio_or_checkbox(elements,"blue");

    }
}
