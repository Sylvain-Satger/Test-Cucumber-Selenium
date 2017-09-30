package annotation; 

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options( format={"json:src/test/result/cucumber.json"}, features = "src/test/ressources")
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 

public class RunTest { }