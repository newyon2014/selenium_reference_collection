package Selenium_Coding.ActionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.jqueryscript.net/demo/price-Rnage-Slider-jQuery-UI/");

        driver.manage().window().maximize();

        WebElement minSlider = driver.findElement(By.xpath("//span[1]"));
        minSlider.getLocation(); // --> To get the location
        minSlider.getSize(); // --> To get the size

        Actions act = new Actions(driver);
        act.dragAndDropBy(minSlider,100,0).perform();
    }
}
