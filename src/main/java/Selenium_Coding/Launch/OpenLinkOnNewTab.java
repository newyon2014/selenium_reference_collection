package Selenium_Coding.Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenLinkOnNewTab {
    public static void main(String[] args) {
        //Launching IE
        System.setProperty("webdriver.ie.driver", "C://Program Files/eclipse/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://demo.nopcommerce.com/");

        String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);

        driver.findElement(By.linkText("Register")).sendKeys(tab);

    }
}
