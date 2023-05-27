package techproed.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_test {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

/*      Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.*/

        driver.get("https://www.amazon.com.tr/");
        System.out.println(driver.getTitle());
        System.out.println("Baslikta “Amazon” yaziyormu = "+(driver.getTitle().contains("Amazon")));
        System.out.println("Sayfa URL'si = "+driver.getCurrentUrl());
        System.out.println("Sayfa URL'si “amazon” iceriyormu = "+driver.getCurrentUrl().contains("amazon"));
        System.out.println("Sayfa HTML kodlarinda “Gateway” geciyormu = "+driver.getPageSource().contains("Gateway"));







    }
}
