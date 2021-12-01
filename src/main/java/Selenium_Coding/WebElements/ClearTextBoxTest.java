package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTextBoxTest {
    // Q1. How do you clear the contents of a textbook in selenium ?
    //     Ans- use clear() method. syntax-

    public static void main(String[] args) {
        // Start firefox browser
        FirefoxDriver driver = new FirefoxDriver();

        // start the application
        driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");

        driver.findElement(By.xpath("xpath of box")).clear();

    }
}
