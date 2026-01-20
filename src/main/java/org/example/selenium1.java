package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ebaypage;
public class selenium1 {
//    private static webDriver driver= null;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        System.out.println(driver.getTitle());
//
//        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("laptop");
//        driver.findElement(By.id("gh-search-btn")).click();

//        driver.quit();
        ebaypage.ebayserc(driver).sendKeys("laptop");
        ebaypage.click(driver).click();
    }
}
