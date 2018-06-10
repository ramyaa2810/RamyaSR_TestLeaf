package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/main/java/features/CreateLead.feature", glue= {"steps","pages"}, monochrome=true)
@RunWith(Cucumber.class)
public class RunTest {

}
