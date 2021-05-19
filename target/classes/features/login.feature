Feature: Flipkart - Login 

Scenario: Valid login credentials 
	Given navigate to flipkart loginpage 
	When enter username "9494436012" and password "Arunreddy@186" 
	And click on login 
	Then login should be succesfull 
	
Scenario: Valid username and invalid password 
	Given navigate to flipkart loginpage 
	When enter username "9494436012" and password "54563" 
	And click on login 
	Then login should be unsuccesfull 
	
Scenario: Invlaid username and valid password 
	Given navigate to flipkart loginpage 
	When enter username "test" and password "Arunreddy@186" 
	And click on login 
	Then login should be unsuccesfull 
	
Scenario: Invalid username and invalid password 
	Given navigate to flipkart loginpage 
	When enter username "test" and password "56549" 
	And click on login 
	Then login should be unsuccesfull