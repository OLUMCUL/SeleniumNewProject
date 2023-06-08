package tests.automationexercise;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Case_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com/");
        //3. Verify that home page is visible successfully
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Dogru sayfa");
        }else {
            System.out.println("Yanlis sayfa");
        }
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@class=\"fa fa-lock\"]")).click();
        //5. Verify 'Login to your account' is visible
        driver.findElement(By.xpath("(//*[h2])[1]")).getText().equals("Login to your account");
        //6. Enter correct email address and password  //7. Click 'login' button
        driver.findElement(By.xpath("//*[@data-qa=\"login-email\"]")).sendKeys("fakehesapxlr@gmail.com", Keys.TAB,"erdem2000",Keys.TAB,Keys.ENTER);
        // Perform the click action using x and y coordinates
        //Actions actions = new Actions(driver);
        Utils.sleeping(5000);
        //actions.moveByOffset(400, 400).click().build().perform();
        Utils.sleeping(3000);
        //8. Verify that 'Logged in as username' is visible
        System.out.println("Logged in as username' is visible = " + driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).isDisplayed());

        //9. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();
        //10. Verify that 'ACCOUNT DELETED!' is visible
        System.out.println("driver.findElement(By.xpath(\"//*[@data-qa=\\\"account-deleted\\\"]\\n\")).isDisplayed() = " + driver.findElement(By.xpath("//*[@data-qa=\"account-deleted\"]\n")).isDisplayed());
        driver.findElement(By.xpath("//*[@data-qa=\"continue-button\"]\n")).click();






    }
}
