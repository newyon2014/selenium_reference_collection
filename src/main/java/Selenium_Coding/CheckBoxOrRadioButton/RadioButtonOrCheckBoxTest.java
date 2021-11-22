package Selenium_Coding.CheckBoxOrRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class RadioButtonOrCheckBoxTest {
    //Q1. How do you verify if the checkbox/radio is checked or not?
    //    Ans- We can use isSelected() method.

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("password")).submit();
        boolean state = driver.findElement(By.cssSelector("input[value='roundtrip']")).isSelected();
        if (state)
            System.out.println("check box selected");
        else
            System.out.println("Check box not selected");

        // select a specific Check box
        driver.findElement(By.xpath("//input[@id='Monday']")).click();

        // Select ALL the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        for(WebElement element:checkBoxes){
            element.click();
        }

        // Select multiple Check boxes - Monday and Sunday
        for(WebElement element:checkBoxes){
            if(element.getAttribute("id").equalsIgnoreCase("Monday")
               || element.getAttribute("id").equalsIgnoreCase("Sunday")){
                element.click();
            }
        }
        // Select the last 2 Check boxes
        checkBoxes.get(checkBoxes.size()-1).click();
        checkBoxes.get(checkBoxes.size()-2).click();

    }

}

