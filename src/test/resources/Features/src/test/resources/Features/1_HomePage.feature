#Version history
#V1.0 - initial code push by SaiKrishna on <29-5-24>
#V1.1 - Added Two scenarios in this feature file on <30-5-24>
#				1) In line 22 added readmore button scenario under powering finanical
#				2) In line 27 added readmore button scenario under helping Enterprises



Feature: Homepage Verification

  Scenario: Verify homepage elements
  
    Then User verifies the title of the website is Unison – Consulting
    And User should see the website logo displayed
    
  #Scenario: Click on Read More button and verify page load  
  #
    #When User clicks on the Read More button
    #Then User should be redirected to the Read More page
    
    
	Scenario: Verify Readmore button under powering financial.
	
		When i click on Readmore under powering financial.
		Then redirect to Readmore page.

	Scenario: Verify Readmore button under Helping Enterprises.
	
		When i click on Readmore under Helping Enterprises.
		Then should navigate to Helping Enterprises page.


    
  Scenario: Click on Join Us button and verify page load 
  
    When User clicks on the Join Us button
    Then User should be redirected to the Join Us page.
 