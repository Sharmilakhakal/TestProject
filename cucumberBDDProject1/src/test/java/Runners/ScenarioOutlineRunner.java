package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\ScenarioOutline.feature"},

		glue = {"Steps"},
		
		plugin = {"pretty"}
			
		
		)

public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests
{

}


