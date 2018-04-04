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