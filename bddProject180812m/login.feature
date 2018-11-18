Feature: Validate Login Credential
Background: 
Given OpenBrowser
And navigate to facebook URL
@Smoke

Scenario: Login to profile page with valid credentials

Given OpenBrowser
And navigate to facebook URL
When User type userID on UserID textbox
And User type password on password box
And User click on login button
Then User should be in profile page
@Reg
Scenario: Login with invalid credentials

Given OpenBrowser
And navigate to facebook URL
When User type invalide userID on UserID textbox
And User type invalide password on password box
And User click on login button
Then User should not be in profile page
@Integration
Scenario: Varify login button is enavled

When User will cheak login button in enabled or not
Then Based on the result user should get return true or false