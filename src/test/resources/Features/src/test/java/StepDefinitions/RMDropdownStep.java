//This is a Step definition file for test the Risk Management Drop down of the Unison consulting website.
//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//				    |                      |
//Date : 03-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna
//
//Version- 1.1 Update : This is totally new step definition file added to the existing project to test the footer section of the website.

package StepDefinitions;

import Pages.RMDropdownPage;
import Pages.RiskManagementPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMDropdownStep {
	@When("User click on  the Credit Risk in Risk Management Dropdown")
	public void user_click_on_the_credit_risk_in_risk_management_dropdown() throws Exception {
		RMDropdownPage.DropdownCreditRisk();
		BaseClass.takeScreenshot("User click on  the Credit Risk in Risk Management Dropdown");
	}

	@Then("User Should navigate to credit risk page and get back to homepage")
	public void user_should_navigate_to_credit_risk_page_and_get_back_to_homepage() throws Exception {
		RiskManagementPage.CRMPageCheck();
	}

	@When("User click on  the Market Risk in Risk Management Dropdown")
	public void user_click_on_the_market_risk_in_risk_management_dropdown() throws Exception {
		RMDropdownPage.DropdownMarketRisk();
		BaseClass.takeScreenshot("User click on  the Market Risk in Risk Management Dropdown");
	}

	@Then("User Should navigate to Market risk page and get back to homepage")
	public void user_should_navigate_to_market_risk_page_and_get_back_to_homepage() throws Exception {
		RiskManagementPage.MRMPageCheck();
	}

	@When("User click on  the Liquidity Risk in Risk Management Dropdown")
	public void user_click_on_the_liquidity_risk_in_risk_management_dropdown() throws Exception {
		RMDropdownPage.DropdownLiquidityRisk();
		BaseClass.takeScreenshot("User click on  the Liquidity Risk in Risk Management Dropdown");
	}

	@Then("User Should navigate to Liquidity risk page and get back to homepage")
	public void user_should_navigate_to_liquidity_risk_page_and_get_back_to_homepage() throws Exception {
		RiskManagementPage.LRMPageCheck();
	}

	@When("User click on  the Enterprise Risk in Risk Management Dropdown")
	public void user_click_on_the_enterprise_risk_in_risk_management_dropdown() throws Exception {
		RMDropdownPage.DropdownEnterpriseRisk();
		BaseClass.takeScreenshot("User click on  the Enterprise Risk in Risk Management Dropdown");
	}

	@Then("User Should navigate to Enterprise risk page and get back to homepage")
	public void user_should_navigate_to_enterprise_risk_page_and_get_back_to_homepage() throws Exception {
		RiskManagementPage.ERMPageCheck();
	}

	@When("User click on  the Regulatory Risk in Risk Management Dropdown")
	public void user_click_on_the_regulatory_risk_in_risk_management_dropdown() throws Exception {
		RMDropdownPage.DropdownRegulatoryRisk();
		BaseClass.takeScreenshot("User click on  the Regulatory Risk in Risk Management Dropdown");
	}

	@Then("User Should navigate to Regulatory risk page and get back to homepage")
	public void user_should_navigate_to_regulatory_risk_page_and_get_back_to_homepage() throws Exception {
		RiskManagementPage.RRMPageCheck();
	}

	@When("User click on  the Statistical behavioural Modelling in Risk Management Dropdown")
	public void user_click_on_the_statistical_behavioural_modelling_in_risk_management_dropdown() throws Exception {
		RMDropdownPage.DropdownStatisticalBehavioralModelling();
		BaseClass.takeScreenshot("User click on  the Statistical behavioural Modelling in Risk Management Dropdown");
	}

	@Then("User Should navigate to Statistical behavioural Modelling page and get back to homepage")
	public void user_should_navigate_to_statistical_behavioural_modelling_page_and_get_back_to_homepage() throws Exception {
		RiskManagementPage.SBMPageCheck();
	}

}
