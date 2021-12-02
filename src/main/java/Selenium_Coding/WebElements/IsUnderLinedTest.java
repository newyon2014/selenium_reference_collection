package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class IsUnderLinedTest {
    // Q42. How to check whether a text is underlined or not ?
    //      Ans- Identify by getCssValue(“border-bottom”) or sometime getCssValue(“text-decoration”)
    //           method if the cssValue is 'underline' for that WebElement or not.

    public static void main(String[] args) {
        // This is for when moving cursor over element that is going to be underlined or not-

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/?gfe_rd=ctrl&ei=bXAwU8jYN4W6iAf8zIDgDA&gws_rd=cr");

        String cssValueBeforeMovingCursor = driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");
        System.out.println("value" + cssValueBeforeMovingCursor);

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='Hindi']"))).perform();

        String cssValueAfterMovingCursor = driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");
        System.out.println("value over" + cssValueAfterMovingCursor);

        driver.close();
    }
}

