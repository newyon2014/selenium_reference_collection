package Selenium_Coding.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ScrollTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.flipkart.com/womens-clothing/pr?sid=2oq,c1r&otracker=hp_nmenu_sub_women_1_View%20all");
        driver.manage().window().maximize();

        JavascriptExecutor jsx = (JavascriptExecutor) driver;

        //Scroll bottom of the Page:
        jsx.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight," +
                "document.body.scrollHeight," +
                "document.documentElement.clientHeight));");

        //OPTION I - Scroll automatically to your WebElement
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath("Value')]")));

        //OPTION II - Scroll automatically to your WebElement
        Point hoverItem =driver.findElement(By.xpath("Value")).getLocation();

        ((JavascriptExecutor)driver).executeScript("return window.title;");
        Thread.sleep(6000);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+(hoverItem.getY())+");");
        // Adjust your page view by making changes right over here (hoverItem.getY()-400)


        //Scroll down:
        //y value '4500' can be altered
        jsx.executeScript("window.scrollBy(0,4500)", "");

        //Scroll up:
        //x value '450' can be altered
        jsx.executeScript("window.scrollBy(450,0)", "");
    }
}
