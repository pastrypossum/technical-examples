package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;

import java.util.List;
import java.util.Map;

@Slf4j
public class ParameterStepDefs {

    @When("{actor} passes word of {word}")
    public void pass_word(Actor actor, String word) {

        log.info(actor.getName() + " has passed word: " + word);
    }

    @When("{actor} passes string of {string}")
    public void pass_string(Actor actor, String string) {

        log.info(actor.getName() + " has passed string: " + string);
    }

    @When("{actor} passes integer of {int}")
    public void pass_integer(Actor actor, int number) {

        log.info(actor.getName() + " has passed int: " + number);
    }

    @When("{actor} passes float of {float}")
    public void pass_float(Actor actor, float number) {

        log.info(actor.getName() + " has passed float: " + number);
    }

    @ParameterType("true|false")
    public boolean flag(String flag){

        if(flag.equals("true"))
            return true;
        else if(flag.equals("false"))
            return false;
        else
            throw new RuntimeException("Unknown boolean value");
    }

    @When("{actor} passes boolean of {flag}")
    public void pass_boolean(Actor actor, boolean flag) {

        log.info(actor.getName() + " has passed boolean: " + flag);
    }

    enum Instruction {STOP, GO}

    @ParameterType("STOP|GO")
    public Instruction instruction(String instruction){

        return Instruction.valueOf(instruction);
    }

    @When("{actor} passes an enum value of {instruction}")
    public void pass_instruction(Actor actor, Instruction instruction) {

        log.info(actor.getName() + " has passed instruction: " + instruction);
    }

    @When("{actor} passes a list")
    public void pass_list(Actor actor, List<String> parameters) {

        log.info(actor.getName() + " has passed a list: \n" + parameters);
    }

    @When("{actor} passes a map")
    public void pass_map(Actor actor, Map<String,String> parameters) {

        log.info(actor.getName() + " has passed a map: \n" + parameters);
    }

    @When("{actor} passes a list of maps")
    public void pass_listOfMaps(Actor actor, List<Map<String,String>> parameters) {

        log.info(actor.getName() + " has passed a ist of maps: \n" + parameters);
    }

    @DataTableType
    public Person mapRowToPerson(Map<String, String> person) {

        return new Person(person.get("Name"), person.get("Age"), person.get("ID"));
    }

    @When("{actor} passes a list of people")
    public void pass_listOfPeople(Actor actor, List<Person> parameters) {

        log.info(actor.getName() + " has passed a list of people: \n" + parameters.toString());
    }

    @Then("{actor} can use these values")
    public void use_values(Actor actor) {

        log.info(actor.getName() + " has values he can use");
    }

    class Person {

        private String name;
        private String age;
        private String id;

        public Person(String name, String age, String id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        public String toString(){
            return "Name: " + name + " Age: " + age + " ID: " + id;
        }
    }
}
