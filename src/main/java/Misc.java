public class Misc {

    // What is the difference between Assert and Verify?
    // Ans- Both are used for verify the result.
    //      When an “assert” fails, the test will be aborted.
    //      Where if a “verify” fails, the test will continue executing and logging the failure.

    // What is the difference b/w close() and quit()?
    // Ans-
    //      close() - it will close the browser where the control is.
    //      quit() - it will close all the browsers opened by WebDriver.

    // Q. What is the difference b/w getWindowHandles() and getWindowHandle() ?
    //      Ans-
    //          getWindowHandles()- is used to get the address of all the open browser and its return type is Iterator.
    //          getWindowHandle()- is used to get the address of the current browser where the control is
    //          and return type is String.

    // Q. what are the different assertions or check points used in your script?
    //      Ans-
    //         The common types of validations are:
    //              a) Is the page title as expected
    //              b) Validations against an element on the page
    //              c) Does text exist on the page
    //              d) Does a javascript call return an expected value method used for validation – Assert.assertEquals();
}
