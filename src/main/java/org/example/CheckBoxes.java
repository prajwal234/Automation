package org.example;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElements(By.cssSelector("input[type*='Checkbox']")).size();
        int i =1;
        while(i<5){
            driver.findElement(By.xpath("[data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
        }
        driver.findElement(By.xpath("//div[text()='Done']")).click();
        driver.findElement(By.cssSelector(".css-21dbjc4n")).getText();
    }
}
