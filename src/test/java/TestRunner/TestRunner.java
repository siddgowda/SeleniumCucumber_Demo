package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = {"TestDefination"},
        monochrome = true,
        plugin = {"pretty", "html:target/HTMLReports"}

)
public class TestRunner {
}
