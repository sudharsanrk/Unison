//version 1.0: Developed by <sudharsan> on 30/05/24
package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class Careerspage extends BaseClass {
public static WebElement careers1;
	
	public static void open()
	{
		driver.get("https://unisonconsulting.com.sg");
	}
	
	public static void careers()
	
	{try{
		WebElement careers=driver.findElement(By.xpath("//span[text()='Careers']"));
		careers.click();
		careers1=careers;}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
		
	}
	public static void submit()
	{try{
		WebElement submit =driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
	
	public static void yourname()
	{try{
		WebElement yourname =driver.findElement(By.xpath("//input[@name='your-name']"));
		yourname.click();}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
	
	public static void youremail()
	{try{
		WebElement youremail=driver.findElement(By.xpath("//input[@name='your-email']"));
		youremail.click();}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
	
	public static void yourphone()
	{
		try{
		WebElement yourphone=driver.findElement(By.xpath("//input[@name='your-phone']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
			
	}
	
	public static void carrersform(String yourname,String youremail,String yourphone) throws InterruptedException
	{try{
	
		WebElement yourname1=driver.findElement(By.xpath("//input[@name='your-name']"));
		yourname1.sendKeys(yourname);
		WebElement youremail1=driver.findElement(By.xpath("//input[@name='your-email']"));
		youremail1.sendKeys(youremail);
		WebElement yourphone1=driver.findElement(By.xpath("//input[@name='your-phone']"));
		yourphone1.sendKeys(yourphone);
		
		WebElement residencystatus=driver.findElement(By.xpath("//select[@name='singapore-residency']"));
	Select	se=new Select(residencystatus);
	se.selectByVisibleText("Singapore Citizen");
	
		WebElement Noticeperiod = driver.findElement(By.xpath("//select[@name='notice-period']"));
		Select	se1=new Select(Noticeperiod);
		se1.selectByVisibleText("1 month");
		WebElement jobtype =driver.findElement(By.xpath("//select[@name='job-type']"));
		Select	se2=new Select(jobtype);
		se2.selectByIndex(1);
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
public static void close()
{
	//driver.close();
}
}

