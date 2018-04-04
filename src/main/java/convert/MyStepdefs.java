package convert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 *
 * @author neyrobiolog
 */
public class MyStepdefs {
    
    private ConWeight weight;
    private int GRAMM = weight.GRAMM;
    private int KVITAL = weight.KVITAL;
    private int operand1;
    private double result;

    @Given("^I have my software weight converter$")
    public void iHaveMySoftwareWeightConverter() throws Throwable {
        this.weight = new ConWeight();
    }

    @When("^I have entered GRAMM as first operand$")
    public void iHaveEnteredAsFirstOperand() throws Throwable {
        this.operand1 = GRAMM;
    }

    @When("^I have entered KVITAL as first operand$")
    public void iHaveEnteredAsFirstOperandKVITAL() throws Throwable {
        this.operand1 = KVITAL;
    }

    @And("^I press 'Get coefficient'$")
    public void iPressGetCoefficient() throws Throwable {
        this.result = weight.getCoefficient(operand1);
    }

    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int expected) throws Throwable {
        Assert.assertEquals(expected, this.result, 1e-5);
    }
}