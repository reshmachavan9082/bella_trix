 Feature: This feature is for get title of flaco9 
 
 Scenario: Search for falcon product title
	Given Type falcon into search component and hit enter key
  Then Get product title
  
 Scenario: Search for proton product
 	Given Type proton in search bar
 	Then Get proton product title
 	
 Scenario: Search for saturn product
 	Given Type staurn in search bar
 	Then Get saturn product title
 	
 Scenario: Search for falcon List of titles
 	Given Enter falcon and get titles of product

 