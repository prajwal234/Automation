package org.example;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int count=0;//neverrerun
    int maxTry=1;//maxnooftimestorun

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<maxTry){
            count++;
            return true;
        }
        return false;
    }
}
