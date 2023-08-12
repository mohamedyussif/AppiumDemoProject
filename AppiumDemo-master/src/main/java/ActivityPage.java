import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ActivityPage
{
    WebDriver driver;
    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }
    private static final By customTitle_Field =  AppiumBy.accessibilityId("Custom Title");
    public ActivityPage clickOnCustomTitleField()
    {
        driver.findElement(customTitle_Field).click();
        return this;
    }
}
