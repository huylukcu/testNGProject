package techproed.tests.smokeTest.logintests;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day18_PositiveLoginTest {
//    Name: US100201_Admin_Login
//    Description:
//    User should be able login as admin
//    Acceptance Criteria:
//    As  admin, I  should be able to log in the application  https://www.bluerentalcars.com/
//    Admin email: john@doe.com
//    Admin password: John.123

    /*
    Test Cases
Given
    https://www.bluerentalcars.com/
When
    Click on login button
And
    Type jack@gmail.com into email input
And
    Type 12345 into password input
And
    Click on login submit button
Then
    Verify user logged in
 */
    @Test
    public void US100201_Admin_Login(){

//        https://www.bluerentalcars.com/
            Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        Click on login button
            HomePage homePage = new HomePage();
            homePage.HomePageLoginLink.click();

//        Type john@doe.com into email input
            LoginPage loginPage = new LoginPage();
            loginPage.userName.sendKeys("jack@gmail.com");

//        Type John.123 into password input
            loginPage.password.sendKeys("12345");

//        Click on login submit button
            loginPage.loginButton.click();

        ReusableMethods.waitFor(3);
//        Verify login is successful
        ReusableMethods.verifyElementDisplayed(homePage.userID);
//        ALTERNATIVELY WE CAN ASSERT IF HOME PAGE LOGIN LINK IS NOT DISPLAYED. NOT RECOMMENDED
//        ReusableMethods.verifyElementNotDisplayed(homePage.homePageLoginLink);

        Driver.closeDriver();
    }
}