package techproed.day03_Locators;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Submit {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazon sayfasina gidip
        driver.get("https://www.amazon.com.tr/");
        //arama kutusunu locate edip
        //iphone aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //sayfayi kapatalim
        Utils.sleeping(5000);
        driver.close();






    }
}
