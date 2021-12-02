package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsVisibleTest {
    //Q1. How to check if an element is visible on the web page ?
    //    Ans- use isDisplayed() method. The return type of the method is boolean.
    //         So if it return true then element is visible else not visible.

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");

        boolean state = driver.findElement(By.cssSelector("input[value='roundtrip']")).isDisplayed();
        if (state)
            System.out.println("check box is displayed");
        else
            System.out.println("Check box not displayed");
    }
}
