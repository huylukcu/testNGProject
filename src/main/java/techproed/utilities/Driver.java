package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    // Driver.getDriver(); --> driver
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {   //it is not be initilatize,I will create driver for data
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); //assign new driver
            //driver= WebDriverManager.chromedriver.create();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//specific element
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//resuable method for page
        driver.manage().window().maximize();
        return driver;
    }

    //closeDriver() is used to close the driver
    public static void closeDriver() {
        //if driver is already being used(pointing an object)
        //then quit the driver
        if (driver != null) {      //eger driver null degilse close et
            driver.quit();
            driver = null;        //simdi null olmali,yenisini olusturmak icin
        }
    }
}
