Feature: Testing for login

Scenario: Login Process

Given user opens IE browser and launches the application newtours.demoaut.com
When user enters username as "mercury" in username field
And user enters password as "mercury" in password field
And user clicks on sign in 
Then login is successful