package com.edercard.fizzbuzz;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FizzBuzzStepDefinition {
	
    FizzBuzz fizzBuzz;
    String result;
    
    @Given("^Create a FizzBuzz game play$")
	public void create_a_FizzBuzz_game_play() throws Throwable {

        fizzBuzz = new FizzBuzz();
	}

	@When("^I play with number (\\d+)$")
	public void i_play_with_number(int arg1) throws Throwable {

		result = fizzBuzz.play(arg1);
	}

	@Then("^The result is \"([^\"]*)\"$")
	public void the_result_is(String arg1) throws Throwable {
        Assert.assertEquals(result, arg1);
	}
}
