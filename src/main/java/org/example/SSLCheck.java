package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions opts = new ChromeOptions();
        opts.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(opts);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
    }
}
