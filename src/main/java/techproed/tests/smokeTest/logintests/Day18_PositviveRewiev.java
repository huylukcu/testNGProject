package techproed.tests.smokeTest.logintests;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class Day18_PositviveRewiev {
    HomePage homePage;
    @Test
            public void positvtest() {
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        homePage = new HomePage();
        homePage.homePageLoginLink.click();




    }


}
