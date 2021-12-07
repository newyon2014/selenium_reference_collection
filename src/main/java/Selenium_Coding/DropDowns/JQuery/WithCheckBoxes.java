package Selenium_Coding.DropDowns.JQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WithCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        selectChoiceValues(driver, "all");
        selectChoiceValues(driver, "choice1", "choice2", "choice3");
        selectChoiceValues(driver, "choice1", "choice3");
    }

    public static void selectChoiceValues(WebDriver driver, String... value) {
        List<WebElement> choiceList = driver.findElements(By.xpath("//span{@class='comboTreeitemTitle'"));

        if (!value[0].equalsIgnoreCase("all")) {
            for (WebElement item : choiceList) {
                String text = item.getText();
                for (String val : value) {
                    if (text.equalsIgnoreCase(val)) {
                        item.click();
                        break;
                    }
                }
            }
        }
        else{  // --> Scenario for the all option
            for (WebElement item:choiceList){
                item.click();
            }
        }
    }
}
