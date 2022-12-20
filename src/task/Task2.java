package task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static utils.BaseClass.*;
public class Task2 {
@Test
void randomSelect() throws InterruptedException {
    setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");

    driver.manage().window().maximize();

    Select select = new Select(driver.findElement(By.cssSelector("select#variation-selector-0")));
    List<WebElement> options = select.getOptions();
    select.selectByIndex(randomNumberSelect(options));

    Thread.sleep(3000);

    Select select1 = new Select(driver.findElement(By.cssSelector("select#variation-selector-1")));
    List<WebElement> options1 = select1.getOptions();
    select1.selectByIndex(randomNumberSelect(options1));

    Thread.sleep(3000);

    tearDown();
    }
    public static int randomNumberSelect(List<WebElement> elements){
    Random random = new Random();
    return random.nextInt(elements.size());
    }
}
