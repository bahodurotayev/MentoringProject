package day05;

import static utils.BaseClass.*;
import utils.ConfigReader;

public class _02TestClass{
    public static void main(String[] args) {
        setUp();
        System.out.println(driver.getTitle());
        tearDown();
    }
}
