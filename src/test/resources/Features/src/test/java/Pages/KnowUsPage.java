package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.BaseClass;

public class KnowUsPage {
	
static WebDriver driver = BaseClass.driver;
	
	public static void Knownus_dropdown_open() throws Exception {
	    WebElement knowus = driver.findElement(By.xpath("//*[@id=\"menu-item-4193\"]/a/span[1]"));
	    	    Thread.sleep(500);
	    	    driver.get("https://unisonconsulting.com.sg");
	    	    }
	public static void AboutUs() throws Exception {
	    WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"menu-item-4828\"]/a/span[1]"));
	      aboutus.click();
		    Thread.sleep(500);
		    // below the line of code is updated 
	    WebElement Aboutuspage= driver.findElement(By.xpath("//h1[text()='About Us']"));
		   System.out.println(Aboutuspage.isDisplayed());
		   System.out.println("user is navigate to knowus page");
		
	}
	public static void WhyChooseUs() throws Exception {
	    WebElement whychooseus = driver.findElement(By.xpath("//*[@id=\"menu-item-4766\"]/a/span[1]"));
	    whychooseus.click();
	    Thread.sleep(500);
	    // below the line of code is updated  
	 WebElement  whychoosepage= driver.findElement(By.xpath("//h1[text()='Why Choose']"));
	 System.out.println(whychoosepage.isDisplayed());
	 System.out.println("user is navigate to why choose us page");
	    
	    
	}
	public static void MissionAndVision() throws Exception {
	    WebElement MV = driver.findElement(By.xpath("//*[@id=\"menu-item-4427\"]/a/span[1]"));
	    MV.click();
	    Thread.sleep(500);
	    // below the line of code is updated 
	WebElement  missionanddvisionpage=  driver.findElement(By.xpath("//h1[text()='Mission & Vision']"));
	System.out.println(missionanddvisionpage.isDisplayed());
	System.out.println("usder is navigate to mission and vision");
	    
	    
	}
	public static void OurVision() throws Exception {
	    WebElement MVB = driver.findElement(By.xpath("//*[@id=\"our-tabs\"]/div[1]/div/button[2]/span"));
	    MVB.click();
	    Thread.sleep(500);
	}
	public static void OurTeam() throws Exception {
	    WebElement OT = driver.findElement(By.xpath("//*[@id=\"menu-item-4446\"]/a/span[1]"));
	    OT.click();
	    Thread.sleep(500);
	    // below the line of code is updated 
	 WebElement ourteampage  = driver.findElement(By.xpath("//h1[text()='Our Team']"));
	 System.out.println(ourteampage.isDisplayed());
	 System.out.println("user is navigate to our team page");
	 
	  
	}
	public static void CoreValues () throws Exception {
	    WebElement CV = driver.findElement(By.xpath("//*[@id=\"menu-item-4812\"]/a/span[1]"));
	    CV.click();	
	    Thread.sleep(500);
	    // below the line of code is updated 
	  WebElement corevaluepage =  driver.findElement(By.xpath("//h1[text()='Our Core Values']"));
	  System.out.println(corevaluepage.isDisplayed());
	  System.out.println("user is navigate to core value page");
	}
	public static void OurClients() throws Exception {
	    WebElement OC = driver.findElement(By.xpath("//*[@id=\"menu-item-4462\"]/a/span[1]"));
	    OC.click();	
	    Thread.sleep(500);
	    // below the line of code is updated 
	WebElement ourclientpage   = driver.findElement(By.xpath("//h1[text()='Our Clients']"));
	System.out.println(ourclientpage.isDisplayed());
	System.out.println("user is navigate to our clients page");
	
	}
	public static void OurPartners() throws InterruptedException {
	    WebElement OP = driver.findElement(By.xpath("//*[@id=\"menu-item-4566\"]/a/span[1]"));
	    OP.click();
	    Thread.sleep(500);
	    // below the line of code is updated 
	WebElement ourpartnerpage=    driver.findElement(By.xpath("//h1[text()='Unison Technology Partners']"));
	System.out.println(ourpartnerpage.isDisplayed());
	System.out.println("user is navigate to our partner page");
	}
	public static void Awards() {
	    WebElement AW = driver.findElement(By.xpath("//*[@id=\"menu-item-4924\"]/a/span[1]"));
	    AW.click();
	    BaseClass.Home();
	    // below the line of code is updated 
	  WebElement awardspage=  driver.findElement(By.xpath("//h1[text()='Awards']"));
	  System.out.println(awardspage.isDisplayed());
	  System.out.println("user is anvigate to awards page");
	  
	}
	
	
	
	
}
