package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@QAPositiveLogin", // feature'da scenariolara tagler atayabiliriz.
        // atanan taglari burada yazarak calistirabiliriz.

        dryRun = false
        // dryRun=true --> testi calistirmadan bize eksik adimi verir. testi calistirmaz.
        // dryRun=false --> testi calistirir, eksik adimla karsilasirsa test failed olur
        // ve bize eksik adimi raporlar.
)

public class Runner {
    //bu class tamamiyle tagler ile calisiyor
}
