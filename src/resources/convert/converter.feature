Feature: Converting
  In order to avoid using / * and converting coefficient
  I want to create a software length and weight converter

  Scenario:
    Given I have my software weight converter
    When I have entered GRAMM as first operand
    And I press 'Get coefficient'
    Then The result should be 0.001

  Scenario:
    Given I have my software weight converter
    When I have entered KVITAL as first operand
    And I press 'Get coefficient'
    Then The result should be 43.36

  Scenario:
    Given I have my software weight converter
    When I have entered LOT as first operand
    And I press 'Get coefficient'
    Then The result should be 0.01638

  Scenario:
    Given I have my software weight converter
    When I have entered KILOGRAMM as first operand
    And I press 'Get coefficient'
    Then The result should be 1

  Scenario:
    Given I have my software weight converter
    When I have entered TONNA as first operand
    And I press 'Get coefficient'
    Then The result should be 1000

  Scenario:
    Given I have my software weight converter
    When I have entered KVARTER as first operand
    And I press 'Get coefficient'
    Then The result should be 11.34

  Scenario:
    Given I have my software weight converter
    When I have entered STOUN as first operand
    And I press 'Get coefficient'
    Then The result should be 6.35

  Scenario:
    Given I have my software weight converter
    When I have entered ZOLOTNIK as first operand
    And I press 'Get coefficient'
    Then The result should be 0.00426

  Scenario:
    Given I have my software weight converter
    When I have entered DOLY as first operand
    And I press 'Get coefficient'
    Then The result should be 0.00004

  Scenario:
    Given I have my software weight converter
    When I have entered GRAMM as first operand
    And I have entered 2 as second operand
    And I press 'Convert to kilogramm'
    Then The result should be 0.002

  Scenario:
    Given I have my software weight converter
    When I have entered KVITAL as first operand
    And I have entered 4.6 as second operand
    And I press 'Convert to kilogramm'
    Then The result should be 199.456

  Scenario:
    Given I have my software weight converter
    When I have entered LOT as first operand
    And I have entered 10.3 as second operand
    And I press 'Convert to kilogramm'
    Then The result should be 0.168714

  Scenario:
    Given I have my software weight converter
    When I have entered KILOGRAMM as first operand
    And I have entered 7 as second operand
    And I have entered ZOLOTNIK as third operand
    And I press 'Converting'
    Then The result should be 1642.192

  Scenario:
    Given I have my software weight converter
    When I have entered KVARTER as first operand
    And I have entered 12.7 as second operand
    And I have entered TONNA as third operand
    And I press 'Converting'
    Then The result should be 0.144018

  Scenario:
    Given I have my software weight converter
    When I have entered DOLY as first operand
    And I have entered 20 as second operand
    And I have entered STOUN as third operand
    And I press 'Converting'
    Then The result should be 1.2598



  Scenario:
    Given I have my software lenght converter
    When I have entered CANTIMETER as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 0.01

  Scenario:
    Given I have my software lenght converter
    When I have entered MILE as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 1852

  Scenario:
    Given I have my software lenght converter
    When I have entered VERSTA as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 1066.8

  Scenario:
    Given I have my software lenght converter
    When I have entered METER as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 1

  Scenario:
    Given I have my software lenght converter
    When I have entered KILOMETER as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 1000

  Scenario:
    Given I have my software lenght converter
    When I have entered FUT as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 0.3

  Scenario:
    Given I have my software lenght converter
    When I have entered YARD as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 0.9144

  Scenario:
    Given I have my software lenght converter
    When I have entered SAZHEN as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 2.133

  Scenario:
    Given I have my software lenght converter
    When I have entered ARSHIN as first operand
    And I press 'Get coefficient lenght'
    Then The result should be 0.711
