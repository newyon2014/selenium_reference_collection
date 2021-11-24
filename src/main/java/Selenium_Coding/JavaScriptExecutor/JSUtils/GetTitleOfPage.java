package Selenium_Coding.JavaScriptExecutor.JSUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfPage {
    public static String getTitle(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title =  js.executeScript("return document.title;").toString();
        return title;
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        getTitle(driver);
    }
}
