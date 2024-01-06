package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).click();
        driver.findElement(By.xpath("(//div[contains(text(),'Agartala')])[1]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-b5h31w r-95jzfe')]//div[4]/div[1]"));
    }
}
