import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {


    public WebDriver driver;
    public String baseURL;

    @BeforeEach
    void setup() throws Exception {

        // create and launch chromedriver instance

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseURL = "https://www.calif.aaa.com";
        driver.manage().window().maximize();

        // navigate to baseurl
        driver.get(baseURL);
    }

    @Test
    @DisplayName("navigate to fox.com and create an account")
    void testCase1() throws Exception {

        // enter in zip code on homepage
        HomePage.zipcodeField(driver).sendKeys("90046");

        // click on the go button
        HomePage.goButton(driver).click();

        // click on the join AAA button
        HomePage.joinAAAButton(driver).click();

        // click on the get started button
        CreateMembershipPage.getStartedButton(driver).click();

        // enter name in name field
        CreateMembershipPage.firstNameField(driver).sendKeys("Ryan");

        // enter in last name
        CreateMembershipPage.lastNameField(driver).sendKeys("Anderson");

        // select gender
        CreateMembershipPage.gender(driver).click();

        // click on the next button
        CreateMembershipPage.nextButton(driver).click();

        // enter in address
        CreateMembershipPage.addressField(driver).sendKeys("9025 Wonderland Ave.");

        // enter in city
        CreateMembershipPage.city(driver).sendKeys("Los Angeles");

        // enter in state
        CreateMembershipPage.state(driver).sendKeys("California");

        // enter in ZIP
        CreateMembershipPage.zipcode(driver).sendKeys("90046");

        // enter in email
        CreateMembershipPage.email(driver).sendKeys("email@example.com");

        // select no for radio button
        CreateMembershipPage.no_radiobutton(driver).click();

        // enter in a number
        CreateMembershipPage.phoneNumberField(driver).sendKeys("1234567890");

        // click yes for is cell phone radio button
        CreateMembershipPage.yesForCellPhoneType(driver).click();

        // click no on mobile consent agreement
        CreateMembershipPage.mobileConsentAgreement_No(driver).click();

        // click on next button
        CreateMembershipPage.nextButton(driver).click();

        Thread.sleep(1000);

        // click on no thanks button
        CreateMembershipPage.noThanksButton(driver).click();

        // click on no for options button
        CreateMembershipPage.noForOptions(driver).click();

        // click on proceed to checkout button
        CreateMembershipPage.proceedToCheckout(driver).click();

        // click on payment method
        PaymentPage.paymentMethodDropdown(driver).click();

        // click on new credit card
        PaymentPage.creditCardOption(driver).click();

        // switch to iframe
        driver.switchTo().frame("creditCardIFrame");

        // click cancel on payment pop up
        PaymentPage.clickCancelButton(driver).click();

        // click no on auto pay, wait 1 second for javascript animation to complete
        Thread.sleep(1000);
        PaymentPage.autoPayNo(driver).click();

        // click on payment submit button
        PaymentPage.submitPaymentButton(driver).click();

        // verify error message exists
        boolean isErrorDisplayed = driver.findElement(By.id("valError_PaymentMethod")).isDisplayed();
        Assertions.assertTrue(isErrorDisplayed);
    }


    @Test
    @DisplayName("Test for user number 2")
    void testcase2() throws Exception{

        // enter in zip code on homepage
        HomePage.zipcodeField(driver).sendKeys("90046");

        // click on the go button
        HomePage.goButton(driver).click();

        // click on the join AAA button
        HomePage.joinAAAButton(driver).click();

        // click on the get started button
        CreateMembershipPage.getStartedButton(driver).click();

        // enter name in name field
        CreateMembershipPage.firstNameField(driver).sendKeys("Female");

        // enter in last name
        CreateMembershipPage.lastNameField(driver).sendKeys("User");

        // select gender
        CreateMembershipPage.gender(driver).click();

        // click on the next button
        CreateMembershipPage.nextButton(driver).click();

        // enter in address
        CreateMembershipPage.addressField(driver).sendKeys("9025 Wonderland Ave.");

        // enter in city
        CreateMembershipPage.city(driver).sendKeys("Los Angeles");

        // enter in state
        CreateMembershipPage.state(driver).sendKeys("California");

        // enter in ZIP
        CreateMembershipPage.zipcode(driver).sendKeys("90046");

        // enter in email
        CreateMembershipPage.email(driver).sendKeys("email2@example.com");

        // select no for radio button
        CreateMembershipPage.no_radiobutton(driver).click();

        // enter in a number
        CreateMembershipPage.phoneNumberField(driver).sendKeys("1234567890");

        // click yes for is cell phone radio button
        CreateMembershipPage.yesForCellPhoneType(driver).click();

        // click no on mobile consent agreement
        CreateMembershipPage.mobileConsentAgreement_No(driver).click();

        // click on next button
        CreateMembershipPage.nextButton(driver).click();

        Thread.sleep(1000);

        // click on no thanks button
        CreateMembershipPage.noThanksButton(driver).click();

        // click on no for options button
        CreateMembershipPage.noForOptions(driver).click();

        // click on proceed to checkout button
        CreateMembershipPage.proceedToCheckout(driver).click();

        // click on payment method
        PaymentPage.paymentMethodDropdown(driver).click();

        // click on new credit card
        PaymentPage.creditCardOption(driver).click();

        // switch to iframe
        driver.switchTo().frame("creditCardIFrame");

        // click cancel on payment pop up
        PaymentPage.clickCancelButton(driver).click();

        // click no on auto pay, wait 1 second for javascript animation to complete
        Thread.sleep(1000);
        PaymentPage.autoPayNo(driver).click();

        // click on payment submit button
        PaymentPage.submitPaymentButton(driver).click();

        // verify error message exists
        boolean isErrorDisplayed = driver.findElement(By.id("valError_PaymentMethod")).isDisplayed();
        Assertions.assertTrue(isErrorDisplayed);

    }

    @AfterEach
    void tearDown() throws Exception{
        driver.close();
        driver.quit();
    }
}
