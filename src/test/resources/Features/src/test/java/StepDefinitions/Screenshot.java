package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utilities.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Screenshot extends BaseClass{
	/* Version        Date  			 Update   			comments
		1		    04/06/24       updated by Deepika       automatic screenshot added in the report  added
  */
	@BeforeStep
    public void Before_Scenario() {
    	System.out.println("This will run Before the Scenario");
    }
    @AfterStep
    public void After_Scenario(Scenario sc) {
    	if(sc.isFailed()) {
    		TakesScreenshot ts = (TakesScreenshot)driver;
    		byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
    		sc.attach(screenshot, "image/png", "Taking Screenshot Failed-----------" );
    	}else {
    		TakesScreenshot ts=(TakesScreenshot)driver;
    		byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
    		sc.attach(screenshot, "image/png", " Screenshot attached---------------" );

    	}
    	
    }
}
