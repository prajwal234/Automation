package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement ele = driver.findElement(By.xpath("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(ele);
        select.selectByIndex(3);
        select.getFirstSelectedOption().getText();
        select.selectByVisibleText("AED");
    }
}
