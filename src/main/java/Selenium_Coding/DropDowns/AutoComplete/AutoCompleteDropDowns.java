package Selenium_Coding.DropDowns.AutoComplete;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoCompleteDropDowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

        //Clear the search box default values (if any)
        WebElement searchBox = driver.findElement(By.id("autocomplete"));
        searchBox.clear();

        //Typing on the search box
        searchBox.sendKeys("Toronto");

        String text;

        do {
            searchBox.sendKeys(Keys.DOWN);
            text = searchBox.getAttribute("Value");
            if (text.equalsIgnoreCase("Toronto")) {
                searchBox.sendKeys(Keys.ENTER);
                break;
            }
        } while (!text.isEmpty());
    }
}
