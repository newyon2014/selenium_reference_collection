package Selenium_Coding.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumberOfFramesTest {

    public static void main(String[] args) {
        // Launching Chrome
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

        //In this scenario, if you know the total number of frames in the web page then using the index,
        // you can easily switch.The index generally starts with zero so if you have only one frame then
        // the index will be zero.

        // How to identify the total number of Frames in the application?
        int totalFrame = driver.findElements(By.tagName("iframe")).size();

        int indexNumber = 6;

        try {
            driver.switchTo().frame(indexNumber);
        } catch (NoSuchFrameException e) {
            System.out.println(e.getMessage());
        }
    }
}

