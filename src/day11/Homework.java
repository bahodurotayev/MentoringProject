package day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;
public class Homework {
    public static void main(String[] args) throws InterruptedException {
        setUp();
        driver.manage().window().maximize();

        // xpath ->//select[@name='country']/option[@value='US']
        // css -> select[name='country'] option[value='US']
        //WebElement element = driver.findElement(By.cssSelector("select[name='country'] option[value='US']"));
        /*Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));
        select.selectByVisibleText("United States of America");
        //select.selectByValue("United States of America");
        WebElement option = select.getFirstSelectedOption();
        if (option.isSelected()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }*/

        Thread.sleep(300);
        Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));
        List<WebElement> elements = select.getOptions();
       /* for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("United States of America")){
                elements.get(i).click();
                System.out.println(elements.get(i).getText());
                break;
            }
        }*/

        for (WebElement element: elements) {
            if (element.getText().equals("United States of America")) {
                element.click();
                System.out.println(element.getText());
                break;
            }
        }
        tearDown();
    }
}
