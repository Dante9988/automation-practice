@quote
Feature: Quote form

  @quote1
  Scenario: Fill out quote form
    Given I open "quote" page
    Then I verify the location
    And I fill out the form
    Then I download the document
    Then I fill out contact name and phone
    And I accept thirdPartyAgreement and submit a quote
    Then I verify the response