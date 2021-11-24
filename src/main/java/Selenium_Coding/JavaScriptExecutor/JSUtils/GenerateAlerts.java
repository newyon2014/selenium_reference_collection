package Selenium_Coding.JavaScriptExecutor.JSUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateAlerts {
    public static void generateAlert(WebDriver driver, String message) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('"+ message + "')");
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        generateAlert(driver,"This is my Alert ...");
    }
}
