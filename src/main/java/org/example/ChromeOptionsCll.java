package org.example;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsCll {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions opts = new ChromeOptions();
        //opts.addExtensions("");-we add any extensions that required for automation
        Proxy proxy=new Proxy();
        proxy.setHttpProxy("ipAddress:4444");
        opts.setCapability("proxy",proxy);
        WebDriver driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
    }
}
