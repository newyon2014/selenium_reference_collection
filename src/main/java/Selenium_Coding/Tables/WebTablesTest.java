package Selenium_Coding.Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTablesTest {

    public WebDriver driver;

    @Test
    public void testWebTableTest() throws Exception {
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Sortable Data Tables")).click();

        //get number of columns and print column names
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
        System.out.println("NUmber of columns : " + columns.size());
        for (WebElement col : columns) {
            System.out.println("Columns are : " + col.getText());
        }

        //get number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("Number of rows : " + rows.size());
        for (WebElement row : rows) {
            System.out.println("Rows are : " + row.getText());
        }

        //get content
        System.out.println("Cell content is " + selectTableContent(2, 3));
        Thread.sleep(3000);
    }
    //method to get table content.
    public String selectTableContent(int row, int column) {
        String content = driver.findElement(By.xpath("//table[@id='table1']//tr[" + row + "]/td[" + column + "]")).getText();
        return content;
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass() {
        //close browser
        driver.quit();
    }

}
