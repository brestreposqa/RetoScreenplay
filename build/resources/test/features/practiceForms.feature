Feature: Register new Student

  Scenario: Register successful
    Given that a web user wants to register in demoqa
    When he fills all the requested fields
    Then he should see your registration data