package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features",
		glue="com.stepdefs",
		plugin="html:target",
		dryRun=false,// used for compile feature file
		monochrome=true// to get the readable output
		//tags="@logo" // to run a specific scenario
		)

public class TestRunner {

}
