package com.cucumber.CucumberTests;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resource"},
		plugin = { "json:target/cucumber-report.json" },
		tags ={"@LogowanieAdmin, @UsuwanieUzytkownika"}
)
public class RunnerTest {

}
