package Selenium_Coding.DropDowns.AutoSuggest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();

        //Typing in the search box
        driver.findElement(By.id("sbform_q")).sendKeys("Selenium");

        //Capturing the autosuggestion list based on the search entry
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sq']//span"));

        for(WebElement listItem:list){
           if(listItem.getText().contains("selenium")) {
               listItem.click();
               break;
           }
        }
    }
}
