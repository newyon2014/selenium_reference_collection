package Selenium_Coding.JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HttpsSiteTest {
    // Selenium webdriver is used to automate web applications.Web applications generally starts
    // with http://www.example.com......But some websites like internal websites or banking or
    // secured web sites will starts with https://www.example.com

    // Here we are taking help of Java script to click the second link "Continue to this website (not recommended). "
        WebDriver driver;

        @Test
        public void httpsTest() throws Exception {
            driver.get("https://www.example.com.");

            //JavaScript to click the link
            driver.navigate().to("javascript:document.getElementById('overridelink').click()");
            Thread.sleep(5000);

            //assert the title of the page
            Assert.assertEquals(driver.getTitle(), "Example Domain");
            System.out.println("asssert successfull");
            Thread.sleep(5000);
        }

        @BeforeTest
        public void beforeTest() {

            //launch Internet explorer
            System.setProperty("webdriver.ie.driver", "D:\\Softwares\\IEDriverServer_Win32_2.51.0\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        @AfterTest
        public void afterTest() {
            driver.close();
            driver.quit();
        }
    }

