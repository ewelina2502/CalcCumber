import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "junit:build/test-results/test/TEST-cucumber.xml"},
        glue = {"classpath:steps"},
        features = "src/test/resources",
        dryRun = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class CucumberRunnerTests {

}
