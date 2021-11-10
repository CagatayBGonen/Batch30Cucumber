package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-Preports1.html",
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Paralel1", // feature'da scenariolara tagler atayabiliriz.
        // atanan taglari burada yazarak calistirabiliriz.

        dryRun = false
        // dryRun=true --> testi calistirmadan bize eksik adimi verir. testi calistirmaz.
        // dryRun=false --> testi calistirir, eksik adimla karsilasirsa test failed olur
        // ve bize eksik adimi raporlar.
)


public class ParalelTestRunner01 {
}
