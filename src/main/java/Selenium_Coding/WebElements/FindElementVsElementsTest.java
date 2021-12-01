package Selenium_Coding.WebElements;

public class FindElementVsElementsTest {
    // Q1. What is the difference between findElement and findElements?
    //      Ans-
    //         Both methods are abstract method of WebDriver interface and used to find the WebElement in a web page.
    //         findElement() - it used to find the one web element. It returns only one WebElement type.
    //         findElements()- it used to find more than one web element. It returns List of Web Elements.

    // Q2. Q41. How do u get the attribute of the web element ?
    //     Ans-
    //         driver.getElement(By.tagName("img")).getAttribute("src") will give you the src attribute of this tag.
    //         Similarly, you can get the values of attributes such as title, alt etc.
    //         Similarly, you can get CSS properties of any tag by using getCssValue("some property name").



}
