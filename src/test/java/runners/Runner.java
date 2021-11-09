package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/stepdefinitions",
        tags = "@amazon",

        dryRun = true
            // dryRun=true --> testi calistirmadan bize eksik adimi verir
            // dryRun=false --> testi calistirir, eksik adimla karsilasirsa test failed olur
            // ve bize eksik adimi raporlar.
)

public class Runner {

}
