import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Actions.MobileActions;

public class ViewsPage
{
    WebDriver driver;
    private static final By radioGroup_Field =  AppiumBy.accessibilityId("Radio Group");
    public ViewsPage(WebDriver driver) {
        this.driver = driver;
    }
    public ViewsPage scrollDownToSpecificText(String text)
    {
        new MobileActions(driver).scrollDownToSpecificText(text);
        return this;
    }
    public ViewsPage clickOnRadioGroupField()
    {
        driver.findElement(radioGroup_Field).click();
        return this;
    }
}
