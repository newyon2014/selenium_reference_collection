package TestNG;

import org.testng.annotations.*;

public class AnnotationsTest {

    @Test // --> Attribute used as @Test (alwaysRun, dataProvider, dependsOnMethods, enabled, expectedExceptions, timeOut)
            //@Test(expectedExceptions = ArithmeticException.class)
            //@Test(timeOut = 2000)
    @BeforeSuite
    @AfterSuite
    @BeforeTest
    @AfterTest
    @BeforeClass // --> this will execute before every class.
    @AfterClass
    @BeforeMethod // --> this will execute before every @Test method
    @AfterMethod
    public void sampleMethod(){

    }
}
