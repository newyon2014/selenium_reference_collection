package Selenium_Coding.ActionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.jqueryscript.net/demo/price-Rnage-Slider-jQuery-UI/");

        driver.manage().window().maximize();

        //Actions - Class
        Actions act = new Actions(driver);
        WebElement features = driver.findElement(By.xpath("//a[@title=Women']"));
        act.moveToElement(features).perform();

        //Action - Interface
        Action action = act.moveToElement(features).build(); // Create an action
        action.perform(); // Execute an action

    }
}
