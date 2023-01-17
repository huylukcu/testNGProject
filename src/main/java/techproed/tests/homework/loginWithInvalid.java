package techproed.tests.homework;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class loginWithInvalid {
   /*
    Name:
    Login screen error messages
    Description:
    User should see error message when user tries to login with incorrect credentials
    Acceptance Criteria:
    As admin or customer, I should be able to see error message,
    when I provide a correct email address BUT incorrect password in a pop up window
    Error Message: Bad credentials
    */
    @Test
    public void loginWithInvalidPassword() {
        // Go to https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        // Click on login
        HomePage homePage = new HomePage();
        homePage.homePageLoginLink.click();
        // Type in valid email "john@doe.com"
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("john");
        // Type in invalid password
        loginPage.password.sendKeys("John.12");
        // Click on login button
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
        // verify invalid email text
        ReusableMethods.verifyElementDisplayed(loginPage.invalidEmail);
        //send the correct email
        loginPage.userName.sendKeys("@doe.com");
        //verify not seen invalid emailtext
        ReusableMethods.verifyElementNotDisplayed(loginPage.invalidEmail);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
        //verify bad credential
        ReusableMethods.verifyElementDisplayed(loginPage.badCredential);
    }
}
