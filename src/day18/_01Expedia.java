package day18;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;


public class _01Expedia {
    public static void main(String[] args) {
        setUp("https://www.expedia.com/Flights");

        String departMonthAndYear = "May 2023";
        String departDay = "8";
        String returnMonthAndYear = "December 2023";
        String returnDay = "17";

        driver.findElement(By.xpath("//a[@href='?flightType=roundtrip']")).click();
        driver.findElement(By.id("d1-btn")).click();
        String monthAndYear = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]")).getText();

        while (!monthAndYear.equals(departMonthAndYear)){
            WebElement element = driver.findElement(By.cssSelector(".uitk-calendar button:nth-child(2)"));//click for next month
            click_clickAbility(element);
            monthAndYear = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]")).getText();
        }

        List<WebElement> startDays = driver.findElements(By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]//button"));
        for (WebElement day: startDays) {
            if (day.getAttribute("data-day").equals(departDay)){
                System.out.println("Departing Day : " + monthAndYear +" " + day.getAttribute("data-day"));
                day.click();
                break;
            }
        }


        while (!monthAndYear.equals(returnMonthAndYear)){
            WebElement element = driver.findElement(By.cssSelector(".uitk-calendar button:nth-child(2)"));//click for next month
            click_clickAbility(element);
            monthAndYear = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[2]")).getText();
        }

        List<WebElement> endDays = driver.findElements(By.xpath("(//table[@class='uitk-date-picker-weeks'])[2]//button"));
        for (WebElement endDay: endDays) {
            if (endDay.getAttribute("data-day").equals(returnDay)){
                System.out.println("Return Day : " + monthAndYear +" " + endDay.getAttribute("data-day"));
                endDay.click();
                break;
            }
        }

        // Once Depart and Return dates are selected, click on the 'Done' button
        WebElement doneButton = driver.findElement(By.xpath("(//button[text()='Done'])[2]"));
        click_clickAbility(doneButton);
        tearDown();
    }
}
