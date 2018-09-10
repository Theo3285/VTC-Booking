import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/FeaturesReport"},
        features = {"src/test/resources"}
)
public class AcceptanceTestRunner {
}
