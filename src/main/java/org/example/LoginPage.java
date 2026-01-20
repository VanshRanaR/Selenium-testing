
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public static WebElement username(WebDriver driver) {
        return driver.findElement(By.id("user-name"));
    }

    public static WebElement password(WebDriver driver) {
        return driver.findElement(By.id("password"));
    }

    public static WebElement loginButton(WebDriver driver) {
        return driver.findElement(By.id("login-button"));
    }

    public static WebElement errorMessage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("h3[data-test='error']")
        ));
    }
}
