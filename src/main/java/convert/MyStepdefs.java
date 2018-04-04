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
    private int LOT = weight.LOT;
    private int KILOGRAMM = weight.KILOGRAMM;
    private int TONNA = weight.TONNA;
    private int KVARTER = weight.KVARTER;
    private int STOUN = weight.STOUN;
    private int ZOLOTNIK = weight.ZOLOTNIK;
    private int DOLY = weight.DOLY;
    private int operand1;
    private double operand2;
    private int operand3;
    private double result;

    @Given("^I have my software weight converter$")
    public void iHaveMySoftwareWeightConverter() throws Throwable {
        this.weight = new ConWeight();
    }

    @When("^I have entered GRAMM as first operand$")
    public void iHaveEnteredAsFirstOperandGRAMM() throws Throwable {
        this.operand1 = GRAMM;
    }

    @When("^I have entered KVITAL as first operand$")
    public void iHaveEnteredAsFirstOperandKVITAL() throws Throwable {
        this.operand1 = KVITAL;
    }

    @When("^I have entered LOT as first operand$")
    public void iHaveEnteredAsFirstOperandLOT() throws Throwable {
        this.operand1 = LOT;
    }
    
    @When("^I have entered KILOGRAMM as first operand$")
    public void iHaveEnteredAsFirstOperandKILOGRAMM() throws Throwable {
        this.operand1 = KILOGRAMM;
    }

    @When("^I have entered TONNA as first operand$")
    public void iHaveEnteredAsFirstOperandTONNA() throws Throwable {
        this.operand1 = TONNA;
    }
    
    @When("^I have entered KVARTER as first operand$")
    public void iHaveEnteredAsFirstOperandKVARTER() throws Throwable {
        this.operand1 = KVARTER;
    }

    @When("^I have entered STOUN as first operand$")
    public void iHaveEnteredAsFirstOperandSTOUN() throws Throwable {
        this.operand1 = STOUN;
    }
    
    @When("^I have entered ZOLOTNIK as first operand$")
    public void iHaveEnteredAsFirstOperandZOLOTNIK() throws Throwable {
        this.operand1 = ZOLOTNIK;
    }

    @When("^I have entered DOLY as first operand$")
    public void iHaveEnteredAsFirstOperandDOLY() throws Throwable {
        this.operand1 = DOLY;
    }
    
    @And("^I have entered (\\d+) as second operand$")
    public void iHaveEnteredAsSecondOperand(double number) throws Throwable {
        this.operand2 = number;
    }

    @When("^I have entered ZOLOTNIK as third operand$")
    public void iHaveEnteredAsThirdOperandZOLOTNIK() throws Throwable {
        this.operand3 = ZOLOTNIK;
    }

    @When("^I have entered TONNA as third operand$")
    public void iHaveEnteredAsThirdOperandTONNA() throws Throwable {
        this.operand3 = TONNA;
    }

    @When("^I have entered STOUN as third operand$")
    public void iHaveEnteredAsThirdOperandSTOUN() throws Throwable {
        this.operand3 = STOUN;
    }

    @And("^I press 'Get coefficient'$")
    public void iPressGetCoefficient() throws Throwable {
        this.result = weight.getCoefficient(operand1);
    }

    @And("^I press 'Convert to kilogramm'$")
    public void iPressConvertToKilogramm() throws Throwable {
        this.result = weight.convertToKilogramm(operand1, operand2);
    }

    @And("^I press 'Converting'$")
    public void iPressConverting() throws Throwable {
        this.result = weight.converting(operand1, operand2, operand3);
    }

    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int expected) throws Throwable {
        Assert.assertEquals(expected, this.result, 1e-5);
    }
    
    
    
    @Given("^I have my software lenght converter$")
    public void iHaveMySoftwareLenghtConverter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I have entered CANTIMETER as first operand$")
    public void iHaveEnteredAsFirstOperandCANTIMETER() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    @And("^I press 'Get coefficient lenght'$")
    public void iPressGetCoefficientLenght() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
}