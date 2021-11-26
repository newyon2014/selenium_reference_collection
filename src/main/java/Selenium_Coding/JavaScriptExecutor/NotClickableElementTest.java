package Selenium_Coding.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NotClickableElementTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.flipkart.com/womens-clothing/pr?sid=2oq,c1r&otracker=hp_nmenu_sub_women_1_View%20all");
        driver.manage().window().maximize();

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        WebElement elementToClick = driver.findElement(By.xpath("Your xpath"));

        // Scroll the browser to the element's Y position
        jsx.executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");

        // Click the element
        elementToClick.click();

        // Scroll the browser to the element's X position
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().x + ")");

        // Click the element
        elementToClick.click();
    }
}
