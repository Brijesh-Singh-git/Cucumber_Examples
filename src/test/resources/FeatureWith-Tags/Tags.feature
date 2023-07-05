Feature: To test the demo tags


@smoke
Scenario: Sample 1 
Given 	
When 
And


@regression
Scenario: Sample 2 
Given 	
When 
And

@smoke @regression
Scenario: Sample 3 
Given 	
When 
And

@important
Scenario: Sample 3 
Given 	
When 
And


#@smoke or @regression ----> It will run all the test cases (1,2,3) 
#@smoke and @regression ----> It will run only the test case which have tag @smoke @regression (Sample 3)
#@regression and not @smoke ---> Only Sample 2 will execute 




