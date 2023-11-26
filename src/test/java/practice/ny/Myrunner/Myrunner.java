package practice.ny.Myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "./Features/" }, glue = "practice.ny.Stepdef"

)

public class Myrunner extends AbstractTestNGCucumberTests {

}
