package Selenium_Coding.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypedTextFromTextBoxTest {
    // Q21. How to get typed text or default value from a textbook ?
    //      Ans- use getAttribute(“value”) method by passing arg as value.

    public static void main(String[] args) {
        // Start firefox browser
        FirefoxDriver driver = new FirefoxDriver();

        // start the application
        driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");

        //returns the value(what ever displayed in string) of the value tag(key) in the HTML document
        String typedText = driver.findElement(By.id("ID of edit box")).getAttribute("value");

    }

}
