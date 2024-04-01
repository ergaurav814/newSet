package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InterviewQuestion {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new ChromeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}