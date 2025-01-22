Feature: Register

  Scenario: Register succesfull
    Given the user open a web page
    When the user enter the credential
    | name      | lastname  |
    | kevintest | davidtest |
    Then the user can see initial page