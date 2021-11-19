package Selenium_Coding.ActionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyBoardEventsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        driver.manage().window().maximize();

        Actions act = new Actions(driver);
        act.contextClick(driver.findElement(By.linkText("Gujarati"))).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).
                build().
                perform();

        // How do you send TAB keys in WebDriver?
        act.sendKeys(Keys.TAB);

        // --> How do you send ENTER keys in WebDriver?
        act.sendKeys(Keys.ENTER);
        act.keyDown(Keys.ENTER); // Or this one.

        //  How to perform double click using WebDriver?
        WebElement element = driver.findElement(By.linkText("Gujarati"));
        act.doubleClick(element);

        //Scroll bottom of the Page:
        act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

        // Click the Top most link and open to New Tab
        WebElement link=driver.findElement(By.xpath("//div[@id='ires']/ol/div/div[1]/div/h3/a"));
        act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();

        //Click on a sub-menu
        //To perform click operation on sub menu, we need to use click() action before perform() as shown
       element = driver.findElement(By.xpath("//div[@id='menu1']/div"));
        act.moveToElement(element).moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a")))
                .click()
                .perform();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains("Google"));

        //  How to Select from auto-suggestion ?
            //find the element which we want
            WebElement ele = driver.findElement(By.xpath(".//*[@id='autosuggest']/ul/li[2]/a"));
            //use Mouse hover action for that element
            act.moveToElement(ele).build().perform();
            Thread.sleep(2000);
            // finally click on that element
            act.click(ele).build().perform();

    }
}
