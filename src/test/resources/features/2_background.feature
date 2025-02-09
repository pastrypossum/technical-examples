Feature: 2) Using background

  A background statement will run before each in the feature file
  These statements allow us to remove duplicate opening step
  These statements are usually a common opening step/s

  Background:
    Given Robert has a common opening sequence

  Scenario: Test with background 1
    When Robert takes an action under test
    Then he will see a result

  Scenario: Test with background 2
    When Robert takes an action under test
    Then he will see a result

  Scenario: Test with background 3
    When Robert takes an action under test
    Then he will see a result