package myjava.dummy.glue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:build/reports/cucumber/cucumber.json","junit:build/reports/cucumber/cucumber.xml","html:build/reports/cucumber"},
        features = {"src/test/resources/features"})
public class RunCukesTest {
}
