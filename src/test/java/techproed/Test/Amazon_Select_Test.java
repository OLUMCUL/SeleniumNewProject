package techproed.Test;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Amazon_Select_Test {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com.tr/");
        //iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        WebElement cerez = driver.findElement(By.id("sp-cc-accept"));
        cerez.click();

        //Utils.findElById("twotabsearchtextbox","iphone");

        for (int i = 0; i < 5; i++) {
            java.util.List<WebElement> searchResults = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//h2/a"));
            WebElement searchResult = searchResults.get(i);
            searchResult.click();

            // Retrieve the title of the search result
            WebElement titleElement = driver.findElement(By.id("productTitle"));
            String title = titleElement.getText();
            System.out.println("Search Result " + (i + 1) + " Title: " + title);

            driver.navigate().back();

            driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//h2/a"));
        }

        Utils.sleeping(10000);
        driver.close();
    }
}

