package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.BaseClass;

public class KnowUsPage {
	
static WebDriver driver = BaseClass.driver;
	
	public static void Knownus_dropdown_open() throws Exception {
		try {
			 WebElement knowus = driver.findElement(By.xpath("//*[@id=\"menu-item-4193\"]/a/span[1]"));
	    	    Thread.sleep(500);
	    	    driver.get("https://unisonconsulting.com.sg");
		} catch (Exception e) {
			System.out.println("Knownus_dropdown_open"+e.getMessage());
		}
	   
	    	    }
	public static void AboutUs() throws Exception {
		try { WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"menu-item-4828\"]/a/span[1]"));
	      aboutus.click();
		    Thread.sleep(500);
		    // below the line of code is updated 
	    WebElement Aboutuspage= driver.findElement(By.xpath("//h1[text()='About Us']"));
		   System.out.println(Aboutuspage.isDisplayed());
		   System.out.println("user is navigate to knowus page");
			
		} catch (Exception e) {
			System.out.println("AboutUs"+e.getMessage());
		}
	   
		
	}
	public static void WhyChooseUs() throws Exception {
		try { WebElement whychooseus = driver.findElement(By.xpath("//*[@id=\"menu-item-4766\"]/a/span[1]"));
	    whychooseus.click();
	    Thread.sleep(500);
	    // below the line of code is updated  
	 WebElement  whychoosepage= driver.findElement(By.xpath("//h1[text()='Why Choose']"));
	 System.out.println(whychoosepage.isDisplayed());
	 System.out.println("user is navigate to why choose us page");
			
		} catch (Exception e) {
			System.out.println("WhyChooseUs"+e.getMessage());
		}
	   
	    
	    
	}
	public static void MissionAndVision() throws Exception {
		try {
			 WebElement MV = driver.findElement(By.xpath("//*[@id=\"menu-item-4427\"]/a/span[1]"));
			    MV.click();
			    Thread.sleep(500);
			    // below the line of code is updated 
			WebElement  missionanddvisionpage=  driver.findElement(By.xpath("//h1[text()='Mission & Vision']"));
			System.out.println(missionanddvisionpage.isDisplayed());
			System.out.println("usder is navigate to mission and vision");
		} catch (Exception e) {
			System.out.println("MissionAndVision"+e.getMessage());
			}
	   
	    
	    
	}
	public static void OurVision() throws Exception {
		try { WebElement MVB = driver.findElement(By.xpath("//*[@id=\"our-tabs\"]/div[1]/div/button[2]/span"));
	    MVB.click();
	    Thread.sleep(500);
			
		} catch (Exception e) {
		System.out.println("OurVision"+e.getMessage());
		}
	   
	}
	public static void OurTeam() throws Exception {
		try {
			  WebElement OT = driver.findElement(By.xpath("//*[@id=\"menu-item-4446\"]/a/span[1]"));
			    OT.click();
			    Thread.sleep(500);
			    // below the line of code is updated 
			 WebElement ourteampage  = driver.findElement(By.xpath("//h1[text()='Our Team']"));
			 System.out.println(ourteampage.isDisplayed());
			 System.out.println("user is navigate to our team page");
		} catch (Exception e) {
			System.out.println("OurTeam"+e.getMessage());
		}
	  
	 
	  
	}
	public static void CoreValues () throws Exception {
		try {
			  WebElement CV = driver.findElement(By.xpath("//*[@id=\"menu-item-4812\"]/a/span[1]"));
			    CV.click();	
			    Thread.sleep(500);
			    // below the line of code is updated 
			  WebElement corevaluepage =  driver.findElement(By.xpath("//h1[text()='Our Core Values']"));
			  System.out.println(corevaluepage.isDisplayed());
			  System.out.println("user is navigate to core value page");
		} catch (Exception e) {
			System.out.println("CoreValues "+e.getMessage());
		}
	  
	}
	public static void OurClients() throws Exception {
		try {
			 WebElement OC = driver.findElement(By.xpath("//*[@id=\"menu-item-4462\"]/a/span[1]"));
			    OC.click();	
			    Thread.sleep(500);
			    // below the line of code is updated 
			WebElement ourclientpage   = driver.findElement(By.xpath("//h1[text()='Our Clients']"));
			System.out.println(ourclientpage.isDisplayed());
			System.out.println("user is navigate to our clients page");
			
		} catch (Exception e) {
			System.out.println("OurClients"+e.getMessage());
		}
	   
	}
	public static void OurPartners() throws InterruptedException {
		try {
			 WebElement OP = driver.findElement(By.xpath("//*[@id=\"menu-item-4566\"]/a/span[1]"));
			    OP.click();
			    Thread.sleep(500);
			    // below the line of code is updated 
			WebElement ourpartnerpage=    driver.findElement(By.xpath("//h1[text()='Unison Technology Partners']"));
			System.out.println(ourpartnerpage.isDisplayed());
			System.out.println("user is navigate to our partner page");
			
		} catch (Exception e) {
			System.out.println("OurPartners"+e.getMessage());
		}
	   
	}
	public static void Awards() {
		try {
			  WebElement AW = driver.findElement(By.xpath("//*[@id=\"menu-item-4924\"]/a/span[1]"));
			    AW.click();
			    BaseClass.Home();
			    // below the line of code is updated 
			  WebElement awardspage=  driver.findElement(By.xpath("//h1[text()='Awards']"));
			  System.out.println(awardspage.isDisplayed());
			  System.out.println("user is anvigate to awards page");
			  
		} catch (Exception e) {
			System.out.println("Awards"+e.getMessage());
		}
	  
	}
	
	
	
	
}
