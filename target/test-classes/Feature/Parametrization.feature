Feature: To test the Login Functionality 

Scenario Outline: Check whether the login credentials are working or not 

	Given Website is opened using url 
	When user enters the <name> and <password> 
	Then user clicks on the Login button
	
	
	Examples: 
	
		| name | password | 
		| Rohan| 12345    | 
		| Mohit| 12345    | 
		| Priya| 12345    | 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
