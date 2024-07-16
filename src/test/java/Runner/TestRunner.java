package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
    features = "src/test/resources/Features", 
    glue = {"Utilities","StepDefinitions"}, 
    monochrome = true, 
    publish=true,
    plugin = {
        "pretty", 
        "html:target/HtmlReports/Unison.html",
        "json:target/JsonReports/Unison.json",
        "junit:target/JUnitReports/Unison.xml"
    }
    
)
public class TestRunner {
	
}

