package Runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features={"src/test/java/Feature"},
        glue={"StepDefinitions","Hooks"},
        tags= {"@Access,@Anime"}
    )



public class RunnerTest extends AbstractTestNGCucumberTests{
    



}