package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\Search.feature"},
		
		glue = {"Steps"},
		
		publish = true
		
		)




public class SearchRunner extends AbstractTestNGCucumberTests
{

}





