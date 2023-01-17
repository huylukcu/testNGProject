package techproed.tests.homework;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TestCenterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TestCenterLoginTest {
    // Login the application using page object model
    //testcenter.techproeducation.com/index.php?page=form-authentication

    @Test
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("test_center_url"));

        TestCenterPage testCenterPage = new TestCenterPage();
        testCenterPage.userName.sendKeys("techproed");
        testCenterPage.password.sendKeys("SuperSecretPassword");
        testCenterPage.submitButton.click();
    }

    String message = "You logged into a secure area!";
}