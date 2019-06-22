package stepDefintions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(strict = false, 
format = { "pretty","html:target/site/cucumber-pretty", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }, 
features = "classpath:features",
tags="@RegressionChrome,@scenarioone,@scenariotwo",
glue = {"info.seleniumcucumber.stepdefinitions"}

///*tags = { ""@ignore&quot; })*/
)


/*//@CucumberOptions(
		plugin = {"html:target/cucumberHtmlReport"},
     	//plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},
		//pretty:target/cucumber-json-report.json
		features = "classpath:features",
		glue = {"info.seleniumcucumber.stepdefinitions"}
)*/

public class RunCukeTest {
}

