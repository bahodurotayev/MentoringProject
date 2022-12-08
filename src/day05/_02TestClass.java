package day05;

import utils.BaseClass;
import utils.ConfigReader;

public class _02TestClass extends BaseClass {
    public static void main(String[] args) {
        setUp();
        System.out.println(driver.getTitle());
        tearDown();
    }
}
