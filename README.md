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

4. TestNG Framework
TestNG is used for:

Organizing test cases

Managing execution flow

Generating reports

Supporting annotations

Common annotations:

java
Copy code
@BeforeTest   // Browser setup  
@Test         // Actual test execution  
@AfterTest    // Close browser  
Execution flow:

less
Copy code
@BeforeTest → Setup browser  
@Test → Run test  
@AfterTest → Close browser  
TestNG makes tests:

Structured

Maintainable

Scalable

5. Page Object Model (POM)
POM is a design pattern where:

Each web page is represented as a separate class

Locators are written only once

Test logic and UI elements are separated

Benefits:

Code reusability

Easy maintenance

Clean architecture

Example usage:

java
Copy code
ebaypage.ebayserc(driver).sendKeys("laptop");
ebaypage.click(driver).click();
6. Running Tests
You can run tests in two ways:

Using IntelliJ:

Click ▶ near the @Test annotation

Using Maven:

bash
Copy code
mvn test
7. Git Usage
Git is used for version control:

bash
Copy code
git add .
git commit -m "Learnt TestNG automation"
git push origin main
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
