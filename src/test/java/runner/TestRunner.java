package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", //Directorio de nuestros archivos .feature
                glue = "src/test/java/steps", //Paquete donde tenemos nuestroas clases defiendo los steps escrutis eb ek feature file
                plugin = {"pretty","html:target/cucumber-reports"}
)
public class TestRunner {
    
}
