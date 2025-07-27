Feature: 4) Using scenarios

  Statements should not reflect technical aspects of the solution
  Statements describe the steps of a scenario in business terms
  They should reflect expected inputs / actions / outcomes
  Pretend it is 1922

  Keywords given, when, then, and, but, * relate to annotations
  However the function is determined by the text / parameters
  For example @Given can trigger @When or @Then


  Scenario: Single scenario
    Given Robert has prepared the environment
    When he takes an action under test
    Then he will see a result

  Scenario Outline: Iterative scenario
    Given Robert has prepared the environment
    When he repeats an action with "<Parameter 1>" and "<Parameter 2>"
    Then he will see a result

    Examples: Set 1
      | Parameter 1 | Parameter 2 |
      | one         | two         |
      | three       | four        |

    Examples: Set 1
      | Parameter 1 | Parameter 2 |
      | five        | six         |
      | seven       | eight       |