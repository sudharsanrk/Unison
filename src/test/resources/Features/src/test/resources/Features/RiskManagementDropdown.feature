#This is a feature file for test the Risk Management Dropdown of the Unison consulting website.
#
#Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
#									 |					            |
#Date : 03-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna
#
#Version- 1.1 Update : This is totally new feature file added to the existing project to test the
# Risk Management dropdown of the website.


Feature: Verifying the Risk management Dropdown

	Scenario:
		When User click on  the Credit Risk in Risk Management Dropdown
		Then User Should navigate to credit risk page and get back to homepage  
	Scenario:
		When User click on  the Market Risk in Risk Management Dropdown
		Then User Should navigate to Market risk page and get back to homepage
	Scenario:
		When User click on  the Liquidity Risk in Risk Management Dropdown
		Then User Should navigate to Liquidity risk page and get back to homepage
	Scenario:
		When User click on  the Enterprise Risk in Risk Management Dropdown
		Then User Should navigate to Enterprise risk page and get back to homepage
	Scenario:
		When User click on  the Regulatory Risk in Risk Management Dropdown
		Then User Should navigate to Regulatory risk page and get back to homepage
	Scenario:
		When User click on  the Statistical behavioural Modelling in Risk Management Dropdown
		Then User Should navigate to Statistical behavioural Modelling page and get back to homepage