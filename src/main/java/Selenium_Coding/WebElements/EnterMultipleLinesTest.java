package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterMultipleLinesTest {
    //Q. How to type text in a new line inside a text area ?
    //   Ans- Use \n for new line.

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");

        WebElement element = driver.findElement(By.xpath("xpath of textbox"));
        element.sendKeys("Line1\\nLine2"); // --> it will type in text box as Line1. and Line2 on new line.



    }
}
