package Selenium_Coding.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SwitchToInnerFrame {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void switchToInnerText() {
        driver.get("http://demo.automationtesting.in/frames.html");

        driver.findElement(By.xpath("//a[normalize-space()='Iframe with an Iframe]")).click();

        // Switching to the outer iFrame using WebElement options
        WebElement outerFrame = driver.findElement((By.xpath("//*[@id='Multiple']/iframe")));
        driver.switchTo().frame(outerFrame);

        // Switching to the inner iFrame  using WebElement options
        WebElement innerFrame = driver.findElement((By.xpath("/html/body/section/div/div/ifrmae")));
        driver.switchTo().frame(innerFrame);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");

    }

    @AfterClass
    public void afterClass() {
        //close browser
        driver.quit();
    }
}
