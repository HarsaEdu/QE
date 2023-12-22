@tag
Feature: manage kelas
  filter, search, create, update delete class

  @tag1
  Scenario: filter category
    Given login and go to class menu
    When set filter category and select category
    Then Check the category filter results
    
  Scenario: search class
    Given login and go to class menu2
    When set search correctly
    Then check search results  
    
  Scenario: search class but no data
    Given login and go to class menu3
    When set search incorrectly
    Then check search results2 
    
  Scenario: create class
    Given login and go to form create class
    When set all data properly and click save button
    Then check pop up success
    
  Scenario: create class but empty text field in title
    Given login and go to form create class2
    When do not fill in title textfield and click save button
    Then check message tittle
         
  Scenario: create class but empty text field in description
    Given login and go to form create class3
    When do not fill in description textfield and click save button
    Then check message description
    
  Scenario: create class but empty select box in category
    Given login and go to form create class4
    When do not fill in category select box and click save button
    Then check message category
    
  Scenario: create class but empty select box in instructor
    Given login and go to form create class5
    When do not fill in instructor select box and click save button
    Then check message instructor
         
 Scenario: create class with empty columns in the image
    Given login and go to form create class6
    When do not fill in upload image and click save button
    Then check message image
    
 Scenario: create class with empty columns on images that are too large
    Given login and go to form create class7
    When upload a large image and click save button
    Then check message image is too large

 Scenario: create a class on an image with the wrong format
    Given login and go to form create class8
    When upload wrong format image and click save button
    Then check message image is formatted incorrectly
    
 Scenario: cancel create class
    Given login and go to form create class9
    When click cancel button
    Then check return to previous page 
    
 Scenario: edit class
    Given login and go to form edit class
    When set title and click save button
    Then check pop up success update      
    
    
 Scenario: edit class but empty text field in title
    Given login and go to form edit class2
    When delete contents of title text field and click save button
    Then check message edit title
    
  Scenario: edit class but empty text field in description
    Given login and go to form edit class3
    When delete contents of description text field and click save button
    Then check message edit description
    
  Scenario: edit class with empty columns on images that are too large
    Given login and go to form edit class4
    When upload a large image and click the save button
    Then check message edit image large     
    
    
 Scenario: edit a class on an image with the wrong format
    Given login and go to form edit class5
    When upload an incorrectly formatted image and click the save button
    Then check message edit image format incorrectly
    
 
  Scenario: delete class
    Given login and go to delete class
    When click button delete and confirm
    Then check message success delete
