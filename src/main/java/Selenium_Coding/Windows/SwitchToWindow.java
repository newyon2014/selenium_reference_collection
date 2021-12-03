package Selenium_Coding.Windows;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToWindow {
    @Test
    public void TestPopUp() throws InterruptedException {
        // Open browser
        WebDriver driver = new FirefoxDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Load app
        driver.get("http://www.naukri.com/");

        // It will return the parent window name as a String
        String parent = driver.getWindowHandle();

        // This will return the number of windows opened by Webdriver and will return Set of St//rings
        Set<String> allWindows = driver.getWindowHandles();

        // Convert the set into an Array List
        ArrayList<String> tabs = new ArrayList<>(allWindows);

        // Switch to the third window/tab in the window
        driver.switchTo().window(tabs.get(2));
        System.out.println(driver.switchTo().window(tabs.get(2)).getTitle());
        driver.close();

        // Switch to the second window/tab in the window
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.switchTo().window(tabs.get(1)).getTitle());
        driver.close();

        // Switch to the parent window/tab in the window
        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.switchTo().window(tabs.get(0)).getTitle());
        driver.close();
    }
}
