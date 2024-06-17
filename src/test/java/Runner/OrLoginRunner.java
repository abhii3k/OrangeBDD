package Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src/test/resources/Feature"
,glue="Stepdefination_OR",
plugin= {"pretty","html:target/htmlreport.html"}
)
public class OrLoginRunner {

}



