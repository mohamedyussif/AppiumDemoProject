import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppPage
{
    WebDriver driver;
    public AppPage(WebDriver driver) {
        this.driver = driver;
    }
    private static final By activity_Field =  AppiumBy.accessibilityId("Activity");
    public AppPage clickOnActivityField()
    {
        driver.findElement(activity_Field).click();
        return this;
    }
}
