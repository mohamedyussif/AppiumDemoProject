import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccessbilityPage
{
    WebDriver driver;
    private static final By accessibilityNodeProvider_Field = AppiumBy.accessibilityId("Accessibility Node Provider");
    private static final By accessibilityNodeQuerying_Field = AppiumBy.accessibilityId("Accessibility Node Querying");
    public AccessbilityPage(WebDriver driver) {
        this.driver = driver;
    }
    public AccessbilityPage clickOnaccessibilityNodeQueryingField()
    {
        driver.findElement(accessibilityNodeQuerying_Field).click();
        return this;
    }
    public AccessbilityPage assertOnAccessbilityNodeProviderFieldIsDisplayedWithExpectedText(String expectedTextValue)
    {
        Assert.assertEquals(driver.findElement(accessibilityNodeProvider_Field).getText(), expectedTextValue);
        return this;
    }
}
