/* I update the verification part in below code there is missing the part 
 *  * while user is navigate to the corresponding page we know to the page is display or not

 * Initial version by <sai krishna>
 * 
 / Date 30-05-24
  * 
  *  / New Version is Update by <Sudharsan>
  * 
  *  / update in the verification  part in corresponding  pages
  *  
  *  
 */
package StepDefinitions;

import org.openqa.selenium.WebDriver;
import Pages.KnowUsPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KnowUsStep{
		
	WebDriver driver = BaseClass.driver;

	@When("User click on Known us dropdown should be open")
	public void user_click_on_known_us_dropdown_should_be_open() throws Exception {
	
		KnowUsPage.Knownus_dropdown_open();
	    BaseClass.takeScreenshot("User click on Known us dropdown should be open");
	}

	@Then("click on About Us page should be loaded")
	public void click_on_about_us_page_should_be_loaded() throws Exception {
		KnowUsPage.AboutUs();
	    BaseClass.takeScreenshot("click on About Us page should be loaded");
	    Thread.sleep(1000);
	    BaseClass.Home();
	}

	@Then("click on why choose us on the dropdown")
	public void click_on_why_choose_us_on_the_dropdown() throws Exception {
		KnowUsPage.Knownus_dropdown_open();
		Thread.sleep(500);
		KnowUsPage.WhyChooseUs();
	    BaseClass.takeScreenshot("click on why choose us on the dropdown");
	    Thread.sleep(500);
	    BaseClass.Home();
	}
	
	@Then("click on Mission & Vision on the dropdown")
	public void click_on_mission_vision_on_the_dropdown() throws Exception {
		KnowUsPage.Knownus_dropdown_open();
		Thread.sleep(500);
		KnowUsPage.MissionAndVision();
		Thread.sleep(500);
		BaseClass.takeScreenshot("click on Mission & Vision on the dropdown");
		Thread.sleep(500);
		
	}
	
	@Then("Mission & Vision page and click on our vision")
	public void mission_vision_page_and_click_on_our_vision() throws Exception {
	KnowUsPage.OurVision();
    BaseClass.takeScreenshot("Mission & Vision page and click on our vision");
    Thread.sleep(500);
    BaseClass.Home();
	}

	@Then("click on our team on the dropdown")
	public void click_on_our_team_on_the_dropdown() throws Exception {
		KnowUsPage.Knownus_dropdown_open();
		Thread.sleep(500);
		KnowUsPage.OurTeam();
	    BaseClass.takeScreenshot("click on our team on the dropdown");	    
	    Thread.sleep(500);
	    BaseClass.Home();
	}

	@Then("click on core values on the dropdown")
	public void click_on_core_values_on_the_dropdown() throws Exception {
		KnowUsPage.Knownus_dropdown_open();
		Thread.sleep(500);
		KnowUsPage.CoreValues();
	    BaseClass.takeScreenshot("click on core values on the dropdown");
	    Thread.sleep(500);
	    BaseClass.Home();
	}

	@Then("click on our clients on the dropdown")
	public void click_on_our_clients_on_the_dropdown() throws Exception {
		KnowUsPage.Knownus_dropdown_open();
		Thread.sleep(500);
		KnowUsPage.OurClients();
	    BaseClass.takeScreenshot("click on our clients on the dropdown");
	    Thread.sleep(500);
	    BaseClass.Home();
	}

	@Then("click on our partners on the dropdown")
	public void click_on_our_partners_on_the_dropdown() throws Exception {
		KnowUsPage.Knownus_dropdown_open();
		Thread.sleep(500);
		KnowUsPage.OurPartners();
	    BaseClass.takeScreenshot("click on our partners on the dropdown");
	    Thread.sleep(500);
	    BaseClass.Home();
	    
	}

	@Then("click on Awards on the dropdown")
	public void click_on_awards_on_the_dropdown() throws Exception {
		KnowUsPage.Knownus_dropdown_open();
		Thread.sleep(500);
		KnowUsPage.Awards();
	    BaseClass.takeScreenshot("click on Awards on the dropdown");
	    Thread.sleep(500);
	    BaseClass.Home();
	}
}
