package techproed.Test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menage_Test {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


/*
        Yeni bir Class olusturalim.C07_ManageWindowSet

        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin
        */


        driver.get("https://www.amazon.com.tr/");
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        /*
        # Calculate the position to center the window
        x_position = (screen_width - window_width) // 2
        y_position = (screen_height - window_height) // 2
         */
        driver.manage().window().setSize(new Dimension(1000,1000));
        driver.manage().window().setPosition(new Point(460,40));

        driver.close();


    }
}
