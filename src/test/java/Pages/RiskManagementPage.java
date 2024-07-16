package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import Utilities.BaseClass;
import io.cucumber.java.Scenario;

public class RiskManagementPage extends BaseClass{
	 /*Version    Date  			 Update   										comments
		1		 29/05/24       Initial Version updated by SaiKrishna
		2		 30/05/24		New Version Updated by Deepika	     1. No need to initialize WebDriver , we can directly extends the BaseClass.
		2		 30/05/24		New Version Updated by Deepika	     2. I have added takescreenshot method before  and after clicking on the every Scenario.
 		Testing Push DEV - testing 2nd time
	  */
	
	
//  -----------------------This is Credit Risk Management ------------------------------
	
	public static void CreditRiskManagement() throws Exception {
	    try {
	    WebElement CRMButton = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[3]/button[1]"));
	    CRMButton.click();
	    Thread.sleep(500);
	    BaseClass.takeScreenshot("Clicking on the Credit Risk Management Image");
        WebElement CRMSection = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[1]/div/div[1]/article/div/a"));
        CRMSection.click();
        Thread.sleep(500);
	    } catch(ElementClickInterceptedException e) {
	    	System.out.println("Element Click has not Intercepted Exception");
	    }
    	BaseClass.takeScreenshot(" Credi2t Risk Management page");
    	

	}
	public static void CRMPageCheck() throws Exception{
        WebElement CRMPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));

        if (CRMPage.isDisplayed()) {
            System.out.println("Credit Risk Management page loaded successfully");
        } else {
            System.out.println("Credit Risk Management page was not loaded");
        }
       
        Thread.sleep(1000);
        BaseClass.Home();
	}
	
//  --------------------------- This is Market Risk Management --------------------------------------
	
	public static void MarketRiskManagement() throws Exception {
	   try {
	   	WebElement MRMButton = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[3]/button[1]"));
	    MRMButton.click();
	    Thread.sleep(500);
        BaseClass.takeScreenshot("Clicking on the Market Risk Management Image");
        WebElement MRMSection = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[1]/div/div[2]/article/div/a"));
        Thread.sleep(1000);        
        MRMSection.click(); 
        Thread.sleep(500);
	   }catch(ElementClickInterceptedException e) {
	    	System.out.println("Element Click has not Intercepted Exception");
	    }
        BaseClass.takeScreenshot(" Market Risk Management page");
	}
	public static void MRMPageCheck() throws Exception{
        WebElement MRMPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div"));

        if (MRMPage.isDisplayed()) {
            System.out.println("Market Risk Management page loaded successfully");
        } else {
            System.out.println("Market Risk Management was not loaded");
        }
       
        Thread.sleep(500);
        BaseClass.Home();
	}
	
//  ------------------This Liquidity Risk Management----------------------------------------------
	
	public static void LiquidityRiskManagement() throws Exception {
        try {
        WebElement LRMButton = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[3]/button[2]"));
        LRMButton.click();
        Thread.sleep(500);
    	BaseClass.takeScreenshot("Clicking on the Liquidity Risk Management Image");
        WebElement LRMSection = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[1]/div/div[3]/article/div/a"));
        LRMSection.click();
        Thread.sleep(500);
        }catch(ElementClickInterceptedException e) {
	    	System.out.println("Element Click has not Intercepted Exception");
	    }
    	BaseClass.takeScreenshot(" Liquidity Risk Management page");

	}
	public static void LRMPageCheck() throws Exception{
        WebElement LRMPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));

        if (LRMPage.isDisplayed()) {
            System.out.println("Liquidity Risk management page loaded successfully");
        } else {
            System.out.println("Liquidity Risk Management page was not loaded");
        }
        Thread.sleep(500);
        BaseClass.Home();
	}
	
//	----------------------This is Enterprise Risk Management --------------------------------
	
	public static void EnterPriseRiskManagement() throws Exception {
        try {
        WebElement ERMButton = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[3]/button[2]"));
        ERMButton.click(); 
        Thread.sleep(500);
		BaseClass.takeScreenshot("Clicking on the Enterprise Risk Management Image");
        WebElement ERMSection = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[1]/div/div[4]/article/div/a"));
        ERMSection.click();
        Thread.sleep(500);
        }catch(ElementClickInterceptedException e) {
	    	System.out.println("Element Click has not Intercepted Exception");
	    }
		BaseClass.takeScreenshot(" Enterprise Risk Management page");

		
	}
	public static void ERMPageCheck() throws Exception{
        WebElement ERMPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));

        if (ERMPage.isDisplayed()) {
            System.out.println("Enterprise Risk management page loaded successfully");
        } else {
            System.out.println("Enterprise Risk Management page was not loaded");
        }
        Thread.sleep(500);
        BaseClass.Home();
	}
	
//	-------------------------This is Regulatory Risk management -------------------------
	
	public static void RegulatoryRiskManagement() throws Exception {
        try {
        WebElement RRMButton = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[3]/button[3]"));
        RRMButton.click();
        Thread.sleep(500);
    	BaseClass.takeScreenshot("Clicking on the Regulatory Risk Management Image");
        WebElement RRMSection = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[1]/div/div[5]/article/div/a"));
        RRMSection.click();
        Thread.sleep(500);
        }catch(ElementClickInterceptedException e) {
	    	System.out.println("Element Click has not Intercepted Exception");
	    }
    	BaseClass.takeScreenshot(" Regulatory Risk Management page");

	}
	public static void RRMPageCheck() throws Exception{
        WebElement RRMPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));

        if (RRMPage.isDisplayed()) {
            System.out.println("Regulatory Risk management page loaded successfully");
        } else {
            System.out.println("Regulatory Risk Management page was not loaded");
        }
        Thread.sleep(500);
        BaseClass.Home();
		
	}
	
//  ----------------------------This is Statistical Behavioral Modelling ------------------------------------
	
	public static void StatisticalBehavioralManagement() throws Exception {
        try {
        WebElement SBMButton = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[3]/button[3]"));
        SBMButton.click();
        Thread.sleep(500);
    	BaseClass.takeScreenshot("Clicking on the Statistical Behavioral Modelling Image");
        WebElement SBMSection = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/div[1]/div/div[6]/article/div/a"));
        SBMSection.click();
        Thread.sleep(500);
        }catch(ElementClickInterceptedException e) {
	    	System.out.println("Element Click has not Intercepted Exception");
	    }
    	BaseClass.takeScreenshot(" Statistical Behavioral Modelling page");

	}
	public static void SBMPageCheck() throws Exception{
        WebElement SBMPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div/div/div/div/h1"));

        if (SBMPage.isDisplayed()) {
            System.out.println("Statistical Behavioral Modelling page loaded successfully");
        } else {
            System.out.println("Statistical Behavioral Modelling page was not loaded");
        }
        Thread.sleep(500);
        BaseClass.Home();
       
    }
		
	}

