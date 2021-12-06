package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class SortVsHardAssert {
    @Test
    public void softAssert(){
        SoftAssert softAssertion= new SoftAssert();
        System.out.println("softAssert Method Was Started");
        softAssertion.assertTrue(true);
        System.out.println("softAssert Method Was Executed");
        softAssertion.assertAll();
    }

    @Test
    public void hardAssert(){
        System.out.println("hardAssert Method Was Started");
        Assert.assertFalse(false);
        System.out.println("hardAssert Method Was Executed");
    }
}
