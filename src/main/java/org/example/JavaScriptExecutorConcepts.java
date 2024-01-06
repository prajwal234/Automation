package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JavaScriptExecutorConcepts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        JavascriptExecutor exc = (JavascriptExecutor) driver;
        exc.executeScript("window.scrollBy(0,600");
        Thread.sleep(4000);
        exc.executeScript("document.querySelector('.tableFixHead').scrollTop=4500");

        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(int i=0;i<values.size();i++){
            sum=sum+Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
      int total=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());

    }
}
