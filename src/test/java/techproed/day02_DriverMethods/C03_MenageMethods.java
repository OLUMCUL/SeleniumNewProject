package techproed.day02_DriverMethods;

import Utils.Utils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_MenageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Browser'in konumunu yazdiralim
        //Browser'in boyutlarini yazdiralim
        //Browser'i maximize yapalim
        //Techproeducation sayfasina gidelim
        //Browser'in konumunu yazdiralim
        //Browser'in boyutlarini yazdiralim
        //Sayfayi minimize yapalim
        //Sayfayi fullScreen yapalim

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        driver.manage().window().maximize();
        /*
        Bir web sitesinde gittigimizde browser default olarak bir boyutta gelir.
        Ve acilan browserdaki web elementlere browser maximize olmadigi icin ulasamayabiliriz.
        Dolayisiliyla browser'i actiktan sonra maximize yaparsak driver butun elementleri goror ve rahatlilka mudahale edebilir.
        Bu yuzden browser'i actiktan sonra ilk olarak maximize yapmamiz bizim web elementlere ulasmada isimizi kolaylastirir boylelikle fail almamis oluruz
         */
        driver.get("https://www.techproeducation.com/");
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        Utils.sleeping(3000);
        driver.manage().window().minimize();
        Utils.sleeping(3000);
        driver.manage().window().fullscreen();
        Utils.sleeping(3000);

        driver.manage().window().setPosition(new Point(50,50));

        driver.manage().window().setSize(new Dimension(500,500));
        Utils.sleeping(5000);

        driver.close();


    }
}
