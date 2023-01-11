package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
/**
 *  Note: This is our BANK, for reusing the methods elsewhere in the framework when we need it.
 *   We store all common methods for usability here. This will help us to avoid DRY principle of programming/coding.
 */
import static utils.BaseClass.*;
public class CommonMethods extends BaseClass{
    /**
     * Method will switch focus to next window/tab based on the window title/name
     * @param windowTitle String
     */
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

    public static void click_Button(WebElement element){
        element.click();
    }
    public static WebDriverWait wait_element(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constant.EXPLICIT_WAIT_TIME));
        return wait;
    }
    public static void wait_for_click(WebElement element){
        wait_element().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void click_clickAbility(WebElement element){
        wait_for_click(element);
        element.click();
    }

    public static void wait_visibility(WebElement element){
        wait_element().until(ExpectedConditions.visibilityOf(element));
    } public static void wait_visibility(By locator){
        wait_element().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void click_radio_or_checkbox(List<WebElement> elements, String expected) {
        for (WebElement eachElement: elements) {
            String actualValue = eachElement.getAttribute("value");
            if (actualValue.equals(expected)){
                eachElement.click();
                break;
            }
        }
    }

}
