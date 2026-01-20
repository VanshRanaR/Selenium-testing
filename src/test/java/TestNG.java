import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ebaypage;

public class TestNG {

    WebDriver driver;   // Global driver

    @BeforeTest
    public void browser_setup() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchTest() {
        driver.get("https://www.ebay.com/");
        System.out.println(driver.getTitle());

        ebaypage.ebayserc(driver).sendKeys("laptop");
        ebaypage.click(driver).click();
    }

    @AfterTest
    public void closeBrowser() {
        System.out.println("Test completed");
        driver.quit();
    }
}
