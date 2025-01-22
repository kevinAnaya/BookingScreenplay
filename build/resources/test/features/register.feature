Feature: Register

  Scenario: Register succesfull
    Given the user open a web page
    When the user enter the credential
    | name      | lastname  | email           | month | day | year | language |
    | kevintest | davidtest | kdavid@test.com |   1   | 28  | 1997 | Spanish  |
    Then the user can see initial page