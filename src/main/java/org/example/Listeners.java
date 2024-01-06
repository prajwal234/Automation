package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener {

    ExtentReports reporterNG=ExtentReporterNG.getReport();
    ExtentTest test;
    ThreadLocal<ExtentTest> local=new ThreadLocal<ExtentTest>();

    @Override
    public void onTestStart(ITestResult result) {

        test=reporterNG.createTest(result.getMethod().getMethodName());
        local.set(test);
    }

    @Override
    public void onFinish(ITestContext context) {
        reporterNG.flush();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        local.get().log(Status.PASS,"Test Passed");
//        ITestListener.super.onTestSuccess(result);

    }
    @Override
    public void onTestFailure(ITestResult result) {
        local.get().fail(result.getThrowable());
        try {
            //to get driver info and instance
            driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String filePath= null;
        try {
            filePath = getScreenshot(result.getMethod().getMethodName(),driver);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        local.get().addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        local.get().log(Status.SKIP,"Test Skippedf");

       // ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }




}
