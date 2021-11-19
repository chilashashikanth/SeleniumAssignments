package SeleniumAssignments;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = false,
features = "Features\\SmokeRegression.feature",
tags= {"@SmokeTest","@RegressionTest"},
monochrome = true,
glue={"StepDefinitions"})

public class Test_runner extends AbstractTestNGCucumberTests {

}