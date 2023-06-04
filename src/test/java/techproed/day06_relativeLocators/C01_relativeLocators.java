package techproed.day06_relativeLocators;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazona gidelim
        driver.get("https://amazon.com.tr");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Bisikletler']"));
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println("completeBike.getText() = " + completeBike.getText());

        //(//*[@class='a-list-item'])[position()>=10 and position()<=16]
        //aralik belirlemek icin

        WebElement e = driver.findElement(By.xpath("//*[text()='Bisikletler']"));
        for (int i = 0; i < 5; i++) {

            WebElement a = driver.findElement(with(By.tagName("a")).below(e));
            System.out.println("link "+(i+1)+" = "+a.getText());
            e=a;
        }
        /*
        XPATH kullaniminda bir sayfadaki webelementlaere mudahale etmek istedigimizde xPath ile locade aldigimizda birden fazla sonuc verebilir.
        [position()>=10 and position()<=16] bu kullanim ile aralik belirtelek istedigimiz web elementleri secip mudahale edebiliriz.
         */

        List<WebElement> linklerListesi1 =driver.findElements(By.xpath("(//*[@class=\"a-list-item\"])[position()>=3 and position()<=7]"));


        //linklerListesi.forEach(t-> System.out.println(t.getText()));

        List<WebElement> linlkerListesi2 = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
        linlkerListesi2.forEach(t-> System.out.println(t.getText()));

        for (int i = 0; i < linklerListesi1.size(); i++) {
            List<WebElement> linklerListesi =driver.findElements(By.xpath("(//*[@class=\"a-list-item\"])[position()>=3 and position()<=7]"));
            linklerListesi.get(i).click();
            Utils.sleeping(666);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            Utils.sleeping(666);
            driver.navigate().back();
        }



    }
}
