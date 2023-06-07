package techproed.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGiftCardTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
//        - Sayfayi "refresh" yapin
//        Sayfa basliginin "Spend less" ifadesi icerdigini test edin
//        Gift Cards sekmesine basin
//        Birthday butonuna basin
//        Best Seller bolumunden ilk urunu tiklayin  9- Gift card details'den 25 $'i secin
//        10-Urun ucretinin 25$ oldugunu test edin
//        10-Sayfayi kapatin


        driver.get("https://www.amazon.com.tr/");
        driver.navigate().refresh();
        if (driver.getTitle().contains("Amazon")){
            System.out.println("iceriyor");
        }else {
            System.out.println("Icermiyor");
        }
        driver.findElement(By.xpath("(//*[@class=\"nav-a  \"])[12]")).click();
        driver.findElement(By.xpath("//*[@id=\"sp-cc-accept\"]")).click();
        driver.findElement(By.xpath("(//*[@class=\"a-section octopus-pc-category-card-v2-shield\"])[1]")).click();
        driver.findElement(By.xpath("(//*[@class=\"s-image\"])[1]")).click();
        driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")).sendKeys("25");
        System.out.println("25 mi = " + driver.findElement(By.xpath("(//*[@class=\"a-color-price a-text-bold\"])[1]")).getText().contains("25, 00"));

        Thread.sleep(5000);
        driver.quit();

    }



















}
