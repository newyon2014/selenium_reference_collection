package Selenium_Coding.ActionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("-----"));//source ele which you want to drag
        WebElement target = driver.findElement(By.xpath("------")); //target where you want to drop
        act.dragAndDrop(source,target).perform();

    }
}
