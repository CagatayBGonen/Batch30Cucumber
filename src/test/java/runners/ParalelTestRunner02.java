package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\Pcucumber-Preports2.html",
                "json:target/json-reports/Pcucumber2.json",
                "junit:target/xml-report/Pcucumber2.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Paralel2", // feature'da scenariolara tagler atayabiliriz.
        // atanan taglari burada yazarak calistirabiliriz.

        dryRun = false
        // dryRun=true --> testi calistirmadan bize eksik adimi verir. testi calistirmaz.
        // dryRun=false --> testi calistirir, eksik adimla karsilasirsa test failed olur
        // ve bize eksik adimi raporlar.
)

public class ParalelTestRunner02 {
}
