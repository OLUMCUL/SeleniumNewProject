package techproed.day03_Locators;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_findelements {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com.tr/");
        //Sayfadaki linklerin sayisini ve linkleri yazdiralim
        /*
        findelement ile bir webelemente ulasabilirken,
        birden fazla webelement icin findelements methodunu kullaniriz. Bu webelementlerin sayisina ulasmak icin ya da
        bu webelementlerin yazisini konsola yazdirabilmek icin
        list<Webelement> linklerinlistesi == driver.findelements(By.locator("locator degeri)) olarak kullaniriz
        Olusturmus oldugumuz listi loop ole konsola yazdirabiliriz
         */

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi = "+linklerListesi.size());

        for (WebElement w:linklerListesi) {
            System.out.println(w.getText());
        }
        for (WebElement w:linklerListesi) {
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }
        }
        //Lambda ile yapilisi
        linklerListesi.forEach(link -> {if(!link.getText().isEmpty()){System.out.println(link.getText());}});





        Utils.sleeping(10000);
        driver.close();

    }
}
