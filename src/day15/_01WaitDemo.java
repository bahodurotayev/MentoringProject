package day15;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

import static utils.BaseClass.*;
public class _01WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        try {
            driver.findElement(By.cssSelector("div#start button")).click();
            String text = driver.findElement(By.cssSelector("div#finish h4")).getText();
            System.out.println(text);
        }catch (NoSuchElementException exception){
            System.out.println("Element is not found");
        }



        tearDown();
    }
}
