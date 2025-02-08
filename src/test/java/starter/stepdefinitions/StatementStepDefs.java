package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;

@Slf4j
public class StatementStepDefs {

    @And("{actor} includes an additional action")
    public void and_got_item(Actor actor) {

        log.info(actor.getName() + " includes an additional action");
    }

    @But("{actor} has not included this action")
    public void but_not_got_item(Actor actor) {

        log.info(actor.getName() + " has not included this action");
    }
}
