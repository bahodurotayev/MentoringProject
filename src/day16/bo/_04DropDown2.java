package day16.bo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _04DropDown2 {
    public static void main(String[] args) throws InterruptedException {

        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");


        String expectedText = "January";
        String expectedText2 = "May";

        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("select[name='Month'] option"));
        WebElement monthsDD = driver.findElement(By.cssSelector("select[name='Month']"));

        selectValue(monthsDD,expectedText);

        selectValue(listOfMonths, expectedText2);

        selectValue(monthsDD, 11);

        //tearDown();

    }

    public static void selectValue(WebElement element,String String) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement each: options) {
            if (each.getText().equalsIgnoreCase(String)){
                select.selectByVisibleText(String);
                break;
            }
        }
    }
    public static void selectValue(List<WebElement> elements, String expected){
        for (WebElement each: elements
             ) {
            String actual = each.getText();
            if(actual.equals(expected)){
                each.click();
                break;
            }
        }
    }
    public static void selectValue(WebElement elements, int index){
        Select select = new Select(elements);
        List<WebElement> options = select.getOptions();
        for (WebElement each : options) {
            if(index < options.size()){
                select.selectByIndex(index);
            }else {
                try {
                    throw new IndexOutOfBoundsException(index);
                }catch (IndexOutOfBoundsException exception){
                    exception.printStackTrace();
                    System.out.println("Incorrect index !!!.Please use index between 1 and " + options.size());
                }
            }
        }


    }
}
