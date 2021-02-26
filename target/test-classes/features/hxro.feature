@hxro
Feature: Smoke steps

  @hxro1
  Scenario: Simple user interactions in TixWix
    Given I open "hxro" page
    Then I verify elements on the page
    And I select "tixwix"
    Then I verify elements on the page
    And I select contracts available dates
    When I verify expiration date

  @hxro2
  Scenario: Sign up steps
    Given I open "hxro" page
    And I click on register button
