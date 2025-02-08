package starter.stepdefinitions;

import io.cucumber.java.*;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

@Slf4j
public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {

        return OnStage.theActorCalled(actorName);
    }

    @BeforeAll
    public static void before_all() {
        log.info("____Before all tests");
    }

    @AfterAll
    public static void after_all() {
        log.info("____After all tests");
    }

    @Before
    public void before_test() {
        log.info("________Before each test");
        OnStage.setTheStage(new OnlineCast());
    }

    @After(order=1)
    public void after_test_1() {
        log.info("________After each test 1");
    }

    @After(order=2)
    public void after_test_2() {
        log.info("________After each test 2");
    }

    @BeforeStep
    public void before_step() {
//        log.info("____________Before each step");
    }

    @AfterStep
    public void after_step() {
//        log.info("____________After each step");
    }
}
