package Selenium_Coding.DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DeSelectDropDownsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/eclipse/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Get All option from dropdown
        WebElement month_dropdown = driver.findElement(By.id("month"));
        Select month = new Select(month_dropdown);
        month_dropdown = driver.findElement(By.id("month"));
        month = new Select(month_dropdown);
        List<WebElement> dropdown = month.getOptions();

        for (int i = 0; i < dropdown.size(); i++) {
            boolean selectedDropdowns = dropdown.get(i).isSelected();
            if (selectedDropdowns)
                month.deselectByIndex(i); // --> deselect by
                                                   // By Visible text - deselectByVisibleText()
                                                   // By Value - deselectByValue()
                                                   // deselect all - deSelectAll()
        }

    }

}
