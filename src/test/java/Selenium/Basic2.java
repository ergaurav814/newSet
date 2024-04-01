package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic2 {

    public static WebDriver driver;

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");


    }



@Test
    public void positiveCase() throws InterruptedException {

       WebElement button1= driver.findElement(By.id("js-login-btn"));
       button1.click();
       Thread.sleep(5000);



    }

    @AfterTest

    public void CloseBrowser(){

        driver.quit();


    }

    }



