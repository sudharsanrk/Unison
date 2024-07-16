#This is a feature file to write the features for test the Unison Consulting - The Differentiator Section in
#Unison Consulting Website.
#
#Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
#									 |					            |
#Date : 31-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna
#
#Version- 1.1 Update : Click on next image feature was added and reduced the Senario Outline was update.

Feature: Unison Our Partners

  Scenario: Verifying the Our Partners images
    When I click on the View our Partners
    Then I should see our partners images
    When I click on the image
    Then Click on next image

  Scenario Outline: User interacts with Join our Partners Network form 
    When User clicks on join our Partners Network
    Then User enters First Name as '<fname>', Last Name as '<lastname>', Work Mail as '<email>', Company Name as '<cname>', country name as '<country>' ,Your Message as '<msg>'
    Then User clicks on the send button
    Then Click on x Btn
     
    Examples:
      | fname     | lastname | email         | cname          | country |   msg        |
      | Krishna   | prasad   | Rama          | Cognizant      | India   |   Hello      |
      | John      |  wick    | 				 	 	   | Angola         | Angola  |							 |
      

    
    