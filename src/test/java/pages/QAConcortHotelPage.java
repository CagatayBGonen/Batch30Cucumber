package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QAConcortHotelPage {
    public QAConcortHotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "Log in")
    public WebElement loginBttn;

    @FindBy(id = "UserName")
    public WebElement usernameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginPageLoginBttn;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement validationErrorText;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement validationPassText;
}
