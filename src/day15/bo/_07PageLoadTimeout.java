package day15.bo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;


public class _07PageLoadTimeout {
    public static void main(String[] args) {
        //setUp("https://exelenter.com");

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        Instant startTime = Instant.now();
        System.out.println("startTime = " + startTime);
        try {
            driver.get("https://exelenter.com");
        }catch (Exception e){
            System.out.println("To Slow");
        }
        Instant endTime = Instant.now();
        System.out.println("startTime = " + endTime);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));

        Duration between = Duration.between(startTime, endTime);
        System.out.println("between = " + between.toMillis());
    }
}
