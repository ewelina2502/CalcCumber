import Calculator.Calc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;


public class StepsDef {

    Calc calc;
    int result;

    @Given("I test with zero")
    public void i_test_with_zero() {
        calc = new Calc();

    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = calc.sum(int1, int2);

    }
    @Then("result is {int}")
    public void result_is(Integer int1) {
        Assertions.assertEquals(int1,result);
        }

    @Given("Calculator is started")
    public void calculatorIsStarted() {
        calc = new Calc();
    }
}
