package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utilidades;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class HomePage {

    private WebDriverWait wait;
    WebDriver driver;
    private Date date = new Date();

    public HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
    }

    //*******************************Navigation Bar**********************************\\
    @FindBy(css = "div.header-products-container:nth-child(3) ul.header-list-products li.header-product-item:nth-child(1)")
    private WebElement hotelsNavBarBtn;

    @FindBy(xpath = "//div[@class='header-products-container']//*[@class='header-list-products']//li//a[@product='FLIGHTS']")
    private WebElement flightsNavBarBtn;

    @FindBy(css = "div.header-products-container:nth-child(3) ul.header-list-products li.header-product-item:nth-child(3)")
    private WebDriver packagesNavBarBtn;

    @FindBy(css = "div.header-products-container:nth-child(3) ul.header-list-products li.header-product-item:nth-child(4)")
    private WebElement salesNavBarBtn;

    @FindBy(css = "div.login-incentive--content span:nth-child(4) em")
    private WebElement closeLoginIncentiveFlyer;

    @FindBy(id = "continue")
    private WebElement btnCloseGoogleLoginModal;

    //********************Destiny Dates and Passengers Selector***************************\\

    @FindBy(css = "div.sbox5-box-container--1Ro43 div.sbox5-box-header--2c4hh div.sbox5-tab-switch--3So9m div.sbox5-roundTrip-input--2lDR0 button")
    private WebElement roundTripRadioButton;

    @FindBy(css = "div.sbox5-box-container--1Ro43 div.sbox5-box-header--2c4hh div.sbox5-tab-switch--3So9m div.sbox5-oneWay-input--2ttKb button")
    private WebElement oneWayRadioButton;

    @FindBy(css = "div.sbox5-box-container--1Ro43 div.sbox5-box-header--2c4hh div.sbox5-tab-switch--3So9m div.sbox5-multipleDestination-input--1MXh1 button")
    private WebElement multiDestinyRadioButton;

    @FindBy(css = "div.sbox5-segments--lzKBc div.sbox5-segment--2_IQ3:nth-child(1) div.sbox5-places-component--1i-wZ div.sbox-places-orig-override input")
    private WebElement inputOrigin;

    @FindBy(css = "div.sbox5-segments--lzKBc div.sbox5-segment--2_IQ3:nth-child(1) div.sbox5-places-component--1i-wZ div.sbox-places-dest-override input")
    private WebElement inputDestiny;

    @FindBy(css = "div.sbox5-button-container--1X4O8 button")
    private WebElement searchBtn;

    @FindBy(css = "div.sbox5-flex-dates-wrapper--d__IP label span.sbox5-switch-label")
    private WebElement cheapDatesSwitch;


//***********************Passenger and Class Locators*********************\\

    @FindBy(css = "div.sbox5-segments--lzKBc div.sbox5-segment--2_IQ3:nth-child(1) div.sbox5-distributionPassengers input")
    private WebElement passegersDropdownBtn;

    @FindBy(css = "div.stepper__distribution_container div.stepper__room__row:nth-child(1) div.stepper__room__row__stepper__contaer input")
    private WebElement adultsQuantity;

    @FindBy(css = " div.stepper__distribution_container div.stepper__room__row:nth-child(1) div.stepper__room__row__stepper__contaer button.steppers-icon-right")
    private WebElement addAdultPassengerBtn;

    @FindBy(css = "div.stepper__distribution_container div.stepper__room__row:nth-child(2) div.stepper__room__row__stepper__contaer input")
    private WebElement minorsQuantity;

    @FindBy(css = "div.stepper__distribution_container div.stepper__room__row:nth-child(2) div.stepper__room__row__stepper__contaer button.steppers-icon-right")
    private WebElement addMinorPassengerBtn;

    @FindBy(xpath = "//div[@class='sbox5-3-select -lg']//div[@class='select-container']//select")
    private Select flightClassSelector;

    @FindBy(css = "div.distribution__container div.stepper__room__footer a")
    private WebElement applyPassengersBtn;

