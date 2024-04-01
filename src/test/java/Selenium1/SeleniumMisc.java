package Selenium1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumMisc {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() {
        driver.get("https://awesomeqa.com/webtable1.html");

        // we are only interested in tbdoy as they contain data
     WebElement table  = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

     // we dont have fix number of rows or colmns use tr tag there we should use this logic
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));

       for(int i = 0; i<rows_table.size();i++){
           List<WebElement> coloumns_table = rows_table.get(i).findElements(By.tagName("td"));

           for(WebElement element : coloumns_table){
               System.out.println(element.getText());
           }
       }

    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}