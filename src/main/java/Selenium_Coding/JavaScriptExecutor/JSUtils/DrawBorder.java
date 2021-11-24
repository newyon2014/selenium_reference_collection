package Selenium_Coding.JavaScriptExecutor.JSUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DrawBorder {
    public static void drawBorder(WebElement element , WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].style.border='3px solid red'",element);
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("element"));
        drawBorder(element,driver);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File (".\\screenshots\\logo.png");
        try {
            FileUtils.copyFile(src,target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
