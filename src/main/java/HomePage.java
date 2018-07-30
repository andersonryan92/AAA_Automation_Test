import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement element = null;


    public static WebElement zipcodeField(WebDriver driver){
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".zip-digit-input")));
        return element;
    }

    public static WebElement goButton(WebDriver driver){
        element = driver.findElement(By.cssSelector(".zip-active-button"));
        return element;
    }

    public static WebElement joinAAAButton(WebDriver driver){
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='JOIN AAA']")));
        return element;
    }
}
