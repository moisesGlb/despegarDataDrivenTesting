package test;

import base.DriverFactory;
import org.codehaus.plexus.interpolation.PrefixAwareRecursionInterceptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class searchFlightTest {
    WebDriver driver;

    private HomePage homePage;

    @BeforeMethod
    public void openBrowser(ITestContext context){
        driver = DriverFactory.OpenBrowser(driver, context);
    }

    @Test
    public void searchFlight() throws Exception {
        homePage = PageFactory.initElements(driver,HomePage.class);
        //homePage.clickOnCloseLoginIncentiveFlyer();
        homePage.clickOnFlightsNavigationBarButton();
        homePage.selectRoundTrip();
        homePage.selectCheapDatesSwitch();
        homePage.enterOrigin("Córdoba, Córdoba, Argentina");
        homePage.enterDestiny("Buenos Aires, Ciudad de Buenos Aires, Argentina");
        //homePage.selectTravelDate("Mar, 13 Jun 2023","Mie, 21 Jun 2023");
        //homePage.selectTravelDates();
        //homePage.setAdultsQuantity(2);
        //homePage.selectFlightClass("Premium Economy");
        homePage.clickSearch();
    }

    @AfterMethod
    public void killBrowser(){
        DriverFactory.KillBrowser(driver);
    }
}
