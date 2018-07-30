import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateMembershipPage {

    WebDriver driver;

    public CreateMembershipPage(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement element = null;

    public static WebElement getStartedButton(WebDriver driver){
        element = new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(By.id("classicSelectButtonTop")));
        return element;
    }

    public static WebElement firstNameField(WebDriver driver){
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
        return element;
    }

    public static WebElement lastNameField(WebDriver driver){
        element = driver.findElement(By.id("lastName"));
        return element;
    }

    public static WebElement gender(WebDriver driver){
        element = driver.findElement(By.id("optionsRadios1"));
        return element;
    }

    public static WebElement nextButton(WebDriver driver){
        element = driver.findElement(By.xpath("//*[text()=\"Next\"]"));
        return element;
    }

    public static WebElement addressField(WebDriver driver){
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.id("exampleInputAddress")));
        return element;
    }

    public static WebElement city(WebDriver driver){
        element = driver.findElement(By.id("cityList"));
        return element;
    }

    public static WebElement state(WebDriver driver){
        element = driver.findElement(By.id("state"));
        return element;
    }

    public static WebElement zipcode (WebDriver driver){
        element = driver.findElement(By.id("ZIP"));
        return element;
    }

    public static WebElement email (WebDriver driver){
        element = driver.findElement(By.id("memberEmail"));
        return element;
    }

    public static WebElement no_radiobutton (WebDriver driver){
        element = driver.findElement(By.id("optionsRadios2"));
        return element;
    }

    public static WebElement phoneNumberField (WebDriver driver){
        element = driver.findElement(By.id("exampleInputPhonenum"));
        return element;
    }

    public static WebElement mobileConsentAgreement_No (WebDriver driver){
        element = new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".margin-top-10 .ng-untouched.ng-invalid.ng-invalid-required")));
        return element;
    }

    public static WebElement noThanksButton (WebDriver driver){
        element = new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(By.id("noThanksToAddAssociateButton")));
        return element;
    }

    public static WebElement noForOptions (WebDriver driver){
        element = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.id("noToAddOptionsLink")));
        return element;
    }

    public static WebElement proceedToCheckout (WebDriver driver){
        element = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.id("proceedToCheckoutButton")));
        return element;
    }

    public static WebElement yesForCellPhoneType (WebDriver driver){
        element = driver.findElement(By.cssSelector(".col-md-2.col-xs-3.radio #optionsRadios1"));
        return element;
    }


}
