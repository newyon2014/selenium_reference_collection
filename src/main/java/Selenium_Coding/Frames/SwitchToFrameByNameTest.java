package Selenium_Coding.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SwitchToFrameByNameTest {
    //iFrame is a HTML document embedded inside an HTML document. iFrame is defined by
    // an <iframe></iframe> tag in HTML. With this tag you can identify an iFrame while inspecting the HTML tree.

    // We can use the switchTo().frame() in three ways:
            //SwitchTo.frame(int frameNumber): Pass the frame index and driver will switch to that frame.
            //SwitchTo.frame(string frameNameOrId): Pass the frame element Name or ID and driver will switch to that frame.
            //SwitchTo.frame(WebElement frameElement): Pass the frame web element and driver will switch to that frame.

    public static void main(String[] args) {
        //Scenario II - In this scenario, if you know the name  of frames in web page then using name also,
        //              you can easily switch

        // Launching Chrome
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

       // WebElement frameName= driver.findElement(By.tagName("iframeName"));

        // The iframe will have an ID attribute - example iframeName

        try {
            driver.switchTo().frame("iframeName");
        } catch (NoSuchFrameException e) {
            System.out.println(e.getMessage());
        }
    }
}
