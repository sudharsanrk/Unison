package StepDefinitions;

import java.io.IOException;

import Pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsStep extends ProductsPage {
	/* Version    Date  			 Update   			comments
	1		 03/06/24       updated by Deepika       Products drop down section added
  */
@Then("I move mouse over Products dropdown and  menus should be displayed")
public void i_move_mouse_over_products_dropdown_and_menus_should_be_displayed() throws IOException {
   products_dropdown();
}

@When("Click on the Risk Insights button")
public void click_on_the_risk_insights_button() {
  Risk_insights_button();
}

@Then("I should be redirected to the Risk Insight page")
public void i_should_be_redirected_to_the_risk_insight_page() throws IOException {
   Risk_insights_page();
}

@When("Click on the Risk Analytics button")
public void click_on_the_risk_analytics_button() {
    Risk_Analytics_button();
}

@Then("I should be redirected to the Risk Analytics page")
public void i_should_be_redirected_to_the_risk_analytics_page() throws IOException {
    Risk_Analytics_page();
}

@When("Click on the Data Quality button")
public void click_on_the_data_quality_button() {
    Data_Quality_button();
}

@Then("I should be redirected to the Data Quality page")
public void i_should_be_redirected_to_the_data_quality_page() throws IOException {
    Data_Quality_page();
}

@When("Click on the Data Migration button")
public void click_on_the_data_migration_button() {
	Data_Migration_button();
    }

@Then("I should be redirected to the Data Migration page")
public void i_should_be_redirected_to_the_data_migration_page() throws IOException {
    Data_Migration_page();
}

@When("Click on the Data Reconciliation button")
public void click_on_the_data_reconciliation_button() {
    Data_Reconciliation_button();
}

@Then("I should be redirected to the Data Reconciliation page")
public void i_should_be_redirected_to_the_data_reconciliation_page() throws IOException {
    Data_Reconciliation_page();
}



}
