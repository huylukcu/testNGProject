package techproed.tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.SauceDemoHomePage;
import techproed.pages.SauceDemoProductsPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.JSUtils;
import techproed.utilities.ReusableMethods;
import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

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
    @Test(groups = "smoke-test")
    public void totalPrice() throws IOException {
//        Go to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("sauce_demo_url"));

//        Enter the username  as "standard_user"
        SauceDemoHomePage sauceDemoHomePage = new SauceDemoHomePage();
        JSUtils.flash(sauceDemoHomePage.usernameInput);
        sauceDemoHomePage.usernameInput.sendKeys(ConfigReader.getProperty("sauce_demo_username"));

//        Enter the password as "secret_sauce"
        JSUtils.flash(sauceDemoHomePage.passwordInput);
        sauceDemoHomePage.passwordInput.sendKeys(ConfigReader.getProperty("sauce_demo_password"));

//        Click on login button
        JSUtils.flash(sauceDemoHomePage.loginButton);
        sauceDemoHomePage.loginButton.click();

//        Assert that total price of all products is 129.94 dollars
        double sum = 0;
        SauceDemoProductsPage sauceDemoProductsPage = new SauceDemoProductsPage();
        for (WebElement w : sauceDemoProductsPage.pricesList) {
            JSUtils.flash(w);
            sum += Double.valueOf(w.getText().replaceAll("\\$", ""));
        }

        assertEquals(129.94, sum);

//        Flash each web element you used

    }


}