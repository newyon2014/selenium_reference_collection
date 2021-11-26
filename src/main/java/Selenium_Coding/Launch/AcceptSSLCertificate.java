package Selenium_Coding.Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AcceptSSLCertificate {
    public static void main(String[] args) {
        //It create firefox profile
        FirefoxOptions ffProfile = new FirefoxOptions();
        ChromeOptions chromeOptions = new ChromeOptions();

        // This will set the true value
        ffProfile.setAcceptInsecureCerts(true);
        chromeOptions.setAcceptInsecureCerts(true);

        // This will open Firefox browser using above created profile
        WebDriver driverFF = new FirefoxDriver(ffProfile);
        WebDriver driverChrome = new ChromeDriver(chromeOptions);

        driverFF.get("pass the url as per your requirement");
        driverChrome.get("pass the url as per your requirement");
    }
}
