package SanityTest.StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// plugin = {"pretty", "json:target/JSONReports/Reports.json"}
// plugin = {"pretty", "html:target/HTMLReports/Reports.html"}
// plugin = {"pretty", "junit:target/JunitReports/Reports.xml"}

@RunWith(Cucumber.class)
@CucumberOptions(features="SanityTest/Features", glue={"SanityTest/StepDefinitions"},
    monochrome = true,
	plugin = {"pretty", "junit:target/SanityTest/SanityReports.xml"},
	tags = "@SanityTest")
public class TestRunner {

}
