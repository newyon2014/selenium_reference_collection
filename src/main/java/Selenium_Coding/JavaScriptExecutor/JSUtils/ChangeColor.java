package Selenium_Coding.JavaScriptExecutor.JSUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeColor {
    public static void changeColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].style.backgroundColor = '"+color+"'",element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
