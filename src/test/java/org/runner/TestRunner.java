package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\SIVANATARAJAN SR\\eclipse-workspace\\Cucu\\src\\test\\resources\\day1.feature" }, glue = {
				"org.stepdef" })

public class TestRunner {

}
