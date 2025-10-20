Feature:
 
Scenario: Successful login with valid credentials
   Given User launch edge browesr 
   When User opens URL facebook page "https://www.facebook.com/login/"
   And User enters email as "<anantdokde@gmail.com>" and Password "<Anant@fb>"
   And click on try another way
   Then close browser

