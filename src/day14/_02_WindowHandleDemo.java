package day14;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _02_WindowHandleDemo {
    public static void main(String[] args) {
        setUp("https://google.com");

        System.out.println("Parent window" + driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://store.google.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://exelenter.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        Set<String> allWindow = driver.getWindowHandles();
        System.out.println("Number of Windows = " + allWindow.size());

        System.out.println("=================================");

        Iterator<String> iterator = allWindow.iterator();
        int count = 1;
        while (iterator.hasNext()){
            String nextWindow = iterator.next();
            driver.switchTo().window(nextWindow);
            String title = driver.getTitle();
            System.out.println("Window : " + count + "title : " + title);
            count++;
        }

        //tearDown();
    }
}
