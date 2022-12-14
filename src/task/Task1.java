package task;
import org.testng.annotations.Test;

import static utils.BaseClass.*;
public class Task1 {
    @Test
    void etsy (){
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");
        driver.manage().window().maximize();

        String menuXpath = "//ul[@data-ui='top-nav-category-list']//span";
        String itemListXpath = "//h1[@id = 'search-results-top']/following::a/div[2]/h3";

        tearDown();
    }
}
/*public class _05_Task_RandomSelection {

    String menuXpath = "//ul[@data-ui='top-nav-category-list']//span";
    String itemListXpath = "//h1[@id = 'search-results-top']/following::a/div[2]/h3";

    @Test
    public void clickOnRandomXpath(){
        setUp();
        clickOnRandomWebElement(menuXpath);
        try {
            clickOnRandomWebElement(itemListXpath);
        } catch (Exception e){
            System.out.println("Current category has no listed products");
        }
    }

    public static List<String> getXpaths(String xpath){
        List<WebElement> webElementList = driver.findElements(By.xpath(xpath));
        List<String> xpathList = new ArrayList<>();
        String elementXpath;

        for (WebElement element : webElementList) {
            elementXpath = "//*[contains(text(), \'" + element.getText() + "\'";
            xpathList.add(elementXpath);
        }
        return xpathList;
    }

    public static String selectRandomXpath(List<String> xpathList){
        return xpathList.get(randomNumberGenerator(xpathList.size()));
    }

    public static void clickOnRandomWebElement(String xpath){
        List<String> xpathOfWebelements = getXpaths(xpath);
        String randomXpath = selectRandomXpath(xpathOfWebelements);
        try {
            Thread.sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        }
        WebElement randomItem = driver.findElement(By.xpath(randomXpath));
        System.out.println("randomItem = " + randomItem.getText());
        randomItem.click();
    }

    public static int randomNumberGenerator(int n) {
        return new Random().nextInt(n);
    }
}
getXpath method has some typo, replace it with line: elementXpath = "//*[contains(text(), \'" + element.getText() + "\')]";*/
