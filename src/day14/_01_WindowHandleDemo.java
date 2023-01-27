package day14;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static utils.BaseClass.*;
public class _01_WindowHandleDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/windows");
        /**
         *  How to handle new TABS and new WINDOWS in Selenium?
         *  We have two methods for handling new tabs/windows.
         *      1. getWindowHandle();    ==> handles day18.d.main window only
         *      2. getWindowHandles();   ==> handles ALL windows (or tabs) including the day18.d.main/parent window
         */

        String mainWindowTitle = driver.getTitle();
        System.out.println("Main Window title = " + mainWindowTitle);

        String windowHandle = driver.getWindowHandle();
        System.out.println("Main Window ID = " + windowHandle);

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("================================");
        Set<String> allWindows = driver.getWindowHandles();
        int numberOfWindows = allWindows.size();
        System.out.println("numberOfWindows = " + numberOfWindows);

        //allWindows.forEach(System.out::println);        <--- use forEach() - if you want to print them all on each new line
        //allWindows.forEach(each -> System.out.println("each = " + each));

        Iterator<String> iterator = allWindows.iterator();
        String mainWindow = iterator.next();
        String childWindow = iterator.next();

        System.out.println("mainWindow" + mainWindow);
        System.out.println("childWindow = " + childWindow);

        System.out.println("====================================");

        System.out.println(driver.getTitle());

        driver.switchTo().window(childWindow);

        System.out.println(driver.getTitle());

        tearDown();
    }
}
