package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.util.List;
import java.util.Set;

public class Basics {

    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.close();



    }

}
