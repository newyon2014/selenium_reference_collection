package Selenium_Coding.Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingBrowsersTest {
    public static void main(String[] args) {
        //Launching IE
        System.setProperty("webdriver.ie.driver", "C://Program Files/eclipse/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://newtours.demoaut.com/");

        //Comparison between driver.close() VS driver.quit();
        driver.close(); // --> Closes the current window which the driver is focused on
        driver.quit(); // --> Close all the browser windows opened by the driver instance

        // Launching Chrome
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driverChrome = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
    }
}

