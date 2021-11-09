package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@EDT", // feature'da scenariolara tagler atayabiliriz.
        // atanan taglari burada yazarak calistirabiliriz.

        dryRun = false
            // dryRun=true --> testi calistirmadan bize eksik adimi verir. testi calistirmaz.
            // dryRun=false --> testi calistirir, eksik adimla karsilasirsa test failed olur
            // ve bize eksik adimi raporlar.
)

public class Runner {
    //bu class tamamiyle tagler ile calisiyor
}
