package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_getTagName_getAttributeName {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();




        // 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com.tr/");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // 2- arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName = aramaKutusu.getTagName();
        System.out.println("actualTagName = " + actualTagName);
        String expectedTagName = "input";
        if(actualTagName.equals(expectedTagName)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAttribute = aramaKutusu.getAttribute("name");
        System.out.println("actualAttribute = " + actualAttribute);
        String expectedAttribute = "field-keywords";
        if(actualAttribute.equals(expectedAttribute)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Ara Amazon.com.tr" class="nav-input nav-progressive-attribute" dir="auto"
        tabindex="0" aria-label="Ara Amazon.com.tr" spellcheck="false">
         */



        // 4- sayfayı kapatınız
        //driver.quit();
    }
}