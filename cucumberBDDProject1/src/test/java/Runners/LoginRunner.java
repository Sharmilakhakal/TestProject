package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			
			features = {"src\\test\\resources\\applicationtest\\loging.feature"},
			
			glue = {"Steps"}
			
            
			
			)


	public class LoginRunner extends AbstractTestNGCucumberTests {

	}



