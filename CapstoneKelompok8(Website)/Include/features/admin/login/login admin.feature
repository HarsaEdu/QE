@tag
Feature: login 
  Login as admin

  @tag1
  Scenario: Log in with the correct email and password as admin
    Given navigate to landing page and click login button as admin
    When set email and password correctly as admin
    And Click sign in button as admin
    Then login is success as admin


  Scenario Outline: Login with wrong email or password as admin
    Given navigate to landing page and click login button for negative case as admin
    When set <email> or <password> incorrectly as admin
    And Click sign in button for negative case as admin
    Then login failed as admin



    Examples: 
      | 						email  							| 	password	 |
      | testadmin@gmail.com							|     admin123 |  
      | testadmingmail.com 							|     password | 
      | testadmin@											|     password | 
      | 112233 													|     password | 
      | !@#$ 														|     password | 
      | testadmin												|     password | 
      | helloworld@gmail.com						|     password | 
      
  
    Scenario: Login without email as admin
    Given navigate to landing page and click login button2 as admin
    When set without email as admin
    And Click sign in button2 as admin
    Then login is failed as admin
    
    Scenario: Login without password as admin
    Given navigate to landing page and click login button3 as admin
    When set without password as admin
    And Click sign in button3 as admin
    Then login is failed2 as admin
      
 