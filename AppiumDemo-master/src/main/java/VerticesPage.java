import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticesPage
{
    WebDriver driver;
    public VerticesPage(WebDriver driver) {
        this.driver = driver;
    }
    private static final By photo_Field =  AppiumBy.className("android.view.View");
    public VerticesPage swipePhotoFieldToLeft()
    {
        new MobileActions(driver).swipeLeftOnElement(photo_Field);
        return this;
    }
    public VerticesPage swipePhotoFieldToRight(WebDriver driver)
    {
        new MobileActions(driver).swipeRightOnElement(photo_Field, driver);
        return this;
    }
}
