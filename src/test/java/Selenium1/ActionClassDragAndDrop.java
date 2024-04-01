package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClassDragAndDrop //Drag and drop
 {


    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement from =  driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement to =  driver.findElement(By.xpath("//div[@id='column-b']"));
        Actions builder = new Actions(driver);
      //  builder.dragAndDrop(from,to).perform();

        builder.clickAndHold(from).moveToElement(to).release().perform(); //check if above or this work and apply accordingly.


    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}