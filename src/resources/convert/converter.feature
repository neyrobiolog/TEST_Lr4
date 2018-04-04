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