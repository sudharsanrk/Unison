//version 1.o: Developed by <sudharsan_version_1.1> on 30/05/24
package StepDefinitions;

import java.io.IOException;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import Pages.Careerspage;
import Pages.FooterPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Careersstep  extends BaseClass{


@Given("open the enter the url of unison")
public void open_the_enter_the_url_of_unison() {
  //  setUp();
BaseClass.setUpChrome();
	
}

@And("verify careers is displayed")
public void verify_careers_is_displayed() throws InterruptedException {
   Careerspage.careersverify();
  
}

@Given("open the enter the url of unison1")
public void open_the_enter_the_url_of_unison1() {
   FooterPage.Logo();
}

@And("cilck on career and click on submit,verify the error message")
public void cilck_on_career_and_click_on_submit_verify_the_error_message() throws IOException, InterruptedException {

Careerspage.careers();
Thread.sleep(5000);
Careerspage.submit();
Thread.sleep(5000);
takeScreenshot("careers error without input");
}

@And("cilck on career")
public void cilck_on_career() throws InterruptedException {
	Careerspage.careersverify();
    FooterPage.Logo();
}

@When("enter the details of apply now {string},{string},{string}")
public void enter_the_details_of_apply_now(String yourname, String youremail, String yourphone) throws InterruptedException {
 Careerspage.careers();
Careerspage.carrersform(yourname, youremail, yourphone);
}

@Then("Click on submit")
public void click_on_submit() throws IOException, InterruptedException {
   Careerspage.submit();
   Thread.sleep(5000);
   takeScreenshot("careers form fill with invalid data");
   Careerspage.close();
}



}
