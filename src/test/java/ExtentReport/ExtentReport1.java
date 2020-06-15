package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReport1 {
    ExtentReports extentReports;

    @BeforeTest
    public void config(){
      String path =  System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("MYfirst Automation Report");
        reporter.config().setDocumentTitle("Test Results");

        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Tester","Pranav Pothiwala");
    }

    @Test
    public void intialDemo(){
        ExtentTest test = extentReports.createTest("InitialDemo");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.betconstruct.com/");
        System.out.println(driver.getTitle());
        driver.quit();
        test.fail("Result do not match");
        extentReports.flush();

    }
}
