package techproed.tests.homework;

import org.testng.annotations.Test;
import techproed.pages.TestHomePage;
import techproed.pages.TestLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class LoginHomework {
    //    https://testcenter.techproeducation.com/index.php?page=form-authentication
//    Login the application by using page object model
    /*
    Given
        Go to https://testcenter.techproeducation.com/index.php?page=form-authentication
    When
        Type "techproed" into username input
    And
        Type "SuperSecretPassword" into password input
    And
        Click submit button
    Then
        Verify user singed in
     */
    @Test
    public void loginTest() {
//        Go to https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("test_login_url"));

//        Type "techproed" into "username" input
        TestLoginPage testLoginPage = new TestLoginPage();
        testLoginPage.username.sendKeys("techproed");

//        Type "SuperSecretPassword" into password input
        testLoginPage.password.sendKeys("SuperSecretPassword");

//        Click submit button
        testLoginPage.submitButton.click();

//        Verify user singed in
        TestHomePage testHomePage = new TestHomePage();
        //assertTrue(testHomePage.loginSuccessMessage.isDisplayed());
        ReusableMethods.verifyElementDisplayed(testHomePage.loginMessage);

    }
}