//This is a Page file for test the Footer section of the Unison consulting website.
//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//				    |                      |
//Date : 02-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna
//
//Version- 1.1 Update : This is totally new Page file added to the existing project to test the footer section of the website.


package Pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.BaseClass;

public class FooterPage {

    static WebDriver driver = BaseClass.driver;

//  ----------------------------Risk Management section ------------------------------

    public static void FooterCreditRiskManagement() {
        try {
            WebElement CRM = driver.findElement(By.xpath("//*[@id=\"menu-item-4372\"]/a"));
            CRM.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterCreditRiskManagement: " + e.getMessage());
        }
    }

    public static void FooterMarketRiskManagement() {
        try {
            WebElement MRM = driver.findElement(By.xpath("//*[@id=\"menu-item-4371\"]/a"));
            MRM.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterMarketRiskManagement: " + e.getMessage());
        }
    }

    public static void FooterLiquidityRiskManagement() {
        try {
            WebElement LRM = driver.findElement(By.xpath("//*[@id=\"menu-item-4370\"]/a"));
            LRM.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterLiquidityRiskManagement: " + e.getMessage());
        }
    }

    public static void FooterEnterpriseRiskManagement() {
        try {
            WebElement ERM = driver.findElement(By.xpath("//*[@id=\"menu-item-4369\"]/a"));
            ERM.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterEnterpriseRiskManagement: " + e.getMessage());
        }
    }

    public static void FooterRegulatoryRiskManagement() {
        try {
            WebElement RRM = driver.findElement(By.xpath("//*[@id=\"menu-item-4368\"]/a"));
            RRM.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterRegulatoryRiskManagement: " + e.getMessage());
        }
    }

    public static void FooterStatisticalBehaviouralModelling() {
        try {
            WebElement SBM = driver.findElement(By.xpath("//*[@id=\"menu-item-4367\"]/a"));
            SBM.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterStatisticalBehaviouralModelling: " + e.getMessage());
        }
    }

//  ------------------------------ Our Product section ---------------------------------

                                    //Risk Insights

    public static void FooterRiskInsights() {
        try {
            WebElement RI = driver.findElement(By.xpath("//*[@id=\"menu-item-4702\"]/a"));
            RI.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterRiskInsights: " + e.getMessage());
        }
    }

    public static void FooterRiskInsightsPageCheck() {
        try {
            WebElement RIPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));

