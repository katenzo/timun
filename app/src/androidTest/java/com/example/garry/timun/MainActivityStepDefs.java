package com.example.garry.timun;

import android.test.ActivityInstrumentationTestCase2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

/**
 * Created by garry on 1/1/15.
 */


public class MainActivityStepDefs extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityStepDefs(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Given("^I am launching the application$")
    public void I_am_launching_the_application() throws Exception { }

    @When("^I submit a text$")
    public void I_submit_a_text() throws Exception { }

    @Then("^I receive the same text on the next page$")
    public void I_receive_the_same_text_on_the_next_page() throws Exception {  }

}
