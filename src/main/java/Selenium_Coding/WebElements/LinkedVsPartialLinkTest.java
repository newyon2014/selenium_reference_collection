package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LinkedVsPartialLinkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();

        // Using Linked Text
        driver.findElement(By.linkText("Today's Deals")).click();

        //Using Partial Linked Text
        driver.findElement(By.linkText("Deals")).click();
    }
}
