package com.mm.exercise.stepDefinition;

import com.mm.exercise.pageobjects.ExercisePage;
import com.mm.exercise.utils.BaseClass;
import com.mm.exercise_manager.PageObjectManager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExerciseStepDefination extends BaseClass {
	PageObjectManager pageObjectManager;
	ExercisePage exercisepage;

	@Given("^Browser is open and user is on the exercise page$")
	public void browser_is_open_and_user_is_on_the_exercise_page() throws Throwable {
		invokeApp("chrome");
		pageObjectManager = new PageObjectManager(driver);
		exercisepage = pageObjectManager.getexercisePage();
	}

	@When("^Page loads and all the values with total balance is displayed$")
	public void page_loads_and_all_the_values_with_total_balance_is_displayed() throws Throwable {
		throw new PendingException();
	}

	@Then("^Verify the right number of values are displayed$")
	public void verify_the_right_number_of_values_are_displayed() throws Throwable {
		exercisepage.noofValues();
		throw new PendingException();
	}

	@Then("^Verify the values are greater than zero$")
	public void verify_the_values_are_greater_than_zero() throws Throwable {
		exercisepage.valuesgreaterthanzero();
		throw new PendingException();
	}

	@Then("^Verfy the total balance based on all the values listed$")
	public void verfy_the_total_balance_based_on_all_the_values_listed() throws Throwable {
		exercisepage.totalbalance();
		throw new PendingException();
	}

	@Then("^Verify the values are formatted as currencies$")
	public void verify_the_values_are_formatted_as_currencies() throws Throwable {
		exercisepage.valueascurrency();
		throw new PendingException();
	}

	@Then("^Verify the total balance matches the sum of all the values$")
	public void verify_the_total_balance_matches_the_sum_of_all_the_values() throws Throwable {
		exercisepage.balanceandvaluetotal();
		throw new PendingException();
	}

}
