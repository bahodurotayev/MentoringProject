package day20POM.test;

import day20POM.pages._01LoginPagePageFactor;
import day20POM.pages._01LoginPageWithOutPageFactory;
import utils.BaseClass;
import utils.ConfigReader;

public class _01LoginTest extends BaseClass {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com/");
        //without page factory
        var loginPage = new _01LoginPageWithOutPageFactory();
        send_Text(loginPage.username, ConfigReader.getProperties("user"));
        send_Text(loginPage.password, ConfigReader.getProperties("password"));
        click_Button(loginPage.loginButton);

        //with page factory
        var login = new _01LoginPagePageFactor();
        send_Text(login.username2, ConfigReader.getProperties("user"));
        send_Text(login.password2, ConfigReader.getProperties("password"));
        click_Button(login.loginButton2);
        tearDown();
    }
}
