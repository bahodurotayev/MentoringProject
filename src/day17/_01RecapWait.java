package day17;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.driver;
import static utils.BaseClass.setUp;

public class _01RecapWait {
    public static void main(String[] args) {

        setUp("https://the-internet.herokuapp.com/");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));                      // IMPLICIT WAIT
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));                     // This fails, because it's for webpage to load, not AJAX type wait.

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
}
