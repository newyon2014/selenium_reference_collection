package Selenium_Coding.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PopUpAndAlertsTest {
    //Q1. How do you handle JAVA alert pop-up ?
    // Ans- To handle alert pop-ups, we need to 1st switch control to alert pop-ups then click on ok or
    //        cancel then move control back to main page.

    // How to check if the alert exist ?
    public static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://output.jsbin.com/usidix/1");

        String mainpage = driver.getWindowHandle();// focus on main page
        driver.findElement(By.cssSelector("input[value='Go!']")).click();

        if (isAlertPresent(driver)) {
            Alert alt = driver.switchTo().alert(); // switch to alert
            alt.accept();   // click on OK button
            alt.dismiss(); // click on cancel
            alt.getText(); // to get any text on the alert window ( if alert window displays any text)
            alt.sendKeys("Welcome"); // to type in the alert window if alert have any input box

            driver.switchTo().window(mainpage);//Move the control back to main page
            driver.close();
        }

        // Check Text on Alert Message
        if (isAlertPresent(driver)) {
            // This will capture error message
            String actualMessage = driver.findElement(By.id("emailId_err")).getText();

            // Store message in variable
            String expectMessage = "plz enter valid email";

            // Here Assert is a class and assertEquals is a method which will compare two values if both matches it
            // will run fine but in case if it does not match then it will throw an exception and fail testcases

            // Verify error message
            Assert.assertEquals(actualMessage, expectMessage);
        }
    }
}
