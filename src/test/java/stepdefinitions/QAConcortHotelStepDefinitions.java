package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QAConcortHotelPage;

public class QAConcortHotelStepDefinitions {
    QAConcortHotelPage qaConcortHotelPage = new QAConcortHotelPage();
    @Then("QACH login linkine tiklar")
    public void qach_login_linkine_tiklar() {
        qaConcortHotelPage.loginBttn.click();
    }
    @Then("QACH username kutusuna {string} yazar")
    public void qach_username_kutusuna_yazar(String expectedUsername) {
        qaConcortHotelPage.usernameTextBox.sendKeys(expectedUsername);
    }
    @Then("QACH password kutusuna {string} yazar")
    public void qach_password_kutusuna_yazar(String expectedPassword) {
        qaConcortHotelPage.passwordTextBox.sendKeys(expectedPassword);
    }
    @Then("QACH login buttn basar")
    public void qach_login_buttn_basar() {
        qaConcortHotelPage.loginPageLoginBttn.click();
    }

    @Then("QACH giris yapilamadigini test eder")
    public void qachGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qaConcortHotelPage.validationErrorText.isDisplayed());
    }
}
