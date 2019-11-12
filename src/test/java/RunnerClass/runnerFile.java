package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\featurefile4.feature",glue="cucumber_demo1",
//plugin="html:target\\htmlreport",
//plugin="junit:target\\xmlreport.xml",
//plugin="json:C:\\Users\\A06438DIRNP6_TRNG\\eclipse-workspace\\jsonreport.json"
plugin="json:target\\jsonreport.json",
tags="~@Logout")


public class runnerFile 
{

}
