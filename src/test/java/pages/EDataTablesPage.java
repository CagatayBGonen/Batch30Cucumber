package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EDataTablesPage {
    public EDataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newBttn;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createBttn;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameBox;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameBox;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionBox;

    @FindBy(id = "DTE_Field_office")
    public WebElement officeBox;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extentionBox;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement starDateBox;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath= "//tbody/tr/td[2]")
    public WebElement tabloName;

}
