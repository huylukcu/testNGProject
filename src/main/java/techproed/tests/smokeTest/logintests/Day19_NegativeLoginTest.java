package techproed.tests.smokeTest.logintests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day19_NegativeLoginTest {
  /*  Name:
    US100208_Negative_Login
    Description:
    User should not be able login with incorrect credentials
    Acceptance Criteria:
    As customer, I should not be able to log in the application
    Customer email: fake@bluerentalcars.com
    Customer password: fakepass
    Error: User with fake@bluerentalcars.com not found
    */
    HomePage homePage;
    LoginPage loginPage;
    Faker faker;//declaire
    @Test
    public void US100208_Negative_Login() throws IOException {
//        As customer, I should not be able to log in the application
//        going blue rental car home page
//        https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        Click on login button
        homePage = new HomePage();
        loginPage = new LoginPage();
        ReusableMethods.waitFor(3);

//        sending credentials and clicking on login button
        homePage.homePageLoginLink.click();
        ReusableMethods.waitFor(3);

//        Customer email: fake@bluerentalcars.com
//        Customer password: fakepass
        loginPage.userName.sendKeys("fake@bluerentalcars.com");
        ReusableMethods.waitFor(3);

        loginPage.password.sendKeys("fakepass");
        ReusableMethods.waitFor(3);

//        Click on login submit button
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);

//        Error: User with email fake@bluerentalcars.com not found
        String errorMessage = loginPage.errorMessage_incorrectEmailPass.getText();
        Assert.assertEquals(errorMessage,"User with email fake@bluerentalcars.com not found");
        ReusableMethods.getScreenshot("NegativeLoginScreenshot");
    }
    @Test
    public void invalidCredsTest() throws IOException {
//        As customer, I should not be able to log in the application
        //going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();

//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);

//        Customer email: fake@bluerentalcars.com
//        Customer password: fakepass
        faker=new Faker();//instation
        String fakeEmail = faker.internet().emailAddress();
        loginPage.userName.sendKeys(fakeEmail);

        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys(faker.internet().password(4,6));//fake pass 4-6 digit

        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();

        ReusableMethods.waitFor(3);

//        Error: User with email fake@bluerentalcars.com not found
        String errorMessage = loginPage.errorMessage_incorrectEmailPass.getText();
        Assert.assertEquals(errorMessage,"User with email "+fakeEmail+" not found");
        ReusableMethods.getScreenshot("NegativeLoginScreenshot");
        //Driver.closeDriver();
    }
}