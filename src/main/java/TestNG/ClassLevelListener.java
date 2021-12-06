package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Selenium_Coding.ScreenShots.ScreenShotsTest.class)
public class ClassLevelListener {
    @Test
    public void loginFB() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("mukesh@facebook.com");
        driver.findElement(By.id("wronglocator")).sendKeys("dont-tell");
        driver.findElement(By.id("loginbutton")).click();
        driver.quit();
    }
}
