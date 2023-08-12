import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class AccessbilityNodeQueryingPage
{
    WebDriver driver;
    private static By checkBox_FieldThatUserChoosed(String enterLabelValue)
    {
        return AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"Task "+enterLabelValue+"\"])/parent::android.widget.LinearLayout/android.widget.CheckBox");

    }
    public AccessbilityNodeQueryingPage(WebDriver driver) {
        this.driver = driver;
    }
    public AccessbilityNodeQueryingPage clickOnCheckoboxThatUserChoosed(String labelValue)
    {
        driver.findElement(checkBox_FieldThatUserChoosed(labelValue)).click();
        return this;
    }
    public AccessbilityNodeQueryingPage assertthatChecboxThatUserChoosedIsChecked(String labelValue)
    {
        Assert.assertTrue(Boolean.parseBoolean(driver.findElement(checkBox_FieldThatUserChoosed(labelValue)).getAttribute("Checked")));
        return this;
    }
}

