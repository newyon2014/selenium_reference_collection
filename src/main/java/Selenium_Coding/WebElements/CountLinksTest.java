package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class CountLinksTest {
    //Q. Count the number of links in a page.
    // Ans- use the locator By.tagName and find the elements for the tag //a then use
    //      loop to count the number of elements found.

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        driver.manage().window().maximize();

        int count = 0;
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println(linkList.size()); // this will print the number of links in a page.
    }
}
