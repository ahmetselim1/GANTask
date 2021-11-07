Feature: feature to testVerify moneygaming registration with password


#  Acceptance Criteria (not complete list):
#  ● Title, First Name, Surname, Date of Birth are mandatory
#  ● Player must be over 18
#  ● Terms and Conditions should be accepted

#  Test case 1: As a new customer, the user should not be able to create an account without the Birthdate field is missing. (negative)
#  Test case 2 As a new customer, the user with age of 18 should not be able to create an account. (negative)
#  Test case 3: As a new customer, the user under the age of 18 should not be able to create an account. (negative)
#  Test case 4: As a new customer, the user over the age of 18 should be able to create an account. (positive)


  #  Test case 1: As a new customer, the user should not be able to create an account without the Birthdate field is missing. (negative)
  @smoke
  Scenario: Validate the Birthdate functionality (negative)
    Given User navigates to the moneygaming application
    When User enters the firstName and Surname
    And User selects the tickbox for the termsandconditions
    And User clicks on the Join Now button
    Then User views the validation message for the date of birth field.