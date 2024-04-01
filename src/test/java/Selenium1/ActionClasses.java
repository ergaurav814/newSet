package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ActionClasses {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new ChromeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() throws InterruptedException {
        String URL = "https://www.makemytrip.com";
        driver.get(URL);
        //  driver.manage().window().maximize();

        Actions action = new Actions(driver);

        Thread.sleep(6000);
//

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath))



        WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
        action.moveToElement(fromCity).click().sendKeys("New Delhi,India").build().perform();

        // above code will not help us in clicking that new delhoi so for that do the following

        List<WebElement> li = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));

        for (WebElement e : li) {

            if (e.getText().contains("New Delhi,India")) {

                e.click();
            }

            System.out.println(e.getText());
        }
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}