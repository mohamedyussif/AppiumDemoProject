import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class ScaleToFitPage
{
    WebDriver driver;
    public ScaleToFitPage(WebDriver driver) {
        this.driver = driver;
    }
    public ScaleToFitPage assertThatGraphicsScaleToFitIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(AppiumBy.className("android.widget.TextView")).isDisplayed());
        return this;
    }
}
