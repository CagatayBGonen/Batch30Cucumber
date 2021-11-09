package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);

    }

    @Then("sonucunun nutella icerdigini test eder")
    public void sonucunun_nutella_icerdigini_test_eder() {
        Assert.assertTrue("Arama sonucu \"Nutella\" icermiyor", amazonPage.resultText.getText().contains("Nutella"));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("java" + Keys.ENTER);
    }

    @Then("sonucunun java icerdigini test eder")
    public void sonucunun_java_icerdigini_test_eder() {
        Assert.assertTrue("Arama sonucu \"java\" icermiyor", amazonPage.resultText.getText().contains("java"));
    }

    @When("ipad icin arama yapar")
    public void ipad_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("ipad" + Keys.ENTER);
    }

    @Then("sonucunun ipad icerdigini test eder")
    public void sonucunun_ipad_icerdigini_test_eder() {
        Assert.assertTrue("Arama sonucu \"ipad\" icermiyor", amazonPage.resultText.getText().contains("ipad"));
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String searchedWord) {
        amazonPage.searchBox.sendKeys(searchedWord + Keys.ENTER);
    }

    @Then("sonucunun {string} icerdigini test eder")
    public void sonucununIcerdiginiTestEder(String searchedWord) {
        Assert.assertTrue("Arama sonucu \""+searchedWord+"\" icermiyor",amazonPage.resultText.getText().contains(searchedWord));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String expectedURL) {
        Driver.getDriver().get(ConfigurationReader.getProperty(expectedURL));
    }
}
