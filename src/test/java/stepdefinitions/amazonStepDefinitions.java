package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;

public class amazonStepDefinitions {
    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonURL"));
    }
    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

    }
    @Then("sonucunun nutella icerdigini test eder")
    public void sonucunun_nutella_icerdigini_test_eder() {

    }
}
