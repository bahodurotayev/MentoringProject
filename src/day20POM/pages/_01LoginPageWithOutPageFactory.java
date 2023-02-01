package day20POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utils.BaseClass.*;

public class _01LoginPageWithOutPageFactory {
    public WebElement username = driver.findElement(By.id("txtUsername"));
    public WebElement password = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));

}
