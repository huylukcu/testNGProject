package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "formBasicEmail")
    public WebElement userName;

    @FindBy(id = "formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement invalidEmail;

    @FindBy(xpath = "//*[text()='Bad credentials']")
    public WebElement badCredential;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement errorMessage_incorrectEmailPass;

}

