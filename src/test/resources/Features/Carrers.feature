#version 1: Developed by <sudharsan> on 30/05/24



@tag
Feature: career section 
  Scenario: career section page
    Given open the enter the url of unison
    And verify careers is displayed
    
    Given open the enter the url of unison1
    And verify careers is displayed
    And cilck on career and click on submit,verify the error message
    
    Given open the enter the url of unison1
    And verify careers is displayed
    And cilck on career 
    When enter the details of apply now '<yourname>','<youremail>','<yourphone>'
    Then Click on submit
    
    Examples: 
      | yourname| youremail | yourphone |
      | Test    |   Test    ||
      | Test     ||  Test   |
    