package com.mvn.bdd.testcases;

import org.junit.runner.RunWith;

import com.mvn.bdd.Reports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/resources/Features",
		monochrome = true
		)
public class TestRunner extends Reports {

	
}


