package Step_Definations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureWith-Tags\\Tags.feature", 
		glue= {"Step_Definations"},tags= {"(@smoke or @regression) ad @important"}, monochrome=true,
		plugin={"pretty","html:target/HtmlReports","json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml"} 
		
		)
public class Runner2_Tags {
	
}
