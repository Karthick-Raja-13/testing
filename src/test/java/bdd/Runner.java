package bdd;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "src/test/java/features/login.feature",
		glue ="bdd",
		//dryRun=true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:src/test/java/reports/151124.html"}
		)
public class Runner extends AbstractTestNGCucumberTests {

}