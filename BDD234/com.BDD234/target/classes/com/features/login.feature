@JBK
Feature: JBK offline application

@login
Scenario Outline: Login test

Given User should be on login page
When  User enters valid "<email>" and "<password>"
And   User click on login button
Then  User should be on home page

Examples:
|email         |password|
|kiran@gmail.com  | 123456 |
|mangesh@gmail.com| qwerty |
|amol@ gmail.com  | asdfgh |


