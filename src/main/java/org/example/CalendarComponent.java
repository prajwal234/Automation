package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CalendarComponent {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[text()='Departure']/following-sibling::p)[1]")).click();
        //to select only one particular month
        while(!driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Month')]/following-sibling::div")).getText().contains("March")){
            driver.findElement(By.xpath("(//div[contains(@class,'DayPicker-Months')]/../div/span)[2]")).click();
        }
        List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day')]/div"));
        int e = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day')]/div")).size();
        for (int i = 0; i < e; i++) {
            String txt = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day')]/div")).get(i).getText();
            System.out.println(txt);
            if (txt.equalsIgnoreCase("31")) {
                driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day')]/div")).get(i).click();
                break;
            }
        }
    }

}
