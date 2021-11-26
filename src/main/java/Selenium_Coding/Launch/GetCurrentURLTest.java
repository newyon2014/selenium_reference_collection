package Selenium_Coding.Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLTest {
    // Q. What's the difference between get9) and navigate.to() methods?
    // Ans:
        //Both methods are used for opening URL in the browser.there is no duffference between them.
        //They are synonyms for one another
        //The only difference that is found is in the parameters.
            //get() - accepts ONLY the string parameter
            //navigate().to() - accepts String parameter AND URL instance as a parameter.

    public static void main(String[] args) {
        // Launching Chrome
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

        driver.getCurrentUrl();

    }

}
