Feature: Gmail Invalid Login 
	As a user I should not be able to login into Gmail with invalid credentials.


@GmailTests
Scenario Outline:  I search hotmail
	Given I navigate to "https://www.msn.com/en-gb/" 
	And I enter "<Row_Index>" in the msn search field
	Examples:
    |Row_Index|
    |0|
    |1|

    
@GmailLogins
Scenario:  I login with invalid credential to Gmail
    Given I navigate to "https://www.google.com/gmail/about/" 
	And I click on the sign on link
	Then I should be navigated to the sign on screen Sign in
	And I enter an invalid email address
	And I click on the next button
	Then a message "Couldn't find your Google Account" should be displayed
	
@GmailLogins
Scenario:  Validate invalid login message
    Given I navigate to "https://www.google.com/gmail/about/" 
	And I click on the sign on link
	Then I should be navigated to the sign on screen Sign in
	And I enter an invalid email address
	And I click on the next button
	Then a message "Couldn't find your Google Accounts" should be displayed
	
	