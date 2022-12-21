package day13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static utils.BaseClass.*;
public class _01Task1 {

   static String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";

    public static void main(String[] args) {
        setUp(url);

        WebElement element = driver.findElement(By.cssSelector("select#first"));

        Select select = new Select(element);

        List<WebElement> options = select.getOptions();
        select.selectByIndex(randomNumber(options));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        //tearDown();
    }
    public static int randomNumber(List<WebElement> elements){
        Random random = new Random();
        return random.nextInt(elements.size());
    }
}
