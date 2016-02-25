import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;







@RunWith(Cucumber.class)


@CucumberOptions(format = {"pretty", "json:target/json/output/json", "html:target/html/"},
features="/Users/KaziPBZ/Documents/workspace/BDDCucumberProject/page.feature",
tags = {})
public class PageRunner {

}
