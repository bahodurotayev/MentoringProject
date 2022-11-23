package day02;


import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


public class _01Lesson {
    /*Scenario Login to exelentersdet.com

    * 1.User  launch Chrome browser
    * 2.User navigate to "https://exelentersdet.com/symfony/web/index.php/auth/login"
    * 3.User verify exelenter login page
    * 4.User enters username
    * 5.User enters password
    * 6.User click to log in
    * 7.User verifies successfully logged in*/
    public static void main(String[] args) {
     /*   System.setProperty("webdriver.chrome.driver","C:\\Users\\tjkba\\OneDrive\\Desktop\\drivers\\ChromeDriver\\chromedriver.exe");
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

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Exelent2022Sdet!");

        driver.findElement(By.id("btnLogin")).click();

        boolean displayed = driver.findElement(By.xpath("//div/h1[contains(text(),'Dashboard')]")).isDisplayed();
        try {
            boolean loggedIn = displayed;
            System.out.println("Successfully logged in");
        }catch (Exception ex){
            System.out.println("Please use valid credentials");
        }
        driver.close();*/
        String s = generateEmail();
        System.out.println(s);

    }

    public static String generateEmail(){
        Random random = new Random();

        String email = "";
        for (int i = 0; i < 7; i++) {
            int charRandom = random.nextInt(97, 123);
            email +=(char)charRandom;
        }
        return email +"@gmail.com";
    }
}
