package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWidthHeightTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");

        driver.findElement(By.xpath("xpath of textbox")).getSize().getWidth();
        driver.findElement(By.xpath("xpath of textbox")).getSize().getHeight();
    }
}
