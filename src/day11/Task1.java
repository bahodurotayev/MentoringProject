package day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;
public class Task1 {
    public static void main(String[] args) {
        setUp();

        driver.manage().window().maximize();


        Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            options.get(i).click();
            if(options.get(i).getText().equals("Morocco")){
                break;
            }
        }



        tearDown();
    }
}
