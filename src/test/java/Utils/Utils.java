package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

    public static void sleeping(int milisecond){
        try {
            Thread.sleep(milisecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void chrome(){
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    }

}
