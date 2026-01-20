package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ebaypage {
   private static  WebElement element = null ;
    public static WebElement ebayserc(WebDriver driver)
    {
        element= driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        return element;
    }
    public static WebElement click(WebDriver driver)
    {
        element= driver.findElement(By.id("gh-search-btn"));
        return element;
    }
}
