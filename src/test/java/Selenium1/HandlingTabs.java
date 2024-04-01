package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlingTabs {


    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new ChromeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() {
        driver.get("https://the-internet.herokuapp.com/windows");

        String mainWindowHandle = driver.getWindowHandle(); // store and handle the current window

        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        // after clicking we will have two windows . one old and one new tab


        Set<String> windowHandles = driver.getWindowHandles(); // now we have two window handles will store here

        for(String handle :windowHandles){  //iterate through separate handles

            driver.switchTo().window(handle);

                    if(driver.getPageSource().contains("New Window")){  //its s text present at new tab
                        System.out.println("We found the child tab");

                    }
        }

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}