package Selenium_Coding.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SwitchToFrameByIndexTest {
    //iFrame is a HTML document embedded inside an HTML document. iFrame is defined by
    // an <iframe></iframe> tag in HTML. With this tag you can identify an iFrame while inspecting the HTML tree.

    // We can use the switchTo().frame() in three ways:
            //SwitchTo.frame(int frameNumber): Pass the frame index and driver will switch to that frame.
            //SwitchTo.frame(string frameNameOrId): Pass the frame element Name or ID and driver will switch to that frame.
            //SwitchTo.frame(WebElement frameElement): Pass the frame web element and driver will switch to that frame.

    public static void main(String[] args) {
        // Launching Chrome
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

        // How to switch to a particular frame using index?
        List<WebElement> frameIndex = driver.findElements(By.tagName("iframe"));

        int indexNumber = 2; // Assuming that we have a total of 2 iFrames in the list above.

        try {
            driver.switchTo().frame(frameIndex.get(indexNumber));
        } catch (NoSuchFrameException e) {
            System.out.println(e.getMessage());
        }
    }
}
