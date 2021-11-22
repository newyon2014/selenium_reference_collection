package Selenium_Coding.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DeleteAllCookies {
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
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().deleteAllCookies();

        // Size of cookie after deleting ALL cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());
    }

    @AfterTest
    public void afterClass() {
        //close browser
        driver.quit();
    }
}
