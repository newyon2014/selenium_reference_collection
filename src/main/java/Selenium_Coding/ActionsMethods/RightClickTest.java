package Selenium_Coding.ActionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickTest {
    @Test
    public void TestClick() throws Exception{
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);
        act.contextClick(driver.findElement(By.linkText("Gujarati"))).build().perform();

        // Search Right-Click Menu option
        act.contextClick(driver.findElement(By.linkText("Gujarati")))
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER) // -> Select the third option on the menu
                .build()
                .perform();
    }
}

