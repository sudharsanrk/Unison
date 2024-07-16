package StepDefinitions;



import io.cucumber.java.en.And;


import io.cucumber.java.en.Then;

import java.io.IOException;



import Pages.RiskManagementPage;




public class RiskManagementStep  extends RiskManagementPage {
	/*  Version   Date           Version update                                    Comments
		1	    29/05/24       Initial version updated be Deepika
		2		30/05/24	   New version updated by Deepika			   1. No need to call the webDriver
		2		30/05/24	   New version updated by Deepika		       2. By using extends  RiskManagementPage class, we can directly access the all  methods in RiskManagementPage class.
		2		30/05/24       New version updated by Deepika		       3. Instead of writing the screenshot methods in this class, I have embedded the screenshots  in methods of  RiskManagementPage class 
	 	
	 */
	
	
//    -----------------------This is Credit Risk Management ------------------------------

    @Then("Clicking on the Credit Risk Management Image")
    public void User_should_be_navigated_to_Credit_Risk_Management_page() throws IOException, Exception {
    	
    	CreditRiskManagement();
    }

    @And("Should see the Credit Risk Management Page")
    public void User_should_see_the_credit_risk_management_page() throws Exception {
    	CRMPageCheck(); 
    }  
    
    
//         --------------------------- This is Market Risk Management --------------------------------------

    @Then("Clicking on the Market Risk Management Image")
    public void User_should_be_navigated_to_Market_risk_management_image() throws IOException, Exception {
    	MarketRiskManagement();
    }

    @And("Should see the Market Risk Management Page")
    public void Should_see_the_credit_risk_management_page() throws Exception {
    	MRMPageCheck();
    } 
//    ------------------This Liquidity Risk Management----------------------------------------------
    
    @Then("Clicking on the Liquidity Risk Management Image")
    public void Clicking_on_the_liquidity_risk_management_image() throws Exception {
    	LiquidityRiskManagement();
        
    }

    @Then("Should see the Liquidity Risk Management Page")
    public void Should_see_the_liquidity_risk_management_page() throws Exception {
    	LRMPageCheck();
    
    }
    
//    	----------------------This is Enterprise Risk Management --------------------------------
	
	@Then("Clicking on the Enteterprise Risk Management Image")
	public void Clicking_on_the_enteterprise_risk_management_image() throws Exception {
		EnterPriseRiskManagement();
	}
	
	@Then("Should see the Enterprise Risk Management Page")
	public void Should_see_the_enterprise_risk_management_page() throws Exception {
		ERMPageCheck();
	}
	
//	-------------------------This is Regulatory Risk management -------------------------

	@Then("Clicking on the Regulatory Risk Management Image")
	public void Clicking_on_the_regulatory_risk_management_image() throws Exception {
		RegulatoryRiskManagement();
	}

	@Then("Should see the Regulatory Risk Management Page")
	public void should_see_the_regulatory_risk_management_page() throws Exception {
		RRMPageCheck();
	}
	
//      ----------------------------This is Statistical Behavioral Modelling ------------------------------------

    @Then("Clicking on the Statistical Behavioral Modelling Image")
    public void clicking_on_the_statistical_behavioral_modelling_image() throws Exception {
    	
    	StatisticalBehavioralManagement();
    }

    @Then("Should see the Statistical Behavioral Modelling Page")
    public void should_see_the_statistical_behavioral_modelling_page() throws Exception {
    	SBMPageCheck();
    	}
    
    
}
