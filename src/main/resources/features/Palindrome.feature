Feature: Palindrom

  Scenario: Input teks <Text>
    Given I entered string {string}
    When I test it for Palindrome
    And the result should be {string}
    Given I entered word {word}
    Then the output should be {string}