            if (RIPage.isDisplayed()) {
                System.out.println("Risk Insights page loaded successfully");
            } else {
                System.out.println("Risk Insights page was not loaded");
            }
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in FooterRiskInsightsPageCheck: " + e.getMessage());
        }
    }

                                    //Risk Analytics

    public static void FooterRiskAnalytics() {
        try {
            WebElement RA = driver.findElement(By.xpath("//*[@id=\"menu-item-4701\"]/a"));
            RA.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterRiskAnalytics: " + e.getMessage());
        }
    }

    public static void FooterRiskAnalyticsPageCheck() {
        try {
            WebElement RAPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));

            if (RAPage.isDisplayed()) {
                System.out.println("Risk Analytics page loaded successfully");
            } else {
                System.out.println("Risk Analytics page was not loaded");
            }
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in FooterRiskAnalyticsPageCheck: " + e.getMessage());
        }
    }

                                    //Data Quality

    public static void FooterDataQuality() {
        try {
            WebElement DQ = driver.findElement(By.xpath("//*[@id=\"menu-item-4969\"]/a"));
            DQ.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterDataQuality: " + e.getMessage());
        }
    }

    public static void FooterDataQualityPageCheck() {
        try {
            WebElement DQPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div/div/div/div/div/div[1]/div/div[1]/div/h1"));

            if (DQPage.isDisplayed()) {
                System.out.println("Data Quality page loaded successfully");
            } else {
                System.out.println("Data Quality page was not loaded");
            }
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in FooterDataQualityPageCheck: " + e.getMessage());
        }
    }

                                    //Data Migration

    public static void FooterDataMigration() {
        try {
            WebElement DM = driver.findElement(By.xpath("//*[@id=\"menu-item-4968\"]/a"));
            DM.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterDataMigration: " + e.getMessage());
        }
    }

    public static void FooterDataMigrationPageCheck() {
        try {
            WebElement DMPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div/div/div/div/div/div[1]/div/div[1]/div/h1"));

            if (DMPage.isDisplayed()) {
                System.out.println("Data Migration page loaded successfully");
            } else {
                System.out.println("Data Migration page was not loaded");
            }
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in FooterDataMigrationPageCheck: " + e.getMessage());
        }
    }

                                    //Data Reconciliation

    public static void FooterDataReconciliation() {
        try {
            WebElement DR = driver.findElement(By.xpath("//*[@id=\"menu-item-4967\"]/a"));
            DR.click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in FooterDataReconciliation: " + e.getMessage());
        }
    }

    public static void FooterDataReconciliationPageCheck() {
        try {
            WebElement DRPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div/div/div/div/div/div[1]/div/div[1]/div/h1"));

            if (DRPage.isDisplayed()) {
                System.out.println("Data Reconciliation page loaded successfully");
            } else {
                System.out.println("Data Reconciliation page was not loaded");
            }
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in FooterDataReconciliationPageCheck: " + e.getMessage());
        }
    }

    /*---------------------------------------------------------------------------------
     * below the code is update by <sudharsan_version_1.1>
     */
    
    
    public static void DataWarehousing () throws InterruptedException
	{try{
	driver.get("https://unisonconsulting.com.sg");
	Thread.sleep(5000);
		WebElement dataware = driver.findElement(By.xpath("(//a[text()='Data Warehousing'])[2]"));
		dataware.click();
		Thread.sleep(3000);
		}
	catch (Exception e) {
		System.out.println(e);
	}
		
	}

	public static void DataWarehousingpage () throws InterruptedException
	{
		try{
		System.out.println(driver.findElement(By.xpath("//h1[text()='Data Warehousing']")).isDisplayed());
	
	
		 Thread.sleep(3000);
		}catch (Exception e) {
		System.out.println(e);
	}
	}
	
	
	public static void  BiAnalytics()
	{
		try{
		WebElement Bi = driver.findElement(By.xpath("(//a[text()='BI & Analytics'])[2]"));
		Bi.click();}catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void  BiAnalyticspage()
	{try{
		System.out.println(driver.findElement(By.xpath("//h1[text()='BI & Analytics']")).isDisplayed());

	 Thread.sleep(3000);
	}catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void  Professional()
	{try{
		WebElement professional = driver.findElement(By.xpath("(//a[text()='Professional Service'])[2]"));
		professional.click();}
	catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void  Professionalpage()
	{try{
	System.out.println(driver.findElement(By.xpath("//h1[text()='Professional Services']")).isDisplayed());
	
	 Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void  Customdevlopment()
	{try{
	WebElement	custom=driver.findElement(By.xpath("(//a[text()='Custom Development'])[2]"));
		custom.click();}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void  Customdevlopmentpage()
	{try{
	System.out.println(driver.findElement(By.xpath("//h1[text()='Custom Development']")).isDisplayed());

	 Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void  bigdata()
	{try{
	WebElement bigdata=driver.findElement(By.xpath("(//a[text()='Big Data'])[2]"));
			bigdata.click();}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void  bigdatapage()
	{try{
	System.out.println(driver.findElement(By.xpath("//h1[text()='Big Data']")).isDisplayed());
	
	 Thread.sleep(3000);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	
	public static void  fullstrack()
	{try{
		WebElement fullstrack=driver.findElement(By.xpath("(//a[text()='Full Stack'])[2]"));
		fullstrack.click();
		 Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void  fullstrackpage()
	{try{
	System.out.println(driver.findElement(By.xpath("//h1[text()='Full Stack']")).isDisplayed());
;
	 Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	
	public static void  Address() throws InterruptedException
	{try{
		WebElement Address=driver.findElement(By.xpath("//p[text()='Unison Consulting Pte Ltd']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Address);
	      Thread.sleep(3000);
		System.out.println(Address.isDisplayed());
		}
	catch (Exception e) {
		System.out.println(e);
	}
	}

	public static void  Addresstext() throws InterruptedException
	{try{
		WebElement Address=driver.findElement(By.xpath("//p[text()='Unison Consulting Pte Ltd']"));
		System.out.println(Address.isDisplayed());
		  Thread.sleep(3000);
		 }
	catch (Exception e) {
		System.out.println(e);
	}
	}
	
	public static void  Twitter()
	{try{
		WebElement twitter=driver.findElement(By.xpath("(//i[@class='fab fa-twitter'])[12]"));
		twitter.click();
		  Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
	}
		
	}
	
	public static void Twitterpage()
	{try{
		System.out.println("user is not navigate to twitter page");
		System.out.println("user is navigate to Linked in  page");
		 BaseClass.takeScreenshot(" Twitterpage");
		 Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
		//driver.close();
	}
	}
	
	public static void facebook()
	{try{
		WebElement facebook=driver.findElement(By.xpath("(//i[@class='fab fa-facebook-f'])[12]"));
		facebook.click();
		}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void facebookpage()
	{try{
		System.out.println("user is not navigate to facebook page");
		System.out.println("user is navigate to Linked in  page");
		BaseClass.takeScreenshot(" facebook");
		  Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
		
		//driver.close();
	}
	}
	public static void Instagram()
	{try{
		WebElement instatgram = driver.findElement(By.xpath("//i[@class='fab fa-instagram']"));
		instatgram.click();
		  Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void Instagrampage() throws InterruptedException
	{Thread.sleep(6000);
	ArrayList<String> tab = new ArrayList<String>( driver.getWindowHandles());
	driver.getWindowHandles();
	driver.switchTo().window((String) tab.get(1));
	String current = driver.getCurrentUrl();
	String expected="https://www.instagram.com/";
	
	assertEquals(expected, current);
	Thread.sleep(6000);
	driver.close();
	}
	public static void  LInkedin()
	{try{
	WebElement   linkedin=driver.findElement(By.xpath("(//i[@class='fab fa-linkedin-in'])[12]"));
	linkedin.click();
	  Thread.sleep(3000);}
	catch (Exception e) {
		System.out.println(e);
	}
	
	}
	public static void Linkedinpage()
	{try{
		System.out.println("user is not navigate to Linked in page");
		  Thread.sleep(3000);
		  BaseClass.takeScreenshot(" Linkedinpage");}
	catch (Exception e) {
		System.out.println(e);
		//driver.close();
	}
		
	}
	public static void Logo() {
		try{
        WebElement logo = driver.findElement(By.xpath("//*[@id='page-header']/div[1]/div/div[1]/div/a/img"));
       logo.click();
       Thread.sleep(3000);}
		catch (Exception e) {
			System.out.println(e);
		}
	}
    
}
