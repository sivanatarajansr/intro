Feature: validating login function of facebook application
Scenario: validating loginpage by incorrect username and correct passsword
Given user is on facebook page on chrome browser
When user enter username and password
And click login button
Then user should check home page invissible or not