package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {

    WebDriver driver;

    public void launchBrowser() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        driver.get("https://www.goibibo.com/");
        driver.get("https://www.makemytrip.com/");
    }

    public void closeBrowser() {
        driver.close();
    }
}
