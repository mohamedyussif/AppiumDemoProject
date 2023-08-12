import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class Test_Configuration
{
    public static WebDriver setupDevice() throws MalformedURLException
    {
        String AppName = System.getProperty("user.dir") + "/src/test/resources/TestDataFiles/ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Demo");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "14.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        return new AndroidDriver(new URL("http://localhost:4723/"), caps);
    }
    public static void tearDown(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
