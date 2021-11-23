package Selenium_Coding.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;


public class RegularDropDownTest {
    //Q14. How do you click on a menu item in a drop down menu?
    //     Ans- if that menu has been created by using select tag then we can use the methods
    //          selectByValue()
    //          or selectByIndex() or
    //          selectByVisibleText().
    //          These are the methods of the Select class. If the menu has not been created by using the select tag
    //          then we can simply find the xpath of that element and click on that to select.

    //Generic Method
    public static void SelectOptionFromDropDown(WebElement element, String value) {
        Select dropDown = new Select(element);
        List<WebElement> allOptions = dropDown.getOptions();

        for (WebElement option : allOptions) {
            if (option.getText().equalsIgnoreCase("value")) {
                option.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //*************************************************************************
        //Generic Method Test
        //Example - I
        WebElement noOfEmpElement = driver.findElement(By.name("NoOfEmployees"));
        SelectOptionFromDropDown(noOfEmpElement, "16-20");

        //Example - II
        WebElement industryElement = driver.findElement(By.name("Industry"));
        SelectOptionFromDropDown(industryElement, "Travel");

        //Example - III
        WebElement countryDrpDown = driver.findElement(By.name("Country"));
        SelectOptionFromDropDown(industryElement, "Aruba");
        // ***********************************************************************

        WebElement month_dropdown = driver.findElement(By.id("month"));
        Select month = new Select(month_dropdown);
        month.selectByIndex(4);
        month.selectByValue("5");
        month.selectByVisibleText("Aug");

        //Get First Selected option from Dropdown.
        month_dropdown = driver.findElement(By.id("month"));
        month = new Select(month_dropdown);
        WebElement first_value = month.getFirstSelectedOption();
        String value = first_value.getText();

        // Get All option from dropdown
        month_dropdown = driver.findElement(By.id("month"));
        month = new Select(month_dropdown);
        List<WebElement> dropdown = month.getOptions();

        for (int i = 0; i < dropdown.size(); i++) {
            String drop_down_values = dropdown.get(i).getText();
            System.out.println("dropdown values are " + drop_down_values);
        }
    }


}
