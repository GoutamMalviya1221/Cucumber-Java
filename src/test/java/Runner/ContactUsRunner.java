package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\lenovo\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Cucumber_JUnit\\src\\test\\resources\\Sparsh Hospital\\Contact.feature",
				glue = "Day1")

public class ContactUsRunner extends AbstactTestNGCucumber {

}
