package Selenium_Coding.DropDowns.JQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class JQueryDropDowns {
    //Sample DOM
   // <div class="logoSelect"style="z-index:1; top:878px;">==$0
     //<ul>
            //  <li class="logoSelectOpt" id="12" onmouseover="jQuery(QWE01Title.activate(this);" onmouseout="jQuery(QWE01Title.deactivate(this);" onmousedown="jQuery(QWE01Title.selectItem(this);" logoColor="#FFF">Facts</li>==0
            //  <li class="logoSelectOpt" id="12" onmouseover="jQuery(QWE01Title.activate(this);" onmouseout="jQuery(QWE01Title.deactivate(this);" onmousedown="jQuery(QWE01Title.selectItem(this);" logoColor="#FFF">History</li>==0
            //  <li class="logoSelectOpt" id="12" onmouseover="jQuery(QWE01Title.activate(this);" onmouseout="jQuery(QWE01Title.deactivate(this);" onmousedown="jQuery(QWE01Title.selectItem(this);" logoColor="#FFF">Opinions</li>==0
            //  <li class="logoSelectOpt" id="12" onmouseover="jQuery(QWE01Title.activate(this);" onmouseout="jQuery(QWE01Title.deactivate(this);" onmousedown="jQuery(QWE01Title.selectItem(this);" logoColor="#FFF">Questions</li>==0
     //</ul>
  //</div>
    public static void main(String[] args) throws InterruptedException {
        // Start firefox browser
        FirefoxDriver driver = new FirefoxDriver();

        //using CSS Selector
        driver.findElement(By.id("imgSelectButton")).click();
        List<WebElement> list = new WebDriverWait(driver, 20).
                until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.logoSelect > ul li.logoSelectOpt")));
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("History")){
                list.get(i).click();
                break;
            }
        }
        // Using Xpath
        driver.findElement(By.id("imgSelectButton")).click();
        List<WebElement> listXpath = new WebDriverWait(driver, 20).
                until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='logoSelect']/ul//li[@class='logoSelectOpt']")));
        System.out.println(list.size());
        for(int i=0; i<listXpath.size(); i++){
            System.out.println(listXpath.get(i).getText());
            if (listXpath.get(i).getText().contains("History")){
                listXpath.get(i).click();
                break;
            }
        }

    }
}
