package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoginTest {

    Login login;

    WebDriver driver;

    @BeforeTest
    public void init() {
        login = new Login();
//        driver = new ChromeDriver();
    }

    @Test(retryAnalyzer = Retry.class)
    public void testLogin() throws InterruptedException {
        login.launchBrowser();
        login.clickOnCloseIcon();
        Thread.sleep(4000);
        login.clickOnClose();
        login.enterText();
//        login.clickOnBangalore();
//        login.enterTextTo("Hyderabad");
        login.clickOnDeparture();
        login.clickonDate();
        login.clickOnDone();
        login.clickOnReturn();
    }

//    @Test
    public void testLoginForMakeMyTrip() throws InterruptedException {
        login.launchBrowser();
        Thread.sleep(4000);
        login.clickOnCloseFor();
        login.selectPlace();
        login.enterFromPlace();
        login.enterDestinationPlace();
        login.clickOnDept();
        login.clickOnTravellerClass();
        login.clickOnAdults();
        Thread.sleep(2000);
        login.clickOnRoundTrip();
//        login.clickOnApply();
    }

//    @Test
    public void testLoginForMakeTrip() throws InterruptedException {
        login.launchBrowser();
        Thread.sleep(4000);
        login.clickOnCloseFor();
        login.selectBus();
        Thread.sleep(5000);
        login.selectPlace();
        login.enterFromPlace();
        login.enterDestinationPlaceForBus();
        login.clickOnDeptForBus();
        login.clickOnSearch();
        login.clickOnAlternateRoute();
        login.clickOnSearchForSeat();
        login.selectSeatType();
        login.listOfPlaces();
    }

    @Test
    public void testData() throws IOException {
        ExcelReader reader=new ExcelReader();
        ArrayList data=reader.getData("Profile");
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }

//    @DataProvider
    public Object[][] getData(String filePath) throws IOException {
        JSONReader reader=new JSONReader();
        List<HashMap<String,String>>data=reader.getJSONData(System.getProperty("user.dir")+"C:\\Users\\Ganga\\IdeaProjects\\PracticeSessions\\DataReader.json");
        return new Object[][] {{data.get(0)},{data.get(1)}};
    }

//    @Test(dataProvider = "getData")
    public void submit(){
        System.out.println("Read the values from JSON");

    }


//    @AfterMethod
    public void tearDown() {
        login.closeBrowser();
    }
}
