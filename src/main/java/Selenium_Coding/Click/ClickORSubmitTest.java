package Selenium_Coding.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickORSubmitTest {
    //Q1. What is the alternate way to click on login button?
       // Ans- use submit() method but it can be used only when attribute type=submit.
     public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("password")).submit(); }
}
