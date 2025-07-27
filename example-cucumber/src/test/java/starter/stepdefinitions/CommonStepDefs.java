package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;

@Slf4j
public class CommonStepDefs {

    @Given("{actor} has prepared the environment")
    public void setup_env(Actor actor) {

        log.info(actor.getName() + " has prepared the environment");
    }

    @When("{actor} takes an action under test")
    public void run_test(Actor actor) {

        log.info(actor.getName() + " takes an action under test");
    }

    @When("{actor} repeats an action with {string} and {string}")
    public void repeat_test(Actor actor, String param1, String param2) {

        log.info(actor.getName() + " takes another action with " + param1 + " and " + param2);
    }


    @Given("{actor} will see a result")
    public void see_result(Actor actor) {

        log.info(actor.getName() + " will see the result");
    }
}
