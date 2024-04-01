package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableWithFollowingPerChild {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();


        // with tr[2] index is given because for row 2 there are 3 elements.
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(rows);
        System.out.println(col);


        //table[@id='customers']/tbody/tr[i]/td[j]
        // now breakdown the common part from both row and coloumn


        String part_1 = "//table[@id='customers']/tbody/tr[";
        String part2 = "]/td[";
        String part3 = "]";

        for (int i = 2; i <= rows; i++) {

            for (int j = 1; j <= col; j++) {

                String dynamic_path = part_1 + i + part2 + j + part3;// kind of cramming
                // System.out.println(dynamic_path); // will print eachj and individual path of every element present in table
               String data = driver.findElement(By.xpath(dynamic_path)).getText();
               // System.out.println(data);
                if (data.contains("Google")) {

                    String temp = dynamic_path + "/following-sibling::td[2]";
                    String country_google = driver.findElement(By.xpath(temp)).getText();
                    System.out.println(country_google);


                }

            }
        }

        driver.quit();
    }

}


