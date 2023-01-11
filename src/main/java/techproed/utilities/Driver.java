package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    // Driver.getDriver(); --> driver
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        return driver;

    }
    //    closeDriver() is used to close the driver
    public static void closeDriver(){
//        if driver is already being used(pointing an object)
//        then quit the driver
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }



}
