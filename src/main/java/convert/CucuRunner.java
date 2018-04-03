package convert;

/**
 * @autor neyrobiolog
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/resources/convert"}
)
public class CucuRunner {

}
