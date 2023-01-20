package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.SauceDemoHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class SauceDemoPrice {
    /*
  Given
    Go to  https://www.saucedemo.com/
  When
    Enter the username  as "standard_user"
  And
    Enter the password as "secret_sauce"
  And
    Click on login button
  Then
    Assert that total price of all products is 129.94 dollars
  And
    Flash each web element you used
   */

    @Test
    public void totalPrice(){
//        Go to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("sauce_demo_url"));

//        Enter the username  as "standard_user"
        SauceDemoHomePage sauceDemoHomePage = new SauceDemoHomePage();
        sauceDemoHomePage.usernameInput.sendKeys(ConfigReader.getProperty("sauce_demo_username"));

//        Enter the password as "secret_sauce"
        sauceDemoHomePage.passwordInput.sendKeys(ConfigReader.getProperty("sauce_demo_password"));

//        Click on login button
        sauceDemoHomePage.loginButton.click();

//        Assert that total price of all products is 129.94 dollars


//        Flash each web element you used





    }


}