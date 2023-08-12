import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GraphicsPage
{
    WebDriver driver;
    private static final By scaleToFit_Field =  AppiumBy.accessibilityId("ScaleToFit");
    private static final By vertices_Field =  AppiumBy.accessibilityId("Vertices");
    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
    }
    public GraphicsPage scrollDownToSpecificText(String text)
    {
        new MobileActions(driver).scrollDownToSpecificText(text);
        return this;
    }
    public GraphicsPage clickOnVerticesField()
    {
        driver.findElement(vertices_Field).click();
        return this;
    }
    public GraphicsPage clickOnScaleToFitField()
    {
        driver.findElement(scaleToFit_Field).click();
        return this;
    }
}
