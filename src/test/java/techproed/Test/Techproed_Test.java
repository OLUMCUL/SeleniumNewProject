package techproed.Test;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techproed_Test {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com/");
        Utils.sleeping(3000);
        //Çıkan reklamı locate edip kapatalım
        driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-19118\"]/div/a/i")).click();
        //Arama bölümünde qa aratalım
        driver.findElement(By.xpath("//*[@id=\"elementor-search-form-9f26725\"]")).sendKeys("qa", Keys.ENTER);
        //Sayfa başlığının qa içerdiğini doğrulayalım
        System.out.println("driver.getTitle().contains(\"qa\") = " + driver.getTitle().contains("qa"));
        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        System.out.println("driver.findElement(By.xpath(\"//*[@class=\\\"elementor-post__card\\\"][1]\")).isDisplayed() = " + driver.findElement(By.xpath("//*[@class=\"elementor-post__card\"][1]")).isDisplayed());
        System.out.println("driver.findElement(By.xpath(\"//*[@class=\\\"elementor-post__card\\\"][1]\")).isEnabled() = " + driver.findElement(By.xpath("//*[@class=\"elementor-post__card\"][1]")).isEnabled());
        //Carrer Opportunities In QA linkine tıklayalım
        driver.findElement(By.xpath("//*[@class=\"elementor-post__card\"][1]")).click();
        //Başlığın Opportunities içerdiğini test edelim
        System.out.println("driver.getTitle().contains(\"Opportunities\") = " + driver.getTitle().contains("Opportunities"));
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();
        if (driver.getCurrentUrl().contains("https://techproeducation.com/")){
            System.out.println("Test Basarili");
        }else {
            System.out.println("Current URL = "+driver.getCurrentUrl());
        }

        driver.quit();




    }
}
