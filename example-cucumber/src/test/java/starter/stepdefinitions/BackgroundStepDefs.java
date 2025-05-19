package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;

@Slf4j
public class BackgroundStepDefs {

    @Then("{actor} has a common opening sequence")
    public void see_background_run(Actor actor) {

        log.info(actor.getName() + " has a common opening sequence");
    }
}
