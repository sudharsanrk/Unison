//This is a Step Definition file to write the steps for test the Unison Consulting - The Differentiator Section in
//Unison Consulting Website.
//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//					|					   |
//Date : 31-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna

//Version- 1.1 Update : Click on next image step was added and steps for scenario outline was also updated.


package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.UnisonConsultingPage.*;
import Utilities.BaseClass;


public class UnisonConsultingStep extends BaseClass {
        
//	---------------------------View Our Partners Section -------------------------------
	
    @When("I click on the View our Partners")
    public void i_click_on_the_view_our_partners() throws Exception {
        OurPartners();
        takeScreenshot("I click on the View our Partners");
        Thread.sleep(500);  
    }

    @Then("I should see our partners images")
    public void i_should_see_our_partners_images() throws Exception {
    	OurPartnersImages();
    	takeScreenshot("I should see our partners images");
        
    }

    @When("I click on the image")
    public void i_click_on_the_image() throws Exception {
    	ClickingImage();
    	takeScreenshot("I click on the image");    
    }  
    
//    This step definition has Updated
    
    @Then("Click on next image")
    public void Click_on_next_image() throws Exception {
    	ClickingNextImage();
    	takeScreenshot("Click on next image");
    	driver.navigate().refresh();
    }
    
//    ------------------Join Our Partners Section----------------------------

    @When("User clicks on join our Partners Network")
    public void userClicksOnJoinOurPartnersNetwork() throws Exception {
    	Thread.sleep(500);
    	JoinOurPartners();
        takeScreenshot("User clicks on join our Partners Network");
    }

    @Then("User enters First Name as {string}, Last Name as {string}, Work Mail as {string}, Company Name as {string}, country name as {string} ,Your Message as {string}")
    public void user_enters_first_name_as_last_name_as_work_mail_as_company_name_as_country_name_as_your_message_as(String fname, String lastname, String email, String cname, String country, String msg) throws Exception {
    	FormValues(fname, lastname, email, cname, country, msg);
    	Thread.sleep(500);
    	takeScreenshot("User enters First Name as {string}, Last Name as {string}, Work Mail as {string}, Company Name as {string}, country name as {string} ,Your Message as {string}");
    }
    
    @Then("User clicks on the send button")
    public void userClicksOnTheSendButton() throws Exception {
    	Send();
    	Thread.sleep(500);
    	BaseClass.takeScreenshot("User clicks on the send button");
    }
    @Then("Click on x Btn")
    public void Click_on_x_Btn() throws Exception {
    	XBtn();
    	BaseClass.takeScreenshot("Then click on x Btn");
    	
    }
    @Then("User quit the browser")
    public void user_quit_the_browser() {
    		driver.quit();
     }

}