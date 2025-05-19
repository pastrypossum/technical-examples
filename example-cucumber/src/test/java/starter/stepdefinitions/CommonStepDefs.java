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

    @Given("{actor} will see a result")
    public void see_result(Actor actor) {

        log.info(actor.getName() + " will see the result");
    }
}
