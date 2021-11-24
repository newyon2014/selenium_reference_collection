package Selenium_Coding.JavaScriptExecutor.JSUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static Selenium_Coding.JavaScriptExecutor.JSUtils.ChangeColor.changeColor;

public class FlashElement {
    public static void clickElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {
            changeColor("#000000", element, driver);
            changeColor(bgcolor, element, driver);
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("element"));
        clickElement(driver, element);

    }
}
