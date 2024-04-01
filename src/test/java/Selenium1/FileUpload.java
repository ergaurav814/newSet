package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {


    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new ChromeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() {
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement file = driver.findElement(By.id("fileToUpload"));
        file.sendKeys("C:\\Users\\divya\\IdeaProjects\\Selenium1\\src\\test\\java\\Selenium1\\test.txt");
        driver.findElement(By.xpath("//input[@name='submit']")).click();


    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}