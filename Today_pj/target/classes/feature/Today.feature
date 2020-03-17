@demoblaze.com_Feature
Feature: Demoblaze.com website

@tc01_demoblazelogin
Scenario: Login into demoblaze website

Given The user launces the chrome browser
When the demoblaze website open
Then the user enter the username and password
Then  the user clicks the login  button
Then Close the browser

@tc02_demoblazecontact
Scenario: Enter the contact details of the user

Given The application opens in the browser
When the user navigates to  the contact link
Then enter the email,name in respective text boxes
Then message in the message textbox
And click on the send message button 

@tc_03
Scenario: 