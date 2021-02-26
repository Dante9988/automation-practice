@hxro_object
Feature: Sign up flow

  @hxro1 @rest1 @user
  Scenario: REST API Position CRUD
    Given I login to REST API as "existingUser"
    When I create via REST API Tix "order"
    Then I verify via REST API order is created
    When I update, buy more via REST API placed "order"
    Then I verify via REST API order is updated
    And I cashout via REST API placed order
