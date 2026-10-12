package Regression;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\cucumber\\BDD", 
                               glue = "cucumberStepsTest",
                               stepNotifications=true,
                               dryRun=false,
                               tags="@mahe_02")
public class RegressionTesting {

}
