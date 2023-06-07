package techproed.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddElementTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        // Add Element butonuna 100 defa basınız
        for (int i = 0; i < 100; i++) {
            driver.findElement(By.xpath("//*[@onclick=\"addElement()\"]")).click();
        }
        // 100 defa basıldığını test ediniz
        List<WebElement> deleteSayisi = driver.findElements(By.xpath("//*[@class=\"added-manually\"]"));
        if (deleteSayisi.size()==100){
            System.out.println("100 Kere basilmis +");
        }else {
            System.out.println("100 Kere basilmamis -");
            System.out.println(deleteSayisi.size());
        }
        // 90 defa delete butonuna basınız
        for (int i = 0; i < 90; i++) {
            driver.findElement(By.xpath("(//*[@onclick=\"deleteElement()\"])[1]")).click();
        }
        Thread.sleep(1000);
        // 90 defa basıldığını doğrulayınız
        List<WebElement> kalanDeleteSayisi = driver.findElements(By.xpath("//*[@class=\"added-manually\"]"));
        if (kalanDeleteSayisi.size()==10){
            System.out.println("90 Kere basilmis +");
        }else {
            System.out.println("90 Kere basilmamis -");
            System.out.println(kalanDeleteSayisi.size());
        }
        // Sayfayı kapatınız
        Thread.sleep(5000);
        driver.quit();


    }

}
