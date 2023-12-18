@tag
Feature: Manage modules as admin
  create,edit,delete

  @tag1
  Scenario: create module as admin
    Given successful login and go to add module page
    When set data in form create modul and click button save
    Then check succes modul
  
   Scenario: create module empty  in textfield section
    Given successful login and go to add module page2
    When Don't fill in section and click the save button
    Then check modul
    
   Scenario: create an empty module in module title text field
    Given successful login and go to add module page3
    When Don't fill in module title and click the save button
    Then check modul2
   
   Scenario: create module empty in textfield module
    Given successful login and go to add module page4
    When Don't fill in module and click the save button
    Then check modul3
    
    Scenario: cancel create module
    Given successful login and go to add module page5
    When click the cancel button
    Then check cancel
   
   Scenario: create module as admin after create section
    Given successful login and go to manage module page
    When set data and click the save button
    Then check modul4
    
   Scenario: create module empty in title text field after create section
    Given successful login and go to manage module page2
    When Don't fill in module title and click the save button2
    Then check modul5
   
   Scenario: create module empty in module text field after create section
    Given successful login and go to manage module page3
    When Don't fill in module and click the save button3
    Then check modul6
    
   Scenario: edit module as admin
    Given successful login and go to manage module page4
    When set section and click icon ceklis
    Then check edit
   
   Scenario: edit module without module title as admin
    Given successful login and go to manage module page5
    When Don't fill in module title and click save button
    Then check edit2
    
    Scenario: edit module without module as admin
    Given successful login and go to manage module page6
    When Don't fill in module and click save button
    Then check edit3
   
   Scenario: delete module as admin
    Given successful login and go to manage module page7
    When delete
    Then check delete
    

