package day03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


public class _01Lesson {
    /*Scenario Login to exelentersdet.com

    * 1.User  launch Chrome browser
    * 2.User navigate to"https://exelentersdet.com/symfony/web/index.php/auth/login"
    * 3.User verify exelenter login page
    * 4.User enters username
    * 5.User enters password
    * 6.User click to log in
    * 7.User verifies successfully logged in
      8.Close browser*/



    /*Scenario Add new Employee
     * 1.User  navigates to PIM
     * 2.User clicks add button
     * 3.User inputs newEmployee info
     * 4.User saves newEmployee
     * 5.User verify newEmployee
     * 6.Close browser
     * */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tjkba\\OneDrive\\Desktop\\drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://exelentersdet.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        String title = "Exelenter Project";
        try {
            title.equals(driver.getTitle());
            System.out.println("Successfully verified login page");
        }catch (Exception exception){
            System.out.println("Error. Please verify login page");
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

        WebElement pim = driver.findElement(By.xpath("//a/b[text()='PIM']"));
        pim.click();
        driver.findElement(By.cssSelector("input#btnAdd")).click();

        driver.findElement(By.cssSelector("input#firstName")).sendKeys(generateString());
        driver.findElement(By.cssSelector("input#lastName")).sendKeys(generateString());
        driver.findElement(By.cssSelector("input#btnSave")).click();
        Thread.sleep(2000);

        String firstName = driver.findElement(By.cssSelector("input#personal_txtEmpFirstName")).getAttribute("value");
        String lastName = driver.findElement(By.cssSelector("input#personal_txtEmpLastName")).getAttribute("value");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
    }

    public static String generateString(){
        Random random = new Random();
        String str = "";
        for (int i = 0; i < random.nextInt(5,10) ; i++) {
            int randomChar = random.nextInt(97, 123);
            str += (char)randomChar;
        }
        return str;
    }


}
