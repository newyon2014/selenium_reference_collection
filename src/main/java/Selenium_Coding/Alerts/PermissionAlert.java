package Selenium_Coding.Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PermissionAlert {
    // This is notification happens when we initially launch the browser.
    // It's as king user to allow or block the site.

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://output.jsbin.com/usidix/1");






    }
}
