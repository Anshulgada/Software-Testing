package test;

import org.testng.annotations.Test;
public class TestNG1 {

    // @Test - Create one testcase
    // priority - order for testcases, it can be +ve or -ve
    // invocationCount - for running the testcase multiple times
    // enabled = false or invocation = 0 ==> for skipping the testcase

    @Test(priority = 2, invocationCount = 2)     // invocationCount = 2 means testcase runs 2 times
    public void enterUrl() {
        System.out.println("URL entered");
    }

    @Test(priority = 3, enabled = false)        // Sets the testcase to false as in not running the testcase
    public void closeBrowser() {
        System.out.println("Browser closed");
    }

    @Test(priority = -1)            // Sets the testcase priority to -1 means testcase runs before other testcases
    public void openBrowser() {
        System.out.println("Browser opened");
    }
}
