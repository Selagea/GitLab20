package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxDemoPage;
public class CheckboxDemoTestCases extends BasePage{
    private CheckboxDemoPage checkboxDemoPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        checkboxDemoPage = new CheckboxDemoPage(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {
        checkboxDemoPage.ClickOnTheCheckBoxDemo();
        checkboxDemoPage.ClickOnSingleCheckbox();
        checkboxDemoPage.clickOnFirstCheckBoxOption();
        checkboxDemoPage.clickOnCheckAllOption();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
}
}