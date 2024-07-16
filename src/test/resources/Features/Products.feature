
# Version    Date  			     Update   			            comments
#		1		    03/06/24       updated by Deepika       Products drop down section added
	  
Feature: verify the Products dropdown menu

	Background:

	Then I move mouse over Products dropdown and  menus should be displayed

	Scenario: Verify Risk Insights page
	When Click on the Risk Insights button
	Then I should be redirected to the Risk Insight page
	
	Scenario: 
	When Click on the Risk Analytics button
	Then I should be redirected to the Risk Analytics page
	
	Scenario: Verify Data Quality button
	When Click on the Data Quality button
	Then I should be redirected to the Data Quality page
	
	Scenario: Verify Data Migration button
	When Click on the Data Migration button
	Then I should be redirected to the Data Migration page
	
	Scenario: Verify Data Reconcillation page
	When Click on the Data Reconciliation button
	Then I should be redirected to the Data Reconciliation page
	

