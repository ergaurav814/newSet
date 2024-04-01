package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebDriverWaits {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
    }

    @Owner("Promode")
    @Test
    public void test() throws InterruptedException {
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        List<WebElement> button_submit = driver.findElements(By.xpath("//button[contains(@class,\"btn--positive\")]/span[text()=\"Sign in\"]"));
        button_submit.get(0).click();

        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message.getText());

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));

        }

        // so without including wait its able to find the webelement but can not fetch its value as it comes with 2 sec lag.

    @AfterTest
    public void closeBrowser() {
        driver.quit();



    }


}
