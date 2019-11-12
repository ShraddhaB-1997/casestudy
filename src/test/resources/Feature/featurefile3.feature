Feature: Testing for login

Scenario Outline: Login Process

Given user opens IE browser and launches the application newtours.demoaut.com
When user enters username as "<userName>" in username field
And user enters password as "<password>" in password field
And user clicks on sign in 
Then login is successful

Examples:
|userName|password|
|mercury|mercury|
|mercury|abcd|
|abcd|mercury|
|abcd|pqrs|