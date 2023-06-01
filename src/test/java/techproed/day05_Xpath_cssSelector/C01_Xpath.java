package techproed.day05_Xpath_cssSelector;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static Utils.Utils.isElementVisible;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com.tr");
        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("bisiklet", Keys.ENTER);
        // Hybrid Bikes bölümüne tıklayın
        driver.findElement(By.xpath("//*[@id=\"n/13485223031\"]/span/a/span")).click();
        // sonuc sayısını yazdırın
        String [] sonucSayisi = driver.findElement(By.xpath("//*[@class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText().split(" ");
        System.out.println("sonucSayisi[0] = " + sonucSayisi[0]);
        // ilk ürününe tıklayın
        WebElement elementToClick = driver.findElement(By.xpath("(//*[@class=\"a-section aok-relative s-image-square-aspect\"])[3]"));

        Actions actions = new Actions(driver);

        // Scroll to the element using Actions class
        while (!isElementVisible(driver, elementToClick)) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Utils.sleeping(100);
        }

        // Click on the element
        elementToClick.click();

        // Sayfayı kapatınız
        Utils.sleeping(5000);
        //driver.quit();


    }
}
