package day20POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.BaseClass.driver;

public class _01LoginPagePageFactor {
    public _01LoginPagePageFactor() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    public WebElement username2;

    @FindBy(id = "txtPassword")
    public WebElement password2;

    @FindBy(id = "btnLogin")
    public WebElement loginButton2;
}
