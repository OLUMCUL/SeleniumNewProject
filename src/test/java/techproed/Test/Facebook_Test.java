package techproed.Test;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Test {
    public static void main(String[] args) {

                /*
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
                Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
                https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
*/


        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        if (driver.getTitle().contains("facebook")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Contains facebook");
        }else {
            System.out.println(driver.getCurrentUrl());
        }

        driver.get("https://www.walmart.com/");
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Utils.sleeping(5000);

        driver.close();


    }
}
