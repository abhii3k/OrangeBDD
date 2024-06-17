Feature: Valiadte orangeHRM website

Background: initial step
Given user is on login page

Scenario Outline: check login with valid credentials
When user enter  "<username>" and "<password>" 
Then click on login 
And Landed to home page
And close browser

Examples: 
|username|password|
|Admin|admin123|


Scenario Outline: check login with invalid credentials
When user enter  "<user>" and "<pass>" 
Then click on login 
And Not Landed to home page
And close browser

Examples: 
|user|pass|
|Wronguser|Wrongpass|


Scenario Outline: check user details

When user enter  "<username>" and "<password>" 
Then click on login 
And Click on admin tab
Then click on Add button
And fill user details
Then check radio button on user enter
And check and click on delete button appear 
Then handle alert
And close browser



Examples: 
|username|password|
|Admin|admin123|

Scenario Outline: check logout

When user enter  "<username>" and "<password>" 
Then click on login 
And Click on admin tab
Then click on Add button
And fill user details
Then check radio button on user enter
And check and click on delete button appear 
Then handle alert
And click on profile button then logout
And close browser

Examples: 
|username|password|
|Admin|admin123|