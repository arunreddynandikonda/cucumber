Feature: Flipkart - Search 

Scenario: Valid input test 
	Given navigate to flipkart homepage 
	When search for "mobiles" with minimum price "10000" and maximum price "50000" 
	And Apply ram size "4 GB" and enter star rating "4" 
	And Apply flipkart assured 
	Then products are visible 
	
Scenario: Validate alphabets 
	Given navigate to flipkart homepage 
	When search with numbers "1234" 
	Then products are visible 	
	
Scenario: Validate alphanumeric data
	Given navigate to flipkart homepage 
	When search with numbers "abcd1234"
	Then products are visible	
	
