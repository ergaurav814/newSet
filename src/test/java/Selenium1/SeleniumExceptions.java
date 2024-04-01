package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumExceptions {


    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new ChromeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() {

        try {
            driver.get("https://www.google.com");
            WebElement add = driver.findElement(By.id("APjFqb"));
            driver.navigate().refresh();
            add.sendKeys("this");
        }

        catch (StaleElementReferenceException e) {
          //  System.out.println(e.getMessage());
            System.out.println("element expired");
        }
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}