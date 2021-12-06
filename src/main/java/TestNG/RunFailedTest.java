package TestNG;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class RunFailedTest {
    public static void main(String[] args) {

        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testNgRunner = new TestNG();
        List<String> list = new ArrayList<>();

        // Multiple lists can be added here from the TestNg failed list.
        list.add("c:/tests/testng1.xml");//path to xml..
        list.add("c:/tests/testng2.xml");

        testNgRunner.setTestSuites(list);

        testNgRunner.run();
    }
}
