package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//when there are no selective dropdown
public class AutoSuggestiveDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000L);
        List<WebElement> opts=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option:opts){
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }
    }
}
