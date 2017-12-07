
Feature: Implement Log in Scenario

    Scenario: Successful authentication with valid credentials
    Given I a user with valid credentials 
    When  I enter my valid username and valid password
    And   I click on the login button
    Then  I should be able to view the dashboard 