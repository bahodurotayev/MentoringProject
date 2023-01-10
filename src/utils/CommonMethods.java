package utils;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static utils.BaseClass.*;
public class CommonMethods extends  BaseClass{

    public static void switchToWindow(String windowTitle) {
        Set<String> windows = driver.getWindowHandles();
        for (String windowOrTab : windows) {
            String title = driver.switchTo().window(windowOrTab).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Window is found! Page Title: " + driver.getTitle() +  " URL: " + driver.getCurrentUrl());
                break;
            }
        }
    }

    public static void send_Text(WebElement element, String string){
        element.sendKeys(string);
    }



}
