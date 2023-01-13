package day16.bo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.click_clickAbility;
import static utils.CommonMethods.click_radio_or_checkbox;

public class _02RadioAndCheckBox2 {
    public static void main(String[] args) {

    setUp("https://demoqa.com/radio-button");

        WebElement noRadio = driver.findElement(By.id("noRadio"));
        WebElement yesRadio = driver.findElement(By.id("yesRadio"));
        boolean enabled = noRadio.isEnabled();
        System.out.println("enabled = " + enabled);

        //click_radio_or_checkbox(noRadio);
        click_radio_or_checkbox(yesRadio);
        //click_clickAbility(yesRadio);
        tearDown();

    }
}
