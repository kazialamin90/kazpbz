package PageObjectModel;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)


@CucumberOptions(format = {"pretty", "json:target/cucumber.json"},
features="/Users/KaziPBZ/Documents/workspace/BDDCucumberProject/file.feature",
tags = {})

public class Test_Run {

}
