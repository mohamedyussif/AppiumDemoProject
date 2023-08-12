import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class Test_MobileActions {
    WebDriver driver;
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("src//test//resources//TestDataFiles//TestDataDriven"));
    public Test_MobileActions() throws IOException, ParseException
    {
    }
    @BeforeMethod
    public void setup() throws IOException, ParseException {
        driver = Test_Configuration.setupDevice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testClickAction() {
        new HomePage(driver)
                .clickOnAccessbility();
        new AccessbilityPage(driver)
                .assertOnAccessbilityNodeProviderFieldIsDisplayedWithExpectedText(getValue("Accessibility node provider field"));
    }
    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new HomePage(driver)
                .clickOnApp();
        new AppPage(driver)
                .clickOnActivityField();
        new ActivityPage(driver)
                .clickOnCustomTitleField();
        new CustomTitlePage(driver)
                .clickOnEditTextField()
                .clearEditTextField()
                .sendKeysToEditTextField(getValue("Entered Word"))
                .clickOnChangeLeftButton()
                .assertOnEnteredWordForEditTextField(getValue("Expected Word"));
    }
    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver)
                .clickOnAccessbility();
        new AccessbilityPage(driver)
                .clickOnaccessibilityNodeQueryingField();
        new AccessbilityNodeQueryingPage(driver)
                .clickOnCheckoboxThatUserChoosed(getValue("Chosen Checkbox"))
                .assertthatChecboxThatUserChoosedIsChecked(getValue("Chosen Checkbox Assertion"));
    }
    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        new HomePage(driver)
                .clickOnGraphics();
        new GraphicsPage(driver)
                .scrollDownToSpecificText(getValue("Graphics Scaletofit Tap"))
                .clickOnScaleToFitField();
        new ScaleToFitPage(driver)
                .assertThatGraphicsScaleToFitIsDisplayed();
    }
    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver)
                .clickOnGraphics();
        new GraphicsPage(driver)
                .scrollDownToSpecificText(getValue("Graphics vertices Tap"))
                .clickOnVerticesField();
        new VerticesPage(driver)
                .swipePhotoFieldToLeft()
                .swipePhotoFieldToRight(driver);
    }
    @Test
    public void testRadioButton()
    {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        new HomePage(driver)
                .clickOnView();
        new ViewsPage(driver)
                .scrollDownToSpecificText(getValue("Views Radiobox Tap"));
        new ViewsPage(driver)
                .clickOnRadioGroupField();
        new RadioGroupPage(driver)
                .clickOnRadioboxThatUserChoosed(getValue("Chosen Radiobox"));
        new RadioGroupPage(driver)
                .assertThatRadioboxUserChoosedIsChecked(getValue("Chosen Radiobox Assertion"));
    }

    @AfterMethod
    public void tierDown()
    {
        Test_Configuration.tearDown(driver);
    }
    public String getValue(String keyName)
    {
        String value = (String) jsonObject.get(keyName);
        return value;
    }

}
