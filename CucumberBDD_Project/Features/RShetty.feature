Feature: Login Functionality 
Scenario Outline: Login with invalid crediantials  
Given User launches the chrome browser
When user opens the URL  "https://rahulshettyacademy.com/AutomationPractice/"
And user clicks on home page 
And user clicks on login 
And user enters the invalid email as "<email>"
Then user should see the text "invalid email"


Examples:
    | email |
    | dhshshsh@999.com |
    | hshshshk@999.com |
    | hsh7788shk@999.com |