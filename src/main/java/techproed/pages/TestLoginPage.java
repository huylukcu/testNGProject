package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestLoginPage {
    public TestLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="exampleInputEmail1")
    public WebElement usernameInput;

    @FindBy(id="exampleInputPassword1")
    public WebElement passwordInput;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton;
}
