package com.example.garry.timun;

/**
 * Created by garry on 1/1/15.
 */
import junit.extensions.TestSetup;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith (Cucumber.class)
@CucumberOptions(format = {"pretty", "html:/data/data/com.example.garry.timun/report"}, features = "features")
public class RunTest {

    public void TestABTest() {

    }
}
