Feature: 1) Using statements

  Statements should not reflect technical aspects of the solution
  Statements describe the steps of a scenario in business terms
  They should reflect expected inputs / actions / outcomes
  Pretend it is 1922

  Keywords given, when, then, and, but, * relate to annotations
  However the function is determined by the text / parameters
  For example @Given can trigger @When or @Then


  Scenario: Most common statements
    Given Robert has prepared the environment
    When he takes an action under test
    Then he will see a result

  Scenario: Using and

    Given Robert has prepared the environment
    And he includes an additional action

    When he takes an action under test
    And he includes an additional action

    Then he will see a result
    And he includes an additional action

  Scenario: Using but

    Given Robert has prepared the environment
    But he has not included this action

    When he takes an action under test
    But he has not included this action

    Then he will see a result
    But he has not included this action

  Scenario: Using *

    * Robert has prepared the environment
    * he takes an action under test
    * he includes an additional action
    * he has not included this action
    * he will see a result

