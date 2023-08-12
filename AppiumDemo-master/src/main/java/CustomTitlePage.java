import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class CustomTitlePage
{
    WebDriver driver;

    private static final By editText_Field =  AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]");
    private static final By changeLeft_Button =  AppiumBy.accessibilityId("Change Left");
    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
    }
    public CustomTitlePage clickOnEditTextField()
    {
        driver.findElement(editText_Field).click();
        return this;
    }
    public CustomTitlePage clearEditTextField()
    {
        driver.findElement(editText_Field).clear();
        return this;
    }
    public CustomTitlePage sendKeysToEditTextField(String editTextField_EnteredWord)
    {
        driver.findElement(editText_Field).sendKeys(editTextField_EnteredWord);
        return this;
    }
    public CustomTitlePage clickOnChangeLeftButton()
    {
        driver.findElement(changeLeft_Button).click();
        return this;
    }
    public CustomTitlePage assertOnEnteredWordForEditTextField(String editTextField_ExpectedTextValue)
    {
        Assert.assertEquals(driver.findElement(editText_Field).getText(), editTextField_ExpectedTextValue);
        return this;
    }
}
