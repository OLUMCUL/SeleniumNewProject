package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

    public static void sleeping(int milisecond){
        try {
            Thread.sleep(milisecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void findElById(String id,String send){
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.findElement(By.id(id)).sendKeys(send, Keys.ENTER);

    }
    public static void chrome(){
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    }

    public static boolean isElementVisible(WebDriver driver, WebElement element) {
        return (boolean) ((JavascriptExecutor) driver).executeScript(
                "var element = arguments[0];" +
                        "var rect = element.getBoundingClientRect();" +
                        "return (rect.top >= 0 && rect.bottom <= window.innerHeight);",
                element
        );
    }

}
