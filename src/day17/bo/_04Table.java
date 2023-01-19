package day17.bo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.click_clickAbility;
import static utils.CommonMethods.send_Text;

public class _04Table {
    public static void main(String[] args) {
        setUp("https://demoqa.com/webtables");

        List<WebElement> tableHeader = driver.findElements(By.xpath("//div[@class='rt-tr']/div"));
        for (WebElement each:tableHeader) {
            System.out.print(each.getText() + " | ");
        }

        System.out.println("\n========== ROWS ==========");

        //div[@role='rowgroup'][1]//div[@class='rt-td']
        List<WebElement> tableBody = driver.findElements(By.xpath("//div[@role='rowgroup']"));
        List<WebElement> rowsElements = driver.findElements(By.xpath("//div[@role='rowgroup'][1]//div[@class='rt-td']"));

        for (int i = 0; i <tableBody.size(); i++) {
            if (!tableBody.get(i).getText().isBlank()) {
            for (int j = 0; j <rowsElements.size() ; j++) {
                    String text = driver.findElements(By.xpath("//div[@role='rowgroup'][" + (i + 1) + "]//div[@class='rt-td']")).get(j).getText();
                    System.out.print(text + " ");
                }
                System.out.println();
            }
        }
        tearDown();
    }
}
