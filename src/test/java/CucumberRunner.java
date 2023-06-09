import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = {"src/test/features"},
        glue = {"steps", "hooks"},
        tags = "@all",
        plugin = {"pretty", "summary"}, snippets = CAMELCASE

)
public class CucumberRunner {
}


