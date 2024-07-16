//This is a Page file for test the careers section of the Unison consulting website.//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by <sudharsan>
//				    |                      |
//Date : 02-05-2024 | New Version    : 1.1 |  Updated by <sudharsan>
package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class Careerspage extends BaseClass {
public static WebElement careers1;
	
	public static void open() throws InterruptedException
	{
		driver.get("https://unisonconsulting.com.sg");
		Thread.sleep(6000);
	}
	
	public static void careers() throws InterruptedException
	
	{try{
		WebElement careers=driver.findElement(By.xpath("//span[text()='Careers']"));
		careers.click();
		Thread.sleep(6000);
		careers1=careers;}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
		
	}
	public static void submit() throws InterruptedException
	{try{
		WebElement submit =driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
		Thread.sleep(6000);}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
	
	public static void yourname() throws InterruptedException
	{try{
		WebElement yourname =driver.findElement(By.xpath("//input[@name='your-name']"));
		yourname.click();
		Thread.sleep(6000);}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
	
	public static void youremail() throws InterruptedException
	{try{
		WebElement youremail=driver.findElement(By.xpath("//input[@name='your-email']"));
		youremail.click();
		Thread.sleep(3000);}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
	
	public static void yourphone() throws InterruptedException
	{
		try{
		WebElement yourphone=driver.findElement(By.xpath("//input[@name='your-phone']"));
		Thread.sleep(3000);
		}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
			
	}
	
	public static void carrersform(String yourname,String youremail,String yourphone) throws InterruptedException
	{try{
	
		WebElement yourname1=driver.findElement(By.xpath("//input[@name='your-name']"));
		yourname1.sendKeys(yourname);
		Thread.sleep(3000);
		WebElement youremail1=driver.findElement(By.xpath("//input[@name='your-email']"));
		youremail1.sendKeys(youremail);
		Thread.sleep(3000);
		WebElement yourphone1=driver.findElement(By.xpath("//input[@name='your-phone']"));
		yourphone1.sendKeys(yourphone);
		Thread.sleep(3000);
		
		WebElement residencystatus=driver.findElement(By.xpath("//select[@name='singapore-residency']"));
	Select	se=new Select(residencystatus);
	se.selectByVisibleText("Singapore Citizen");
	Thread.sleep(3000);
	
		WebElement Noticeperiod = driver.findElement(By.xpath("//select[@name='notice-period']"));
		Select	se1=new Select(Noticeperiod);
		se1.selectByVisibleText("1 month");
		Thread.sleep(3000);
		WebElement jobtype =driver.findElement(By.xpath("//select[@name='job-type']"));
		Select	se2=new Select(jobtype);
		se2.selectByIndex(1);
		Thread.sleep(3000);
		WebElement Addtional=driver.findElement(By.xpath("//select[@name='teche']"));
		Thread.sleep(4000);
		Select	se3=new Select(Addtional);
		se3.selectByVisibleText("Business Analyst");
		Thread.sleep(4000);
		
	}
	catch (NoSuchElementException e) {
		System.out.println(e);
	}
	
			
	}
public static void careersverify() throws InterruptedException
	
	{
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//span[text()='Careers']")).isDisplayed());
	}
public static void close() throws InterruptedException
{
	Thread.sleep(6000);
	FooterPage.Logo();
	Thread.sleep(6000);
}
}

