//Version history:
//	
//	V.1.0:Intital baseclass updated by< sai krishna>
//    V.1.1 Added Edge driver, Safari Driver, Firefox driver by < Venkat>

package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class BaseClass {

    public static WebDriver driver;
	
    public static void setUpChrome() {    	
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://unisonconsulting.com.sg");    	
    }
    public static void setupEdge()
    {
    	driver=new EdgeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://unisonconsulting.com.sg");
    }
    public static void setupFirefox()
    {
    	driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://unisonconsulting.com.sg");
    }
    public static void setupSafari()
    {
    	driver= new SafariDriver();
    	driver.manage().window().maximize();
    	driver.get("https://unisonconsulting.com.sg");
    	
    }
    
    public static void Home() {
		   WebElement Home = driver.findElement(By.xpath("//*[@id=\"page-header\"]/div[1]/div/div[1]/div/a/img"));
		    Home.click();
    }
    public static void We_are_unison() {
        String ReadMoreUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://unisonconsulting.com.sg/we-are/", ReadMoreUrl);
    }
    

    public static void takeScreenshot(String methodName) throws IOException{
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshots/" + methodName + ".png"));
//        
//        
//        
//        
//        
//        
//        
//        
    	
    }
    

}
