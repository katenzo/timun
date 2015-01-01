package com.example.garry.timun;

import android.test.ActivityInstrumentationTestCase2;

import com.example.garry.timun.MainActivity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by garry on 1/2/15.
 */


public class MainActivityStepDefinition extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityStepDefinition() {
        super(MainActivity.class);
    }

    @Given("^I am launching the application$")
    public void I_am_launching_the_application() throws Exception {
        throw new PendingException();
    }

    @When("^I submit a text$")
    public void I_submit_a_text() throws Exception {
        throw new PendingException();
    }

    @Then("^I receive the same text on the next page$")
    public void I_receive_the_same_text_on_the_next_page() throws Exception {
        throw new PendingException();
    }

}