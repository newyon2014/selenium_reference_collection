package Selenium_Coding.Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AddCookieToBrowser {
    WebDriver driver;

    @BeforeTest
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void printCookies() {
        Cookie cookieObj = new Cookie("MyCookie123", "123456");
        driver.manage().addCookie(cookieObj);

        driver.get("https://demo.nopcommerce.com/");

        // Size of cookie after adding
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());
    }

    @AfterTest
    public void afterClass() {
        //close browser
        driver.quit();
    }
}
