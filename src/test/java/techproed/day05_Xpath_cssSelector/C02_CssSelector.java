package techproed.day05_Xpath_cssSelector;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



//        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//        Add Element butonuna basin
        Utils.sleeping(2000);
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

//        Delete butonu’nun gorunur oldugunu test edin
        System.out.println("driver.findElement(By.cssSelector(\"button[onclick=\\\"deleteElement()\\\"]\")).isDisplayed() = " + driver.findElement(By.cssSelector("button[onclick=\"deleteElement()\"]")).isDisplayed());

//        Delete tusuna basin
        Utils.sleeping(2000);
        driver.findElement(By.cssSelector("button[onclick=\"deleteElement()\"]")).click();

//        “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.out.println("driver.findElement(By.cssSelector(\"div[id=\\\"content\\\"]\")).isDisplayed() = " + driver.findElement(By.cssSelector("div[id=\"content\"]")).isDisplayed());


    }
}
