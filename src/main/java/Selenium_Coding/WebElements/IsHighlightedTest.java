package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsHighlightedTest {
    //Q1. How to check if an element is Highlighted on the web page ?
    //    Ans- Here if both color and backcolor are different , then that means element is highlighted.

    //Using JavaScriptExecutor

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");

        String color = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("color");
        String backcolor = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("background-color");

        System.out.println(color);
        System.out.println(backcolor);
    }
}
