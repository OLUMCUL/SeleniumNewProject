package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {


        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        //Sayfa basliginin Amazon icerdigini test edelim
        //URL'in https:www.amazon.com oldugunu test edelim
        //Sayfayi kapatalim

        driver.get("https:www.amazon.com.tr");
        String str = "Amazon";
        String actualTitle = driver.getTitle();
        boolean baslik = actualTitle.contains(str);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        boolean url = actualUrl.contains(expectedUrl);

        System.out.println("baslik = " + baslik);
        System.out.println("url = " + url);

        if (baslik==true&&url==true){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED"+actualUrl);
        }



        driver.close();//tek sekme ise vrowseri kapatir.
        //driver.quit(); coklu sekme olsada hepsini kapatir.


    }
}
