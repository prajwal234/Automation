package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownUpdated {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector(".css-21dbjc4n")).click();

        int i =1;
        while(i<5){
            driver.findElement(By.xpath("[data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
        }
        driver.findElement(By.xpath("//div[text()='Done']")).click();
        driver.findElement(By.cssSelector(".css-21dbjc4n")).getText();
    }
}
