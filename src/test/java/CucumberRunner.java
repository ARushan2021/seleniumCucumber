import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)

@CucumberOptions(
        strict = true,
        features = {"src/test/features"},
        glue = {"step", "hooks"},
        tags = "@all",
        plugin = {"pretty", "summary"}, snippets = CAMELCASE


)

public class   CucumberRunner {
}


