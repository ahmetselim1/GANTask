$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/RegisterToMoneyGaming.feature");
formatter.feature({
  "name": "feature to testVerify moneygaming registration with password",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the Birthdate functionality (negative)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User navigates to the moneygaming application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.RegisterToMoneyGamingSteps.user_navigates_to_the_moneygaming_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the firstName and Surname",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.RegisterToMoneyGamingSteps.user_enters_the_firstName_and_Surname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the tickbox for the termsandconditions",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.RegisterToMoneyGamingSteps.user_selects_the_tickbox_for_the_termsandconditions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Join Now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.RegisterToMoneyGamingSteps.user_clicks_on_the_Join_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User views the validation message for the date of birth field.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.RegisterToMoneyGamingSteps.user_views_the_validation_message_for_the_date_of_birth_field()"
});
formatter.result({
  "status": "passed"
});
});