package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasına gidelim
        //Sonra Amazon sayfasına gidelim
        //Amazon sayfasının başlığını yazdıralım
        //Techproeducation sayfasına geri dönelim
        //Sayfa başlığını yazdıralım
        //Amazon sayfasına tekrar gidip url'i yazdıralım
        //Amazon sayfasındayken sayfayı yenileyelim

        driver.get("https://www.techproeducation.com/");
        Thread.sleep(3000);
        driver.get("https://www.amazon.com.tr/");
        Thread.sleep(3000);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(3000);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();
    }
}
