package com.edercard.fizzbuzz;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="FizzBuzz.feature")

@CucumberOptions(
        features = "src/test/java/resources",
        glue = "com.edercard.fizzbuzz"
)

public class TestRunner {

}
