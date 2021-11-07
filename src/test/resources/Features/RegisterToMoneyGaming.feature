Feature: feature to testVerify moneygaming registration with password


  @smoke
  Scenario: Validate the Birthdate functionality (negative)
    Given User navigates to the moneygaming application
    When User enters the firstName and Surname
    And User selects the tickbox for the termsandconditions
    And User clicks on the Join Now button
    Then User views the validation message for the date of birth field.