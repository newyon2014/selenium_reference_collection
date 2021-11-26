package Selenium_Coding.Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeApplicationTest {
    // Q1. How to invoke an application in webserver ?

    public static void main(String[] args) {
        // Launching Chrome
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

        driver.get("url");
        driver.navigate().to("url");

    }
}
