package Selenium_Coding.ScreenShots;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.testng.*;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class ScreenShotsTest implements ITestListener {
    WebDriver driver = new ChromeDriver();

    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenShot(driver);
            // getName will give you the Name of the Test case / Class name
            System.out.println("Screen shot captured=====" + result.getName());
        }
    }

    //Q. How do you take screenshot without using EventFiringWebDriver ?
    @AfterMethod
    public static void captureScreenShot(WebDriver driver) {
        System.setProperty("WebDriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        //now we can do anything with this screenshot like copy this to any folder-
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("folder name where u want to copy/file_name.png"));
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }

    }

    public static void main(String[] args) throws IOException {

    }

}
