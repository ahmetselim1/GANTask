#Author: Ahmet selim gulgonul
#Date: 11/4/2021
#Description: Question No2


#todo: six char with one number and one special char allows user to create a password of:

Feature: Verify moneygaming registration with password
  #https://moneygaming.qa.gameaccount.com/sign-up.shtml
#  Background:
#I did not put the given step under the Background to make the scenario more readable.


  Scenario Outline: login with valid username and password (happy path)
    Given User navigates to the moneygaming application
    When User enters the username and <password>
    And User clicks on Join Now button
    Then User views the success message.

    Examples:
      | password |
      | abcd1@   |
#      | 2@abcd   |
#      | Ab3$cd   |
#      | asdf*34  |
#      | ASDF*345 |

#  Scenario Outline: login with invalid username and password (negative)
#    Given User navigates to the moneygaming application
#    When User enters the username and <password>
#    And User clicks on Join Now button
#    Then User views the invalid password message.
#
#    Examples:
#      | password |
#      | abc1@    |
#      |          |
#      | abcde1   |
#      | a bc8@   |
#      | asdf@*1  |
#      | asdf#345 |


#  Scenario: Verify the limit of characters for password is more than 5
#
#  Scenario: Verify if the password contains a number
#
#  Scenario: Verify if the password contains a special Character
#
#  Scenario: Verify if the password contains space (negative)
#
#  Scenario: Verify if the password is masked or visible in the form of asterisks to ensure secured login
#
#  Scenario: Verify if the login is possible with a valid password
#
#  Scenario: Verify if an error message appears for an invalid password.