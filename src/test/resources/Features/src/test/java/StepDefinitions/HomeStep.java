package StepDefinitions;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Utilities.BaseClass;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep extends BaseClass {
	
//	static WebDriver driver = BaseClass.driver;
	      
    @Then("User verifies the title of the website is Unison – Consulting")
    public void userVerifiesTheTitleOfTheWebsiteIs() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number on which browser do u want to run.....?");
    	System.out.println("1.Chrome\n 2.Edge\n 3.FireFox\n");
    	int key=sc.nextInt();   
    	switch(key)
    	{
    	case 1:{
    		BaseClass.setUpChrome();
    		break;
    	}
    	case 2:
    	{
    		BaseClass.setupEdge();
    		break;
    	}
    	case 3:
    	{
    		BaseClass.setupFirefox();
    		break;
    	}
    	default:
    		BaseClass.setUpChrome();
  
    	}
    	
    	Homepage.TitleCheck("Unison – Consulting");
    }

    @Then("User should see the website logo displayed")
    public void userShouldSeeTheWebsiteLogoDisplayed() throws Exception {
    	Homepage.LogoCheck();
        BaseClass.takeScreenshot("User should see the website logo displayed");
    }

//    @When("User clicks on the Read More button")
//    public void userClicksOnTheReadMoreButton() throws Exception {
//    	Homepage.ReadMoreBtnCheck();
//    }
    @When("i click on Readmore under powering financial.")
    public static void i_click_on_readmore_under_powering_financial() throws InterruptedException {
    	Thread.sleep(500);
    	Homepage.Read_more_under_powering();
        
    }

    @Then("redirect to Readmore page.")
    public void redirect_to_readmore_page() throws Exception {
    	BaseClass.We_are_unison();
        BaseClass.takeScreenshot("User should be redirected to the Read More page");
        BaseClass.Home();
        Thread.sleep(200);
    }
    
    @When("i click on Readmore under Helping Enterprises.")
    public void i_click_on_readmore_under_helping_enterprises() throws InterruptedException {
    	Thread.sleep(500);
        Homepage.Read_more_button_Helping();
    }

    @Then("should navigate to Helping Enterprises page.")
    public void should_navigate_to_helping_enterprises_page() throws IOException {
       BaseClass.We_are_unison();
       BaseClass.takeScreenshot("we are unison page");
       BaseClass.Home();
    }
    
    
    

    @When("User clicks on the Join Us button")
    public void userClicksOnTheJoinUsButton() throws Exception {
    	Homepage.JoinUsBtnCheck();
    }

    @Then("User should be redirected to the Join Us page.")
    public void user_should_be_redirected_to_the_join_us_page() throws Exception {
    	Homepage.JoinUsPageCheck();
    	 BaseClass.takeScreenshot("User should be redirected to the Join Us page");

    }
}
