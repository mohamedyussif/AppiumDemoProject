import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage
{
    WebDriver driver;
     private static final By accessibility =  AppiumBy.accessibilityId("Access'ibility");
     private static final By app =  AppiumBy.accessibilityId("App");
     private static final By graphics =  AppiumBy.accessibilityId("Graphics");
     private static final By views =  AppiumBy.accessibilityId("Views");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage clickOnAccessbility()
     {
         driver.findElement(accessibility).click();
         return this;
     }
    public HomePage clickOnApp()
    {
        driver.findElement(app).click();
        return this;
    }
    public HomePage clickOnGraphics()
    {
        driver.findElement(graphics).click();
        return this;
    }
    public HomePage clickOnView()
    {
        driver.findElement(views).click();
        return this;
    }

}
