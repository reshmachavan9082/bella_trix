package com.bella.featurRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features", glue ="com.StepDefinitions")
public class FeatureRunner extends AbstractTestNGCucumberTests {

}
