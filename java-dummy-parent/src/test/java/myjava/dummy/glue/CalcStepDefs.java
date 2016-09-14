package myjava.dummy.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcStepDefs implements En {

    private Number number;

//    public CalcStepDefs() {
//        Given("^I have the number (\\d+)$", (Integer input) -> {
//            number = input;
//        });
//
//        When("^I add another number (\\d+)$", (Integer input) -> {
//            number = Math.addExact(number.intValue(), input);
//        });
//
//        Then("^I expect the result (\\d+)$", (Integer result) -> {
//            assertThat(number).isEqualTo(result);
//        });
//    }

    @Given("^I have the number (\\d+)$")
    public void iHaveTheNumber(Integer input) {
        number = input;
    }

    @When("^I add another number (\\d+)$")
    public void iAddAnotherNumber(Integer input) {
        number = Math.addExact(number.intValue(), input);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(Integer result) {
        assertThat(number).isEqualTo(result);
    }
}
