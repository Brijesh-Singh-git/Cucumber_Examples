Feature: To test the Google Search functionality 

Scenario: Validate the google search is working 

	Given browser is opened 
	And user is on the google page 
	When user enters the text on search box 
	And hits enter 
	Then naviagted to the result page 
	
