//This is a feature file for test the Footer section of the Unison consulting website.//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//				    |                      |
//Date : 02-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna
//
//Version- 1.1 Update : This is totally new step definition file added to the existing project to test the footer section of the website.

//Date : 02-05-2024 | New Version    : 1.2 |  Updated by Sudharsan
//
//Version- 1.1 Update : This is totally new Page file added to the existing project to test the footer section of the website.
//Version- 1.2 Update : This is remaining section new Page file added to the existing project to test the footer section of the website.


package StepDefinitions;

import java.io.IOException;

import Pages.FooterPage;
import Pages.RiskManagementPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterStep extends BaseClass {
	
	@When("User Go to the footer section Click on Credit Risk")
	public void user_go_to_the_footer_section_click_on_credit_risk() throws Exception {
//		BaseClass.setUp();
		BaseClass.setUpChrome();
		FooterPage.FooterCreditRiskManagement();
		BaseClass.takeScreenshot("User Go to the footer section Click on Credit Risk");
		Thread.sleep(200);
	}
	
	@Then("Check Credit Risk Management page loaded and get back to homepage")
	public void check_credit_risk_management_page_loaded_and_get_back_to_homepage() throws Exception{
		RiskManagementPage.MRMPageCheck();
		Thread.sleep(200);
	}

	@When("User Go to the footer section Click on Market Risk")
	public void user_go_to_the_footer_section_click_on_market_risk()throws Exception {
		FooterPage.FooterCreditRiskManagement();
		BaseClass.takeScreenshot("User Go to the footer section Click on Market Risk");
		Thread.sleep(200);
	}

	@Then("Check Market Risk Management page loaded and get back to homepage")
	public void check_market_risk_management_page_loaded_and_get_back_to_homepage() throws Exception{
		RiskManagementPage.MRMPageCheck();
	}

	@When("User Go to the footer section Click on Liquidity Risk")
	public void user_go_to_the_footer_section_click_on_liquidity_risk()throws Exception {
		FooterPage.FooterLiquidityRiskManagement();
		BaseClass.takeScreenshot("User Go to the footer section Click on Liquidity Risk");
		Thread.sleep(200);
	}

	@Then("Check Liquidity Risk Management page loaded and get back to homepage")
	public void check_liquidity_risk_management_page_loaded_and_get_back_to_homepage() throws Exception{
		RiskManagementPage.LRMPageCheck();
		Thread.sleep(200);
	}

	@When("User Go to the footer section Click on Enterprise Risk")
	public void user_go_to_the_footer_section_click_on_enterprise_risk()throws Exception {
		FooterPage.FooterEnterpriseRiskManagement();
		BaseClass.takeScreenshot("User Go to the footer section Click on Enterprise Risk");
		Thread.sleep(200);
	}

	@Then("Check Enterprise Risk Management page loaded and get back to homepage")
	public void check_enterprise_risk_management_page_loaded_and_get_back_to_homepage() throws Exception{
		RiskManagementPage.ERMPageCheck();
		Thread.sleep(200);
	}

	@When("User Go to the footer section Click on Regulatory Risk")
	public void user_go_to_the_footer_section_click_on_regulatory_risk() throws Exception{
		FooterPage.FooterRegulatoryRiskManagement();
		BaseClass.takeScreenshot("User Go to the footer section Click on Regulatory Risk");
		Thread.sleep(200);
	}

	@Then("Check Regulatory Risk Management page loaded and get back to homepage")
	public void check_regulatory_risk_management_page_loaded_and_get_back_to_homepage() throws Exception{
		RiskManagementPage.RRMPageCheck();
		Thread.sleep(200);
	}

	@When("User Go to the footer section Click on Statistical behavioral Modelling")
	public void user_go_to_the_footer_section_click_on_statistical_behavioral_modelling() throws Exception{
		FooterPage.FooterStatisticalBehaviouralModelling();
		BaseClass.takeScreenshot("User Go to the footer section Click on Statistical behavioral Modelling");
		Thread.sleep(200);
	}

	@Then("Check Statistical behavioral Modelling page loaded and get back to homepage")
	public void check_statistical_behavioral_modelling_page_loaded_and_get_back_to_homepage()throws Exception {
		RiskManagementPage.SBMPageCheck();
		Thread.sleep(200);
	}
	
//	------------------------- Our Products -----------------------
	
	@When("User Go to the footer section Click on Risk Insights")
	public void user_go_to_the_footer_section_click_on_risk_insights() throws Exception{
		FooterPage.FooterRiskInsights();
		BaseClass.takeScreenshot("User Go to the footer section Click on Risk Insights");
		Thread.sleep(200);
		
	}

	@Then("Check Risk Insights page loaded and get back to homepage")
	public void check_risk_insghts_page_loaded_and_get_back_to_homepage()throws Exception {
		FooterPage.FooterRiskInsightsPageCheck();
		Thread.sleep(200);
		
	}
	@When("User Go to the footer section Click on Risk Analytics")
	public void user_go_to_the_footer_section_click_on_risk_analytics() throws Exception{
		FooterPage.FooterRiskAnalytics();
		BaseClass.takeScreenshot("User Go to the footer section Click on Risk Analytics");
		Thread.sleep(200);
	}

	@Then("Check Risk Analytics page loaded and get back to homepage")
	public void check_risk_analytics_page_loaded_and_get_back_to_homepage()throws Exception {
		FooterPage.FooterRiskAnalyticsPageCheck();
		
	}
	@When("User Go to the footer section Click on Data Quality")
	public void user_go_to_the_footer_section_click_on_data_quality() throws Exception{
		FooterPage.FooterDataQuality();
		BaseClass.takeScreenshot("User Go to the footer section Click on Data Quality");
		Thread.sleep(200);
	}

	@Then("Check Data Quality page loaded and get back to homepage")
	public void check_data_quality_page_loaded_and_get_back_to_homepage()throws Exception {
		FooterPage.FooterDataQualityPageCheck();
		
	}
	@When("User Go to the footer section Click on Data Migration")
	public void user_go_to_the_footer_section_click_on_data_migration() throws Exception{
		FooterPage.FooterDataMigration();
		BaseClass.takeScreenshot("User Go to the footer section Click on Data Migration");
		Thread.sleep(200);
	}

	@Then("Check Data Migartion page loaded and get back to homepage")
	public void check_data_migration_page_loaded_and_get_back_to_homepage()throws Exception {
		FooterPage.FooterDataMigrationPageCheck();
	}
	@When("User Go to the footer section Click on Data Reconcilication")
	public void user_go_to_the_footer_section_click_on_data_reconciliation() throws Exception{
		FooterPage.FooterDataReconciliation();
		BaseClass.takeScreenshot("User Go to the footer section Click on Data Reconcilication");
		Thread.sleep(200);
	}

	@Then("Check Data Reconcilication page loaded and get back to homepage")
	public void check_data_reconciliation_page_loaded_and_get_back_to_homepage()throws Exception {
		FooterPage.FooterDataReconciliationPageCheck();
	}


	
	//Version- 1.1 Update : This is totally new Page file added to the existing project to test the footer section of the website.
	//Version- 1.2 Update : This is remaining section new Page file added to the existing project to test the footer section of the website.



@Given("user go to the footer section click on Data Warehousing")
public void user_go_to_the_footer_section_click_on_data_warehousing() throws InterruptedException {
	 FooterPage.Logo();
    FooterPage.DataWarehousing ();
    
}

@Then("check Data Warehousing page loaded and get back to homepage")
public void check_data_warehousing_page_loaded_and_get_back_to_homepage() throws InterruptedException, IOException {
	FooterPage.DataWarehousingpage();
   takeScreenshot("Datawarehousing");
   FooterPage.Logo();
}

@Given("user go to the footer section click on BI & Analytics")
public void user_go_to_the_footer_section_click_on_bi_analytics() {
	FooterPage.BiAnalytics();
   
   
}

@Then("check BI & Analytics page loaded and get back to homepage")
public void check_bi_analytics_page_loaded_and_get_back_to_homepage() throws IOException {
	FooterPage.BiAnalyticspage();
   takeScreenshot("BI & Analytics ");
   FooterPage.Logo();
   
}

@Given("user go to the footer section click on Professional Service")
public void user_go_to_the_footer_section_click_on_professional_service() {
	FooterPage.Professional();
}

@Then("check Professional Service page loaded and get back to homepage")
public void check_professional_service_page_loaded_and_get_back_to_homepage() throws IOException {
	FooterPage.Professionalpage();
   takeScreenshot("Professional Service ");
   FooterPage.Logo();
}

@Given("user go to the footer section click on Custom Development")
public void user_go_to_the_footer_section_click_on_custom_development() {
	FooterPage.Customdevlopment();
}

@Then("check Custom Development page loaded and get back to homepage")
public void check_custom_development_page_loaded_and_get_back_to_homepage() throws IOException {
	FooterPage.Customdevlopmentpage();
    takeScreenshot("Custom Developmen");
    FooterPage.Logo();
}

@Given("user go to the footer section click on Big Data")
public void user_go_to_the_footer_section_click_on_big_data() {
	FooterPage.BiAnalytics();
}

@Then("check Big Data page loaded and get back to homepage")
public void check_big_data_page_loaded_and_get_back_to_homepage() throws IOException {
	FooterPage.BiAnalyticspage();
   takeScreenshot("Big Data ");
   FooterPage.Logo();
}

@Given("user go to the footer section click on Full Stack")
public void user_go_to_the_footer_section_click_on_full_stack() {
	FooterPage.fullstrack();
}

@Then("check Full Stack page loaded and get back to homepage")
public void check_full_stack_page_loaded_and_get_back_to_homepage() throws IOException {
	FooterPage.facebookpage();
   takeScreenshot("Full Stack page");
   FooterPage.Logo();
}

@Given("user go to the footer section click on Unison Consulting Pte Ltd address")
public void user_go_to_the_footer_section_click_on_unison_consulting_pte_ltd_address() throws InterruptedException {
    
}

@Given("user go to the footer section scroll to Unison Consulting Pte Ltd address")
public void user_go_to_the_footer_section_scroll_to_unison_consulting_pte_ltd_address() throws InterruptedException {
	FooterPage.Address();
}
@Then("verify Unison Consulting Pte Ltd address is displayed")
public void verify_unison_consulting_pte_ltd_address_is_displayed() throws InterruptedException, IOException {
	FooterPage.Addresstext();
    takeScreenshot("Unison Consulting Pte Ltd address");
    FooterPage.Logo();
}

@Given("user go to the footer section click on Facebook icon")
public void user_go_to_the_footer_section_click_on_facebook_icon() {
	FooterPage.facebook();
}

@Then("check Facebook   page loaded and get back to homepage")
public void check_facebook_page_loaded_and_get_back_to_homepage() {
	FooterPage.facebookpage();
}

@Given("user go to the footer section click on Twitter icon")
public void user_go_to_the_footer_section_click_on_twitter_icon() {
	FooterPage.Twitter();
}

@Then("check Twitter  page loaded and get back to homepage")
public void check_twitter_page_loaded_and_get_back_to_homepage() {
	FooterPage.Twitterpage();
}

@Given("user go to the footer section click on Instagram icon")
public void user_go_to_the_footer_section_click_on_instagram_icon() {
	FooterPage.Instagram();
}


@Then("check Instagram page loaded and get back to homepage")
public void check_instagram_page_loaded_and_get_back_to_homepage() throws InterruptedException {
	FooterPage.Instagrampage();
}

@Given("user go to the footer section click on Linked in icon")
public void user_go_to_the_footer_section_click_on_linked_in_icon() {
	FooterPage.LInkedin();
}

@Then("check Linked in page loaded and get back to homepage")
public void check_linked_in_page_loaded_and_get_back_to_homepage() {
	FooterPage.Linkedinpage();
	FooterPage.Logo();
}

}
