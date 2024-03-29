package day18;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
public class _02AmericanAirline {
    public static void main(String[] args) {
        setUp("https://www.aa.com/");

        String departureMonth = "June 2023";
        String returnMonth = "July 2023";
        String departureDate = "15";
        String returnDate = "26";
        String numberForPassenger = "2";

        WebElement fromInput = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        send_Text(fromInput, "LAX");
        WebElement laxAirport = driver.findElement(By.id("ui-id-1"));
        click_clickAbility(laxAirport);

        WebElement destinationInput = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        send_Text(destinationInput,"JFK");
        WebElement jfkAirport = driver.findElement(By.id("ui-id-2"));
        click_clickAbility(jfkAirport);

        WebElement numberOfPassenger = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
        selectValue(numberOfPassenger, numberForPassenger);

        WebElement departureCalender = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        click_Button(departureCalender);

        String monthAndYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
        while (!monthAndYear.equals(departureMonth)){
            WebElement nextMonth = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
            click_clickAbility(nextMonth);
            monthAndYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
        }

        List<WebElement> fromDates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default']"));
        for (int i = 0; i < fromDates.size(); i++) {
            if(fromDates.get(i).getText().equals(departureDate)){
                System.out.println("Departure : " + monthAndYear + " " + fromDates.get(i).getText());
                click_clickAbility(fromDates.get(i));
                break;
            }
        }

        WebElement returnCalender = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"));
        click_Button(returnCalender);

        monthAndYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
        while (!monthAndYear.equals(returnMonth)){
            WebElement nextMonth = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
            click_clickAbility(nextMonth);
            monthAndYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
        }

        List<WebElement> toDates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default']"));
        for (int i = 0; i < toDates.size(); i++) {
            if(toDates.get(i).getText().equals(returnDate)){
                System.out.println("Return : " + monthAndYear + " " + toDates.get(i).getText());
                click_clickAbility(toDates.get(i));
                break;
            }
        }

        WebElement btnSearch = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        waitSecond(2);
        click_clickAbility(btnSearch);

        try {
            WebElement choseFlight = driver.findElement(By.xpath("//ul[@class='search-results-normal js-forsort']"));
            wait_visibility(choseFlight);
            screenshot(choseFlight, "choseFlights");
            System.out.println("Successfully able to see flights");
        }catch (Exception exception){
            System.out.println("Flights are not available check the code");
        }
        tearDown();
    }
}
