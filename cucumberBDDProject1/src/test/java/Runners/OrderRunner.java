package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\Order.feature"},

		glue = {"Steps"},
		plugin = {"pretty"} 
		
		)



public class OrderRunner extends AbstractTestNGCucumberTests
{

}


