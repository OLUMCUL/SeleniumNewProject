package techproed.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.tr");
        System.out.println("En son girilen sayfanin sayfa basligi = " + driver.getTitle());
        driver.get("https://www.amazon.com.tr");
        System.out.println("En son girilen sayfanin sayfa basligi = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //getCurrentUrl() gidilen sayfanin url sini verir
        //System.out.println("driver.getPageSource() = " + driver.getPageSource());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        //driver.getWindowHandle() gidilen sayfanin handle degerini(hashKod) veriri bu handle degerini sayfalar arasi gecis icin kullaniriz.


    }
}
