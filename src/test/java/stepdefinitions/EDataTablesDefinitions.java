package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EDataTablesPage;
import utilities.Driver;

public class EDataTablesDefinitions {
    EDataTablesPage eDataTablesPage = new EDataTablesPage();
    @Then("EDT new bttn basar")
    public void edt_new_bttn_basar() {
        eDataTablesPage.newBttn.click();
    }
    @Then("EDT firstname kutusuna {string} girer")
    public void edt_firstname_kutusuna_girer(String expectedFirstName) {
        eDataTablesPage.firstNameBox.sendKeys(expectedFirstName);
    }
    @Then("EDT lastname kutusuna {string} girer")
    public void edt_lastname_kutusuna_girer(String expectedLastName) {
        eDataTablesPage.lastNameBox.sendKeys(expectedLastName);
    }
    @Then("EDT position kutusuna {string} girer")
    public void edt_position_kutusuna_girer(String expectedPosition) {
        eDataTablesPage.positionBox.sendKeys(expectedPosition);
    }
    @Then("EDT office kutusuna {string} girer")
    public void edt_office_kutusuna_girer(String expectedOffice) {
        eDataTablesPage.officeBox.sendKeys(expectedOffice);
    }
    @Then("EDT extension kutusuna {string} girer")
    public void edt_extension_kutusuna_girer(String expectedExtension) {
        eDataTablesPage.extentionBox.sendKeys(expectedExtension);
    }
    @Then("EDT startdate kutusuna {string} girer")
    public void edt_startdate_kutusuna_girer(String expectedStarDate) {
        eDataTablesPage.starDateBox.sendKeys(expectedStarDate);
    }
    @Then("EDT salary {string} girer")
    public void edt_salary_girer(String expectedSalary) {
        eDataTablesPage.salaryBox.sendKeys(expectedSalary);
    }
    @Then("EDT create bttn basar")
    public void edt_create_bttn_basar() {
        eDataTablesPage.createBttn.click();
    }
    @When("EDT kullanici {string} ile arama yapar")
    public void edtKullaniciIleAramaYapar(String expectedName) {
        eDataTablesPage.searchBox.sendKeys(expectedName);
    }
    @Then("EDT isim bolumunda {string} oldugunu dogrular")
    public void edtIsimBolumundaOldugunuDogrular(String expectedName) {
        Assert.assertTrue("isim tabloda yer almiyor",eDataTablesPage.tabloName.getText().contains(expectedName));
    }

    @And("EDT ilgili kutulara {string} {string} {string} {string} {string} {string} {string}")
    public void edtIlgiliKutulara(String firstName, String lastName, String position, String office, String extension, String startDate, String salary) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(1000);
        actions.click(eDataTablesPage.firstNameBox)
                .sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(lastName)
                .sendKeys(Keys.TAB)
                .sendKeys(position)
                .sendKeys(Keys.TAB)
                .sendKeys(office)
                .sendKeys(Keys.TAB)
                .sendKeys(extension)
                .sendKeys(Keys.TAB)
                .sendKeys(startDate)
                .sendKeys(Keys.TAB)
                .sendKeys(salary)
                .perform();
        Thread.sleep(1000);
    }
}
