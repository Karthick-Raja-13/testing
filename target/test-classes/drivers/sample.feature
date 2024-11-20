Feature: User Login

  Scenario: Login with Valid Credentials
    Given I go the URL
    When I enter a valid username user and a valid password pass
    And I click the submit button
    Then I should see a welcome message