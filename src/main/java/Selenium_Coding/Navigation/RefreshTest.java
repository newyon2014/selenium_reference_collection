package Selenium_Coding.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTest {

    //Q15. How do you simulate browser back and forward ?
    //     Ans- driver.navigate().back(); driver.navigate().forward();

    public static void main(String[] args) {
        // Launching Chrome
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

        // Refresh/reload page
        driver.navigate().refresh();

    }
}
