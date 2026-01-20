# Selenium Automation Project (Up to TestNG)

This project is my learning journey of **Selenium Automation Testing using Java, Maven, and TestNG**.  
Till now, I have set up a complete professional automation environment and successfully executed TestNG tests.

---

## 🧠 Concepts Covered Till Now

---

## 1. Selenium WebDriver

Selenium is an open-source tool used to automate web applications.  
WebDriver is the core interface that:

- Opens browsers  
- Finds web elements  
- Performs actions like `click()`, `sendKeys()`, etc.

Flow:  
Java Code → Selenium WebDriver → Browser Driver → Real Browser  

---

## 2. Maven (Build & Dependency Management)

Maven is used to:

- Manage Selenium and TestNG dependencies  
- Maintain project structure  
- Build and run automation tests  

Command to run tests:

```bash
mvn test
Dependencies added:

Selenium

TestNG

Maven Surefire Plugin (for running TestNG tests)

3. Project Structure
Project follows standard Maven structure:

css
Copy code
selenium1
│
├── pom.xml
│
└── src
    ├── main
    │   └── java        → Application logic (future use)
    │
    └── test
        └── java        → All Selenium + TestNG test cases
Important rule:
TestNG test classes must always be inside src/test/java.
```
## 4. TestNG Framework

TestNG is used for:

- Organizing test cases  
- Managing execution flow  
- Generating reports  
- Supporting annotations  

Common annotations:

```java
@BeforeTest   // Browser setup
@Test         // Actual test execution
@AfterTest    // Close browser
```




TestNG makes tests:

- Structured  
- Maintainable  
- Scalable  

---

## 5. Page Object Model (POM)

POM is a design pattern where:

- Each web page is represented as a separate class  
- Locators are written only once  
- Test logic and UI elements are separated  

### Benefits

- Code reusability  
- Easy maintenance  
- Clean architecture  

### Example Usage

```java
ebaypage.ebayserc(driver).sendKeys("laptop");
ebaypage.click(driver).click();
````
6. Running Tests
You can run tests in two ways:

Using IntelliJ
Click ▶ near the @Test annotation

Using Maven
bash
Copy code
mvn test
7. Git Usage
Git is used for version control:
```
bash
Copy code
git add .
git commit -m "Learnt TestNG automation"
git push origin main
````


## 🔐 8. Login Page Automation (Real Website)

I have automated the Login functionality of a real website using Selenium, TestNG, and POM.

Website used:
https://www.saucedemo.com

yaml
Copy code

This website is specially designed for automation practice.

---

## 🧪 Login Test Scenarios Implemented

| Test Type | Description |
|---------|------------|
| Positive Test | Login with valid username and password |
| Negative Test | Login with invalid username and password |

Test Credentials:

| Type | Username | Password |
|------|---------|---------|
| Valid | standard_user | secret_sauce |
| Invalid | wrong_user | wrong_pass |

---

## 📂 Login Page Project Structure

src
├── main
│ └── java
│ └── org.example
│ └── LoginPage.java → Page Object Class
│
└── test
└── java
└── LoginTest.java → TestNG Test Class

pgsql
Copy code

---

## 🧩 LoginPage.java (POM Class)

All locators and actions of the login page are written here.

```java
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
```
🧪 LoginTest.java (TestNG Class)
```
Valid Login Test (Positive Test Case)
java
Copy code
@Test(priority = 1)
public void validLoginTest() {
    LoginPage.username(driver).sendKeys("standard_user");
    LoginPage.password(driver).sendKeys("secret_sauce");
    LoginPage.loginButton(driver).click();

    Assert.assertEquals(driver.getCurrentUrl(),
            "https://www.saucedemo.com/inventory.html");
    System.out.println("Valid Login Test Passed");
}
Invalid Login Test (Negative Test Case)
java
Copy code
@Test(priority = 2)
public void invalidLoginTest() {
    driver.get("https://www.saucedemo.com/");

    LoginPage.username(driver).sendKeys("wrong_user");
    LoginPage.password(driver).sendKeys("wrong_pass");
    LoginPage.loginButton(driver).click();

    String error = LoginPage.errorMessage(driver).getText();
    Assert.assertTrue(error.contains("Epic sadface"));
    System.out.println("Invalid Login Test Passed");
}
````
🔄 Execution Flow for Login Test
less
Copy code
```
@BeforeTest → Launch Browser  
@Test → Execute Login Test  
@AfterTest → Close Browser
````  
🎯 What This Login Automation Covers
✔ Positive testing (Valid login)
✔ Negative testing (Invalid login)
✔ Explicit wait handling
✔ Assertions validation
✔ POM design pattern
✔ TestNG structure
✔ Real website automation


📌 What I Have Achieved Till Now
✔ Selenium setup

✔ Maven project creation

✔ Dependencies handled via pom.xml

✔ TestNG integration

✔ Browser automation executed

✔ Page Object Model implemented

✔ Git version control used

✔ Professional project structure followed

🚀 Current Status
I have completed around 60% of Selenium:

Selenium basics

TestNG framework

Maven setup

POM design

Copy code
