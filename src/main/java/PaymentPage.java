import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {


    WebDriver driver;

    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement element = null;


    public static WebElement paymentMethodDropdown(WebDriver driver){
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.id("PaymentMethod")));
        return element;
    }

    public static WebElement creditCardOption(WebDriver driver){
        element = driver.findElement(By.xpath("//*[text()=\"New Credit Card\"]"));
        return element;
    }

    public static WebElement clickCancelButton(WebDriver driver){
        element = driver.findElement(By.cssSelector(".return > a"));
        return element;
    }

    public static WebElement autoPayNo(WebDriver driver){
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.id("AutoPayNo")));
        return element;
    }

    public static WebElement submitPaymentButton(WebDriver driver){
        element = driver.findElement(By.id("paymentSubmitBtn"));
        return element;
    }








}
