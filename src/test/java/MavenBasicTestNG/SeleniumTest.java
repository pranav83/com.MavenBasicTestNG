package MavenBasicTestNG;

import org.testng.annotations.Test;

public class SeleniumTest {

    //@TestNG xml file execute from maven

    @Test
    public void browserAutomation(){
        System.out.println("Automation End to End");

    }
    @Test
    public void elementUI(){
        System.out.println("UAT testing");
    }
}
