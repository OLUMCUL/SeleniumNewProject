package techproed.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda system ozelliklerini ayarlamak icin, setProperty methodu ile kullaniriz
        //setProperty methodu ile class'imizia uygulamanin fiziki yerini belirtiriz

        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" degerini girerek "valuaya" ulasilabilir

        WebDriver driver = new ChromeDriver();
        //chromeDriver turunde yeni bir obje olusturun
        driver.get("https://www.google.com.tr");//get() methodu ile String olarak girilen url'ye gider
    }
}
