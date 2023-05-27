package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        .implicitlyWait(Duration.ofSeconds(20)); Sayfadaki webElementleri maximim 20 saniye gorunur olana kadar (sayfada olusana kadar)
        max 20 saniye bekler. eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.
        Fakat belirttigimiz max sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz fail verir.

        Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler 30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira sonra gecer.
         */

        //techproed sayfasina gidelim
        driver.get("https://www.techproeducation.com/");
        //amazona gidelim
        driver.get("https://www.amazon.com.tr/");
        //techpro sayfasina geri donelim
        driver.navigate().back();
        //sayfa basliginin techpro icerdigini test edelim
        System.out.println("driver.getTitle().contains(\"techpro\") = " + driver.getTitle().contains("Techpro"));
        System.out.println(driver.getTitle());
        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        //sayfa basliginin amazon icerdigini test edelim
        System.out.println("driver.getTitle().contains(\"amazon\") = " + driver.getTitle().contains("Amazon"));
        System.out.println(driver.getTitle());

        driver.close();
/*        Yeni bir Class olusturalim.C07_ManageWindowSet
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin*/


/*
        Yeni bir class olusturalim (Homework)
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

    }
}
