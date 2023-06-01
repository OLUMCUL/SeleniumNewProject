package tests.automationexercise;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Test_Case_1 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        System.out.println("driver.findElement(By.xpath(\"/html/body/section[2]/div/div\")).isDisplayed() = " + driver.findElement(By.xpath("/html/body/section[2]/div/div")).isDisplayed());

//        4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@class=\"fa fa-lock\"]")).click();

//        5. Verify 'New User Signup!' is visible
        System.out.println("driver.findElement(By.xpath(\"//*[@class=\\\"signup-form\\\"]\")).isDisplayed() = " + driver.findElement(By.xpath("//*[@class=\"signup-form\"]")).isDisplayed());

//        6. Enter name and email address
        driver.findElement(By.xpath("//*[@data-qa=\"signup-name\"]\n")).sendKeys("fakehesapxlr", Keys.TAB,"fakehesapxlr@gmail.com",Keys.ENTER);

//        7. Click 'Signup' button

//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        System.out.println("driver.findElement(By.xpath(\"//*[@class=\\\"title text-center\\\"][1]\")).isDisplayed() = " + driver.findElement(By.xpath("//*[@class=\"title text-center\"][1]")).isDisplayed());

//        9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("erdem2000",Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);


//        10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();

//        11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();

//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("fake",Keys.TAB,"hesap", Keys.TAB,"thechpro", Keys.TAB,"address", Keys.TAB,"address2", Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ENTER, Keys.TAB,"state", Keys.TAB,"city", Keys.TAB,"zipcode", Keys.TAB,"123456789");

//        13. Click 'Create Account button'
        driver.findElement(By.xpath("//*[@data-qa=\"create-account\"]")).click();


//        14. Verify that 'ACCOUNT CREATED!' is visible
        System.out.println("driver.findElement(By.xpath(\"//*[@data-qa=\\\"account-created\\\"]\\n\")).isDisplayed() = " + driver.findElement(By.xpath("//*[@data-qa=\"account-created\"]\n")).isDisplayed());

//        15. Click 'Continue' button
        driver.findElement(By.xpath("//*[@data-qa=\"continue-button\"]")).click();
        Utils.sleeping(3000);

        //Close the Google Ads
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the click action using x and y coordinates
        actions.moveByOffset(400, 400).click().build().perform();
        Utils.sleeping(3000);

//        16. Verify that 'Logged in as username' is visible---------------------------------------------------------------
        System.out.println("driver.findElement(By.xpath(\"//*[@class=\\\"fa fa-user\\\"]\\n\")).isDisplayed() = " + driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).isDisplayed());

//        17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();
//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        System.out.println("driver.findElement(By.xpath(\"//*[@data-qa=\\\"account-deleted\\\"]\\n\")).isDisplayed() = " + driver.findElement(By.xpath("//*[@data-qa=\"account-deleted\"]\n")).isDisplayed());
        driver.findElement(By.xpath("//*[@data-qa=\"continue-button\"]\n")).click();
        //driver.findElement(By.xpath(""));


    }
}

//*[@]


//*[@]

