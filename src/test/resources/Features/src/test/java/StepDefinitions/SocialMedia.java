package StepDefinitions;

import Pages.Socialmediaicons;
import Utilities.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  static Pages.Socialmediaicons.*;

public class SocialMedia extends BaseClass {
	@When("i open website navigate to president section.")
	public void i_open_website_navigate_to_president_section() throws InterruptedException {
		BaseClass.setUpChrome();
		President_Profile();
		
	}

	@When("click on facebook icon and it should navigate to facebook page.")
	public static void click_on_facebook_icon_and_it_should_navigate_to_facebook_page() throws InterruptedException {
		Facebook();
	   
	}

	@Then("back to home page")
	public void back_to_home_page() {
//		Home();
	}

	@Then("click on twitter icon and it should redirect to twitter page.")
	public static void click_on_twitter_icon_and_it_should_redirect_to_twitter_page() throws InterruptedException {
		President_Profile();
		Twitter();
//		Home();
	}

	@Then("click on linkedin icon and navigate to linked page.")
	public void click_on_linkedin_icon_and_navigate_to_linked_page() throws InterruptedException {
		President_Profile();
		linkedin();
//		Home();   
	}
	@When("i go cofounder section.")
	public void i_go_cofounder_section() throws InterruptedException {
	    Cofounder_Profile();
	}

	@When("click on facebook and it should navigate to facebook page.")
	public void click_on_facebook_and_it_should_navigate_to_facebook_page() throws InterruptedException {
		Cofounder_Profile();
		Facebookcofounder();
//		Home();
	    
	}

	@Then("click on twitter and it should navigate ton twiteer page.")
	public void click_on_twitter_and_it_should_navigate_ton_twiteer_page() throws InterruptedException {
		Cofounder_Profile();
		Twittercofounder();
//		Home();
	    
	}


@Then("click on linkedin and shouls naviagte to linkedin page.")
public void click_on_linkedin_and_shouls_naviagte_to_linkedin_page() throws InterruptedException {
	Cofounder_Profile();
	linkedincofounder();
//	Home();
}
@When("i go to cofounder2 section.")
public void i_go_to_cofounder2_section() throws InterruptedException {
	Cofounder2_Profile();
}

@When("click on fb logo and navigate to fb page.")
public void click_on_fb_logo_and_navigate_to_fb_page() throws InterruptedException {
	Facebookcofounder2();
	
    
}

@Then("click on Tw logo and it should navigate to tw page.")
public void click_on_tw_logo_and_it_should_navigate_to_tw_page() throws InterruptedException {
	Twittercofounder2();
   
}

@Then("click on li logo and reditect to li page.")
public void click_on_li_logo_and_reditect_to_li_page() throws InterruptedException {
	linkedincofounder2();
	Home();
    
}

}
