import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioGroupPage
{
    WebDriver driver;
    private static By radiboxThatUserChoosed(String enterlabelValue)
    {
        return AppiumBy.accessibilityId(enterlabelValue);

    }
    public RadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }
    public RadioGroupPage clickOnRadioboxThatUserChoosed(String labelValue)
    {
        driver.findElement(radiboxThatUserChoosed(labelValue)).click();
        return this;
    }
    public RadioGroupPage assertThatRadioboxUserChoosedIsChecked(String labelValue)
    {
        Assert.assertTrue(Boolean.parseBoolean(driver.findElement(radiboxThatUserChoosed(labelValue)).getAttribute("Checked")));
        return this;
    }
}
