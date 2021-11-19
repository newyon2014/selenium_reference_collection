package Selenium_Coding.Architecture;

public class Description {
    // Selenium 3
    /*
    The architecture for Selenium 3 includes the JSON Wire Protocol. However, Selenium 4 does not include the JSON Wire
     Protocol, and that’s the contrast between Selenium 3 and Selenium 4. JSON stands for JavaScript Object Notation.

     The JSON Wire Protocol has an assignment to transfer information from the client to the server over HTTP. HTTP
     is an acronym for Hyper Text Transfer Protocol. A Selenium request is sent from the Selenium Client and
     WebDriver Language Bindings component. Next, the request is received by JSON Wire Protocol Over HTTP, then
     secured by the Browser Driver.

     Afterwards, the request command is delivered to a Web Browser where the automation takes place. When the
     automation is complete, a response travels back to the Browser Driver, JSON Wire Protocol, and Selenium
     Client & WebDriver Language Bindings
     */

    // Selenium 4

    /*
    Unlike Selenium 3, Selenium 4 has direct communication between the client and server. The client still has 2
    parts (Selenium Client & WebDriver Language Bindings) while Browser Drivers are the server.
            Selenium Client sends out a request to perform a command.
            The WebDriver Language Bindings is a code library designed to drive actions.
            Browser Drivers receive the request and then return a response after an automation Test Script executes on
            the Web Browser:

    The Selenium Client & WebDriver Language Bindings is a part of the architecture where each
    language has their own unique bindings. Bindings mean that the same commands written for one language are also
    written for another language. For example, Java has a set of commands that have also been written for other
    languages (C#, Python JavaScript, and Ruby).

    When it comes to the Browser Drivers and Web Browsers, WebDriver drives each browser using the browser’s
    built-in automation support. A Browser Driver such as ChromeDriver controls the Chrome browser.

      In Selenium 4, a change was made to the drivers. ChromeDriver and EdgeDriver
     extend ChromiumDriver while RemoteWebDriver is the parent to ChromiumDriver
     */

}
