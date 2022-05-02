package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sampleSteps {
        static int k;
        static int p;

        @Given("I create variable a and b")
        public void i_create_variable_a_and_b() {
            k=10;
            p=2;
        }

        @Then("I calculate sum of a and b")
        public void i_calculate_sum_of_a_and_b() {
            System.out.println( "value of multiplication "  + k*p);
        }

        @Then("I verify")
        public void iVerify() {
        }


}