//***********************CALENDAR LOCATORS***********************\\

    @FindBy(css = "div.sbox5-segments--lzKBc div.sbox5-segment--2_IQ3:nth-child(1) div.sbox5-dates-input1 input")
    private WebElement departureDatePickerBtn;

    @FindBy(css = "div.sbox5-segments--lzKBc div.sbox5-segment--2_IQ3:nth-child(1) div.sbox5-dates-container div.sbox5-dates-input2-container input")
    private WebElement arrivalDatePickerBtn;

    @FindBy(xpath = "//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//a[@class='calendar-arrow-left']")
    private WebElement calendarArrowLeft;

    @FindBy(xpath = "//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//a[@class='calendar-arrow-right']")
    private WebElement calendarArrowRight;

    //div with month and year data for every table of the date picker
    @FindBy(css = "div.sbox5-floating-tooltip:nth-child(1) div.calendar-container div.sbox5-compact-view")
    private List<WebElement> monthYearData;

    @FindBy(css = "div.sbox5-floating-tooltip:nth-child(1) div.calendar-container div.sbox5-monthgrid")
    private List<WebElement> monthData;

    @FindBy(xpath = "//div[@id='component-modals']/div[1]//div[@class='calendar-container ']/div[1]//div[@class='sbox5-monthgrid-title-month']")
    private WebElement monthLeft;

    @FindBy(xpath = "//div[@id='component-modals']/div[1]//div[@class='calendar-container ']/div[2]//div[@class='sbox5-monthgrid-title-month']")
    private WebElement monthRight;

    @FindBy(css = "div.sbox5-floating-tooltip:nth-child(1) div.calendar-container div.sbox5-monthgrid div.sbox5-monthgrid-title-year")
    private List<WebElement> yearData;

    @FindBy(css = "div.sbox5-floating-tooltip.sbox5-floating-tooltip-opened:nth-child(1) div.sbox5-monthgrid:first-of-type div.sbox5-monthgrid-datenumber-number")
    private List<WebElement> daysLeftCalendar;

    @FindBy(css = "div.sbox5-floating-tooltip.sbox5-floating-tooltip-opened:nth-child(1) div.sbox5-monthgrid:last-of-type div.sbox5-monthgrid-datenumber-number")
    private List<WebElement>daysRightCalendar;

    @FindBy(xpath = "//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='calendar-footer']//button")
    private WebElement btnApplyCalendar;

    @FindBy(xpath = "div.sbox5-floating-tooltip:nth-child(1) div.calendar-container div.sbox5-compact-view div.sbox5-monthgrid-dates")
    private List<WebElement> days;

    //******************************** Footer Locators***********************************************\\

    @FindBy(css = "div#lgpd-banner a.lgpd-banner--button")
    private WebElement closeCookiesBanner;

    //******************************** End of Locators***********************************************\\

    public void clickOnCloseLoginIncentiveFlyer(){
        if (closeLoginIncentiveFlyer.isDisplayed()){
            closeLoginIncentiveFlyer.click();
        }
        if (closeCookiesBanner.isDisplayed()){
            closeCookiesBanner.click();
        }

    }

    public void clickOnFlightsNavigationBarButton(){
        flightsNavBarBtn.click();
    }

    public void selectRoundTrip(){
        roundTripRadioButton.click();
    }

    public void enterOrigin(String Origin){
        wait.until(ExpectedConditions.elementToBeClickable(inputOrigin));
        inputOrigin.clear();
        inputOrigin.sendKeys(Origin);
        inputOrigin.sendKeys(Keys.ENTER);
    }

    public void enterDestiny(String Destiny){
        wait.until(ExpectedConditions.elementToBeClickable(inputDestiny));
        inputDestiny.clear();
        inputDestiny.sendKeys(Destiny);
        inputDestiny.sendKeys(Keys.ENTER);
    }

    public void selectCheapDatesSwitch(){
        wait.until(ExpectedConditions.elementToBeClickable(cheapDatesSwitch));
        cheapDatesSwitch.click();
    }

    public void setAdultsQuantity(int adults){
        passegersDropdownBtn.click();
        if (adults > 1 && adults < 9){
            for (int i=0; i<adults; i++){
                addAdultPassengerBtn.click();
            }
        }
    }

    public void setMinorsQuantity(int kids){
        passegersDropdownBtn.click();
        if (kids > 1 && kids < 7){
            for (int i = 0; i<kids; i++){
                addMinorPassengerBtn.click();
                //TODO select kids ages at random
            }
        }else if (kids == 1){
            //TODO select kid age at random
        }
    }
    // calendar selector
    public void selectFlightClass(String class2fly){
        passegersDropdownBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable((WebElement) flightClassSelector));
        flightClassSelector.selectByValue("YC");
        //classSelector.selectByVisibleText(class2fly);
    }

    public void selectTravelDates(){
        enterTravelDate();
        btnApplyCalendar.click();
    }

    public void selectTravelDate(String departureDate, String arrivalDate){
        enterTravelDate(departureDate,arrivalDate);
    }

    public void clickSearch(){
        //wait.until(ExpectedConditions.elementToBeClickable(btnCloseGoogleLoginModal));
        //btnCloseGoogleLoginModal.click();

        wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
        searchBtn.click();
    }

    private void enterTravelDate(String departureDate, String arrivalDate) {
        departureDatePickerBtn.sendKeys(departureDate);
        arrivalDatePickerBtn.sendKeys(arrivalDate);
    }


    private void enterTravelDate(){
        departureDatePickerBtn.click();
        //wait.until(ExpectedConditions.visibilityOf(btnApplyCalendar));
        calendarArrowRight.click();
        //wait.until(ExpectedConditions.visibilityOf(btnApplyCalendar));
        selectDay(daysLeftCalendar, String.valueOf(11));
        selectDay(daysLeftCalendar, String.valueOf(19));
    }

    private void selectDay( List<WebElement>days, String day){
        for (int i = 0; i<days.size();i++){
            if (days.get(i).getText().equals(day)){
                days.get(i).click();
                break;
            }
        }
    }
}
