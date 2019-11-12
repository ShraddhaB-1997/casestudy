Feature: Test Registration

Scenario: Test Registration with valid data

Given User open the application newtours.demout.com
When User clicks on Registration
Then user validates registration page
When user enters first name
And user enters password
And user confirms the password
And user clicks on the register button
Then registration successful