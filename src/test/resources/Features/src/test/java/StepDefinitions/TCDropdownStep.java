//This is a Step Definition file to write the steps for test the Technology consulting Dropdown Section in
//Unison Consulting Website.
//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//					|					   |
//Date : 31-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna

//Version- 1.1 Update :This is totally new step definition file added to the existing project to test the Technology Consulting section of the website.

package StepDefinitions;

import Pages.TCDropdownPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCDropdownStep {
	
	@When("User click on Professional Service the  Dropdown")
	public void user_click_on_professional_service_the_dropdown() throws Exception {
		TCDropdownPage.DropdownProfessionalService();
		BaseClass.takeScreenshot("User click on Professional Service the  Dropdown");
	}

	@Then("User Should navigate to Professional Service page and get back to homepage")
	public void user_should_navigate_to_professional_service_page_and_get_back_to_homepage()throws Exception {
		TCDropdownPage.ProfessionalServicePageCheck();
	}

	@When("User click on  the Custom Development in Risk Management Dropdown")
	public void user_click_on_the_custom_development_in_risk_management_dropdown()throws Exception {
		TCDropdownPage.DropdownCustomDevelopment();
		BaseClass.takeScreenshot("User click on  the Custom Development in Risk Management Dropdown");
	}

	@Then("User Should navigate to Custom Development page and get back to homepage")
	public void user_should_navigate_to_custom_development_page_and_get_back_to_homepage()throws Exception {
		TCDropdownPage.CustomDevelopmentPageCheck();
	}

	@When("User click on  the Big Data in Risk Management Dropdown")
	public void user_click_on_the_big_data_in_risk_management_dropdown()throws Exception {
		TCDropdownPage.DropdownBigData();
		BaseClass.takeScreenshot("User click on  the Big Data in Risk Management Dropdown");
	}

	@Then("User Should navigate to Big Data page and get back to homepage")
	public void user_should_navigate_to_big_data_page_and_get_back_to_homepage()throws Exception {
		TCDropdownPage.BigDataPageCheck();
	}

	@When("User click on  the Full Stack in Risk Management Dropdown")
	public void user_click_on_the_full_stack_in_risk_management_dropdown()throws Exception {
		TCDropdownPage.DropdownFullStack();
		BaseClass.takeScreenshot("User click on  the Full Stack in Risk Management Dropdown");
	}

	@Then("User Should navigate to Full Stack page and get back to homepage")
	public void user_should_navigate_to_full_stack_page_and_get_back_to_homepage()throws Exception {
		TCDropdownPage.DropdownFullStack();
	}

	@When("User click on  the Data Warehousing in Risk Management Dropdown")
	public void user_click_on_the_data_warehousing_in_risk_management_dropdown() throws Exception{
		TCDropdownPage.DropdownDataWarehousing();
		BaseClass.takeScreenshot("User click on  the Data Warehousing in Risk Management Dropdown");
	}

	@Then("User Should navigate to Data Warehousing page and get back to homepage")
	public void user_should_navigate_to_data_warehousing_page_and_get_back_to_homepage()throws Exception {
		TCDropdownPage.DataWarehousingPageCheck();
	}

	@When("User click on  the in BI&Analytics Dropdown")
	public void user_click_on_the_in_bi_analytics_dropdown() throws Exception{
		TCDropdownPage.DropdownBIandAnalytics();
		BaseClass.takeScreenshot("User click on  the in BI&Analytics Dropdown");
	}

	@Then("User Should navigate to BI&Analytics page and get back to homepage")
	public void user_should_navigate_to_bi_analytics_page_and_get_back_to_homepage()throws Exception {
		TCDropdownPage.BIandAnalyticsPageCheck();
	}




}
