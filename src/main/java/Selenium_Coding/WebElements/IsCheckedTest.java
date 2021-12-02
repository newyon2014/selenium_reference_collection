package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsCheckedTest {
    //Q1. How do you verify if the checkbox/radio is checked or not?
    //    Ans- We can use isSelected() method.

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");

        boolean state = driver.findElement(By.cssSelector("input[value='roundtrip']")).isSelected();
        if (state)
            System.out.println("check box selected");
        else
            System.out.println("Check box not selected");
    }
}
