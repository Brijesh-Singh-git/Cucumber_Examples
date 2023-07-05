package Steps_For_Hooks;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Hooks Demo\\Hooks.feature", 
		glue= {"Steps_For_Hooks"}, monochrome=true,
		plugin={"pretty","html:target/HtmlReports","json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml"}
		)
public class Hooks_Runner {
	
}
