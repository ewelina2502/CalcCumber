Feature: Test sum
  Scenario:
    Given I test with zero
    When I add 0 and 3
    Then result is 3

  Scenario Outline: Summing different numbers with zero for result<result>
    Given Calculator is started
    When I add <num1> and <num2>
    Then result is <result>
    Examples:
      |num1|num2|result|
      |0   |0   |0     |
      |0   |1   |1     |
      |0   |2   |2     |
      |0   |3   |3     |
