package day02;


import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _01Lesson {
    /*Scenario Login to exelentersdet.com
    * 1.User  launch Chrome browser
    * 2.User navigate to "https://exelentersdet.com/symfony/web/index.php/auth/login"
    * 3.User verify exelenter logo
    * 4.User enters username
    * 5.User enters password
    * 6.User click to login in*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tjkba\\OneDrive\\Desktop\\drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://exelentersdet.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        String title = "Exelenter Project";
        try {
            title.equals(driver.getTitle());
            System.out.println("Successfully verified login page");
        }catch (Exception exception){
            System.out.println("Error. Please verify login paga");
        }

        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));


    }
}
