package day17.bo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static utils.BaseClass.*;

public class _01Table {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/tables");

        List<WebElement> tableBodyRows = driver.findElements(By.cssSelector("table#table1 tbody tr"));

        System.out.println("Number of Row : " + tableBodyRows.size());
        System.out.println("=== Printing Row ===");

        Iterator<WebElement> iterator = tableBodyRows.iterator();
        while(iterator.hasNext()){
            WebElement eachRow = iterator.next();
            String textRow = eachRow.getText();
            System.out.println(textRow);
        }

        System.out.println("=========================================");

        List<WebElement> tableColumns = driver.findElements(By.cssSelector("table#table1 thead tr th"));
        for (WebElement each: tableColumns) {
            System.out.print(each.getText() + " | ");
        }

        tearDown();
    }
}
