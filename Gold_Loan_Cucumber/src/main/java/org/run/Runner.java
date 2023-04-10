package org.run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\a1354\\Workout\\Gold_Loan_Cucumber\\src\\main\\resources\\Feature_Files\\Demo.feature",
glue = "org.step",dryRun = false)
public class Runner {

}