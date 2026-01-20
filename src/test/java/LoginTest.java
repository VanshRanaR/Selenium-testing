

import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    // Positive Test Case
    @Test(priority = 1)
    public void validLoginTest() {
        LoginPage.username(driver).sendKeys("standard_user");
        LoginPage.password(driver).sendKeys("secret_sauce");
        LoginPage.loginButton(driver).click();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Valid login failed!");
        System.out.println("Valid Login Test Passed");
    }

    // Negative Test Case
    @Test(priority = 2)
    public void invalidLoginTest() {
        driver.get("https://www.saucedemo.com/");

        LoginPage.username(driver).sendKeys("wrong_user");
        LoginPage.password(driver).sendKeys("wrong_pass");
        LoginPage.loginButton(driver).click();

        String error = LoginPage.errorMessage(driver).getText();
        Assert.assertTrue(error.contains("Username and password do not match"), "Error message not shown");
        System.out.println("Invalid Login Test Passed");
    }

    @AfterTest
    public void tearDown() {

    }
}
