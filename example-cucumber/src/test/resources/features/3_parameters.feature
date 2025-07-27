Feature: 3) Using parameters

  https://github.com/cucumber/cucumber-expressions#readme

  I have {int} cucumber(s) in my belly/stomach
  I have {int} \{what} cucumber(s) in my belly \(amazing!)

  {word}	    Matches words without whitespace, for example banana (but not banana split).

  {string}	    Matches single-quoted or double-quoted strings, for example "banana split" or 'banana split' (but not banana split).
                Only the text between the quotes will be extracted. The quotes themselves are discarded.
                Empty pairs of quotes are valid and will be matched and passed to step code as empty strings.

  {} anonymous	Matches anything (/.*/).

  {int}	        Matches integers, for example 71 or -19. Converts to a 32-bit signed integer if the platform supports it.
  {float}	    Matches floats, for example 3.6, .8 or -9.2. Converts to a 32 bit float if the platform supports it.
  {bigdecimal}	Matches the same as {float}, but converts to a BigDecimal if the platform supports it.
  {double}	    Matches the same as {float}, but converts to a 64 bit float if the platform supports it.
  {biginteger}	Matches the same as {int}, but converts to a BigInteger if the platform supports it.
  {byte}	    Matches the same as {int}, but converts to an 8 bit signed integer if the platform supports it.
  {short}	    Matches the same as {int}, but converts to a 16 bit signed integer if the platform supports it.
  {long}	    Matches the same as {int}, but converts to a 64 bit signed integer if the platform supports it.

  Scenario: Pass a primitive type
    Given Robert has prepared the environment
    When he passes word of string
    When he passes string of "String"
    When he passes integer of 105
    When he passes float of 105.123
    Then he can use these values

  Scenario: Pass a custom parameter
    Given Robert has prepared the environment
    When he passes boolean of true
    When he passes boolean of false
    When he passes an enum value of STOP
    When he passes an enum value of GO
    Then he can use these values

  Scenario: Pass a list
    Given Robert has prepared the environment
    When he passes a list
      | Items  |
      | Item 1 |
      | Item 2 |
      | Item 3 |
    Then he can use these values

  Scenario: Pass a map
    Given Robert has prepared the environment
    When he passes a map
      | Param 1 | Value 1 |
      | Param 2 | Value 2 |
      | Param 3 | Value 3 |
    Then he can use these values

  Scenario: Pass a table
    Given Robert has prepared the environment
    When he passes a list of maps
      | Parameter | Value   |
      | Param 1   | Value 1 |
      | Param 2   | Value 2 |
      | Param 3   | Value 3 |
    Then he can use these values

  Scenario: Convert list of maps to object

  A @DataTableType annotated method must have one of these signatures:
  - public Author author(DataTable table)
  - public Author author(List<String> row)
  - public Author author(Map<String, String> entry)
  - public Author author(String cell)

    Given Robert has prepared the environment
    When he passes a list of people
      | Name       | Age | ID      |
      | Bob Bobson | 23  | 123456A |
      | Rob Robson | 25  | 123456B |
    Then he can use these values