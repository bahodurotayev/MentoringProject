package day19;
import org.openqa.selenium.*;

import static utils.BaseClass.*;

public class _04JavaScriptByElement {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/large");

        WebElement table = driver.findElement(By.id("large-table"));

        String script = "arguments[0].scrollIntoView(true);";

        ((JavascriptExecutor)driver).executeScript(script, table);

        tearDown();
    }
}
