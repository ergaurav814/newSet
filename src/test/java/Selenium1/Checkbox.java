package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> allcheck = driver.findElements(By.xpath("//form[@id='checkboxes']"));
        System.out.println(allcheck.isEmpty());


        for(WebElement checkbox: allcheck){

            // check if checkbox is not already checked
            if(!checkbox.isSelected()){

                checkbox.click();
            }

        }
     //    driver.quit();

    }

}
