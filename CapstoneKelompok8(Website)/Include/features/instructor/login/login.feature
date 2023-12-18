@tag
Feature: login
  Login as instructor

  @tag1
  Scenario: Log in with the correct email and password
    Given navigate to landing page and click login button
    When set email and password correctly
    And Click sign in button 
    Then login is success


  Scenario Outline: Login with wrong email or password
    Given navigate to landing page and click login button for negative case
    When set <email> or <password> incorrectly
    And Click sign in button for negative case
    Then login failed



    Examples: 
      | 						email  							| 	password	 |
      | testinstructor@gmail.com 				|     123admin |  
      | testinstructorgmail.com 				|     password | 
      | testinstructor@	 								|     password | 
      | 12345 													|     password | 
      | $%^& 														|     password | 
      | testinstructor 									|     password | 
      | akubelumterdaftar@gmail.com 		|     password | 
      
  
    Scenario: Login without email
    Given navigate to landing page and click login button2
    When set without email
    And Click sign in button2 
    Then login is failed
    
    Scenario: Login without password
    Given navigate to landing page and click login button3
    When set without password
    And Click sign in button3
    Then login is failed2
      
 