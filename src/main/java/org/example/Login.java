package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Login extends BrowserLaunch {

    private By txtFrom = By.xpath("(//p[text()='Enter city or airport'])[1]");

    private By txtTo = By.xpath("(//p[text()='Enter city or airport'])[2]");

    private By closeIcon = By.xpath("//span[@class='logSprite icClose']");

    private By close = By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']");

    private By departure = By.xpath("//span[text()='Departure']/..");

    private By date = By.xpath("(//p[text()='11'])[1]");

    private By btnDone = By.xpath("//span[text()='Done']");

    private By returnBtn = By.xpath("//span[text()='Return']/following-sibling::p");

    private By frameElement = By.xpath("(//div[@class='wrapper']//div/a/i)[1]");

    //div[contains(@class,'dropdownFieldWpr__inputWpr')]/following-sibling::ul//li[text()='Telangana']

//div[contains(@class,'dropdownFieldWpr__inputWpr')]

  //  dropdownFieldWpr__inputWpr

//span[contains(text(),'Continue')]

//p[text()='Orange Tours And Travels']/parent::div/parent::div/../following-sibling::div/../following-sibling::div/parent::div/following-sibling::div//div



    public void clickOnReturn() {
        WebElement ele = driver.findElement(returnBtn);
        ele.click();
    }

    public void clickOnDone() {
        WebElement ele = driver.findElement(btnDone);
        ele.click();
    }

    public void clickonDate() {
        WebElement ele = driver.findElement(date);
        ele.click();
    }


    public void enterText() {
        WebElement ele = driver.findElement(this.txtFrom);
        ele.click();
        driver.findElement(By.xpath("//span[text()='From']/following-sibling::input")).sendKeys("Bangalore");

    }

    public void selectPlace() {
        WebElement ele = driver.findElement(By.xpath("//label[@for='fromCity']"));
        ele.click();
    }

    public void selectPlaceForBus() {
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        ele.click();
    }



//    public void clickOnCloseFor(){
//        driver.switchTo().frame(3);
//        driver.findElement(By.xpath("//iframe/../../a")).click();
//        WebElement ele=driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']/i"));
//        ele.click();
//    }

    public void clickOnCloseFor() {
        driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
        driver.findElement(frameElement).click();
////        WebElement closeIcon = driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']/i"));
////        closeIcon.click();
        driver.switchTo().defaultContent();
    }

    public void selectBus() {
        WebElement ele = driver.findElement(By.xpath("//span[text()='Buses']"));
        ele.click();
    }

    public void clickOnSearch() {
        WebElement ele = driver.findElement(By.xpath("//button[@data-cy='submit']"));
        ele.click();
    }


    public void clickOnSearchForSeat() {
        String te=driver.findElement(By.xpath("(//div[contains(@class,'horiFilterBtn appendRight12 ')])[2]")).getText();
        System.out.println(te);
    }

    public void clickOnAlternateRoute(){
      //  driver.findElement(By.xpath("(//div[text()='Alternate Routes']/following::*)[10]")).click();
        WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'listingSprite acIcon appendRight11')]"));
        ele.click();
    }

    public void selectSeatType(){
        WebElement ele=driver.findElement(By.xpath("(//div[text()='Seat type']/../../div[2]//div)[2]"));
        ele.click();
        driver.findElement(By.xpath("(//span[contains(@class,'checkmarkOuter')])[1]")).click();
    }

    public void selectionOfPlace(){
        WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        ele.click();
    }

    public void listOfPlaces(){
        List<WebElement> ele=driver.findElements(By.xpath("(//ul[contains(@class,'dropdownWrap')])[2]"));
        for(WebElement eles:ele){
            ele.get(0).click();
        }
    }




    public void enterFromPlace() {
        WebElement ele = driver.findElement(By.xpath("//input[@id='fromCity']"));
        ele.sendKeys("Bangalore");
        //   driver.findElement(By.xpath("(//div[contains(@class,'calc60')])[1]")).click();
    }

    public void enterDestinationPlaceForBus() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("//input[@id='toCity']"));
        ele.sendKeys("Mumbai");
       // driver.findElement(By.xpath("(//span[@class='sr_city blackText'])[1]")).click();
    }

    public void enterDestinationPlace() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("//input[@id='toCity']"));
        ele.sendKeys("Mumbai");
        Thread.sleep(5000);
        //(//input[contains(@class,'fsw_inputField lineHeight36 latoBlack font30')])[2]
        driver.findElement(By.xpath("(//div[contains(@class,'calc60')])[1]")).click();
    }

    public void clickOnTravellerClass() {
        WebElement ele = driver.findElement(By.xpath("//div[@data-cy='flightTraveller']"));
        ele.click();
    }

    public void clickOnAdults() {
        WebElement ele = driver.findElement(By.xpath("//li[@data-cy='adults-2']"));
        ele.click();
    }

    public void clickOnApply() {
        WebElement ele = driver.findElement(By.xpath("//button[text()='APPLY']"));
        ele.click();
    }

    public void clickOnRoundTrip(){
        WebElement ele=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
        ele.click();
        //driver.findElement(By.id("return")).getAttribute("data-cy").contains("return");
    }


    public void clickOnDept() {
        //WebElement ele = driver.findElement(By.xpath("(//p[text()='12'])[1]"));
        WebElement ele = driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--today"));
        ele.click();
    }

    public void clickOnDeptForBus() {
        WebElement ele = driver.findElement(By.xpath("//input[@id='travelDate']"));
        ele.click();
        driver.findElement(By.xpath("(//div[text()='12'])[1]")).click();
    }

    public void selectDate(){

    }

    public void clickOnBus() {
        WebElement ele = driver.findElement(By.xpath("(//span[contains(@class,'headerIconWrapper')])[6]//span"));
        ele.click();
    }

    public void enterTextTo(String text) {
        WebElement ele = driver.findElement(txtTo);
        ele.click();
        driver.findElement(By.xpath("//span[text()='To']/following-sibling::input")).sendKeys(text);
        ele.sendKeys(Keys.ENTER);

    }

    public void clickOnCloseIcon() {
        WebElement ele = driver.findElement(closeIcon);
        ele.click();
    }

    public void clickOnDeparture() {
        WebElement ele = driver.findElement(departure);
        ele.click();
    }

    public void clickOnClose() {
        WebElement ele = driver.findElement(close);
        ele.click();
    }

    public void clickOnBangalore() {
        WebElement ele = driver.findElement(By.xpath("(//p[@class='sc-12foipm-47 zfkap'])[1]"));
        ele.click();
    }
}
