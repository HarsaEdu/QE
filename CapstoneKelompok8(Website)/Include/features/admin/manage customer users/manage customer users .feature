@tag
Feature: manage customer users in class
	set rows,search,assign,delete user in class

  @tag1
  Scenario: set table rows cutomer users in class
    Given login is successful and go to manage classes user
    When set rows
    Then check rows
    
 	Scenario: next page in user table in class
    Given login is successful and go to manage classes user 2
    When next page
    Then check next page 
    
  Scenario: previous page in the user table in the class
    Given login is successful and go to manage classes user 3
    When prev page
    Then check prev page
    
 	Scenario: user customer search data in class
    Given login is successful and go to manage classes user 4
    When search correctly
    Then check search
    
  Scenario: user customer search data not found
    Given login is successful and go to manage classes user 5
    When search incorrectly
    Then check search2
    
 	Scenario: export data user customer in class
    Given login is successful and go to manage classes user 6
    When click button export
    Then check export data
    
  Scenario: delete customer user in class
    Given login is successful and go to manage classes user 7
    When delete data
    Then check succes delete data

