@RunAll

Feature: 5) Using tags

  no tag will run all tests

  mvn verify -Dcucumber.filter.tags="@RunAll"

  mvn verify -Dcucumber.filter.tags="@Tag1"
  mvn verify -Dcucumber.filter.tags="@TagA"
  mvn verify -Dcucumber.filter.tags="@TagB"
  mvn verify -Dcucumber.filter.tags="@TagC"

  mvn verify -Dcucumber.filter.tags="@RunAll and not @TagA"
  mvn verify -Dcucumber.filter.tags="@TagA and @TagB and @TagC"

  @Tag1 @TagA
  Scenario: Run tag 1A
    Given Robert has prepared the environment
    When he takes an action under test
    Then he will see a result

  @Tag1 @TagB
  Scenario: Run tag 1B
    Given Robert has prepared the environment
    When he takes an action under test
    Then he will see a result

  @Tag1 @TagC
  Scenario: Run tag 1C
    Given Robert has prepared the environment
    When he takes an action under test
    Then he will see a result