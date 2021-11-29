package Selenium_Coding.OOPSConcepts;

import org.openqa.selenium.support.ui.Select;

public class MethodOverloadingTest {
    Select list;

    public MethodOverloadingTest(Select list) {
        this.list = list;
    }

    public void select(int i) {
        this.list.selectByIndex(i);
    }

    public void select(String text) {
        this.list.selectByVisibleText(text);
    }

    public void deSelect(int i) {
        this.list.deselectByIndex(i);
    }

    public void deSelect(String text) {
        this.list.deselectByVisibleText(text);
    } //other methods


}
