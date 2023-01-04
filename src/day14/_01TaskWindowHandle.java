package day14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;
public class _01TaskWindowHandle {
    /**
     *  Task: Go to this URL: https://the-internet.herokuapp.com/windows
     *     1. Identify and print parent window ID and Title
     *     2. Click on the link where it says 'Click Here' three times
     *     3. Switch to new tabs and print their title to the console as well.
     *          Bonus: Load facebook website in all children pages.
     */
    public static void main(String[] args) {

        setUp("https://the-internet.herokuapp.com/windows");
        String parentClass = driver.getTitle();

        WebElement clickHereButton = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        for (int i = 0; i < 3; i++) {
            clickHereButton.click();
            System.out.println(driver.getTitle());
        }


    }
}
