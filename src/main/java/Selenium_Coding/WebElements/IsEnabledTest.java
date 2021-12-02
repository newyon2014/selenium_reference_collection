package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabledTest {
    //Q1. How to check if an element is enabled on the web page ?
    //    Ans- use isEnabled() method. The return type of the method is boolean.
    //         So if it returns true then button is enabled else not enabled.

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");

        boolean state = driver.findElement(By.cssSelector("input[value='roundtrip']")).isEnabled();
        if (state)
            System.out.println("check box is Enabled");
        else
            System.out.println("Check box disabled");
    }
}
