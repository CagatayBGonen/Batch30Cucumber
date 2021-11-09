package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class amazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonURL"));
    }
    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("sonucunun nutella icerdigini test eder")
    public void sonucunun_nutella_icerdigini_test_eder() {
        Assert.assertTrue("Arama sonucu \"Nutella\" icermiyor",amazonPage.resultText.getText().contains("Nutella"));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
