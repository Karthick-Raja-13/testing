package bdd;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "src/test/resources/features/login.feature",
		glue ="bdd",
		dryRun=false,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:src/test/resources/reports/report.html"}
		)
public class Runner extends AbstractTestNGCucumberTests {

}