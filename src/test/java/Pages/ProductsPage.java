package Pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;

import Utilities.BaseClass;

public class ProductsPage extends BaseClass {
	 /* Version    Date  			 Update   			comments
		1		 03/06/24       updated by Deepika       Products drop down section added
	  */
	public void products_dropdown() throws IOException
	{
		
		WebElement PDB =driver.findElement(By.xpath("//*[@id=\"menu-item-4195\"]/a/span[2]"));
		PDB.click();
		PDB.isDisplayed();
			
		takeScreenshot("Products dropdown menu");
		
	}
	
	public void Risk_insights_button() {
		try {
		WebElement RIB = driver.findElement(By.xpath("//*[@id=\"menu-item-4535\"]/a"));
		RIB.click();
		}catch(ElementClickInterceptedException e) {
			System.out.println("Element has not been click interacted");
		}
	}
	public void Risk_insights_page() throws IOException {
		try {
			String expectedUrl="https://unisonconsulting.com.sg/risk-insight/";
			String actualUrl = driver.getCurrentUrl();
			assertEquals(expectedUrl, actualUrl);
		}catch(ElementNotInteractableException e) {
			System.out.println("Element has not  interacted exception");
		}
		takeScreenshot("Risk Insights page");
		BaseClass.Home();
	}
	public void Risk_Analytics_button() {
		try{WebElement RAB = driver.findElement(By.xpath("//*[@id=\"menu-item-4546\"]/a"));
		RAB.click();
		}catch(ElementClickInterceptedException e) {
			System.out.println("Element has not been click  interacted");

		}
	}
	public void Risk_Analytics_page() throws IOException {
		try {
			String expectedUrl="https://unisonconsulting.com.sg/risk-analytics/";
			String actualUrl = driver.getCurrentUrl();
			assertEquals(expectedUrl, actualUrl);
		}catch(ElementNotInteractableException e) {
			System.out.println("Element has not  interacted exception");
		}
		takeScreenshot("Risk Analytics page");
		BaseClass.Home();
	}
	public void Data_Quality_button() {
		try{
		WebElement DQB = driver.findElement(By.xpath("//*[@id=\"menu-item-4966\"]/a"));
		DQB.click();
		}catch(ElementClickInterceptedException e) {
			System.out.println("Element has not been click interacted");
		}
		
	}
	public void Data_Quality_page() throws IOException {
		try {
			String expectedUrl="https://unisonconsulting.com.sg/data-quality/";
			String actualUrl = driver.getCurrentUrl();
			assertEquals(expectedUrl, actualUrl);
		}catch(ElementNotInteractableException e) {
			System.out.println("Element has not  interacted exception");
		}
		takeScreenshot("Data Quality Page");
		BaseClass.Home();
	}
	public void Data_Migration_button() {
		try {
		WebElement DMB = driver.findElement(By.xpath("//*[@id=\"menu-item-4965\"]/a"));
		DMB.click();
		}catch(ElementClickInterceptedException e) {
			System.out.println("Element has not been click interacted");

		}
	}
	public void Data_Migration_page() throws IOException {
		try {
			String expectedUrl="https://unisonconsulting.com.sg/data-migration/";
			String actualUrl = driver.getCurrentUrl();
			assertEquals(expectedUrl, actualUrl);
		}catch(ElementNotInteractableException e) {
			System.out.println("Element has not  interacted exception");
		}
		takeScreenshot("Data Migration page");
		BaseClass.Home();
	}
	public void Data_Reconciliation_button() {
		try {
		WebElement DRB = driver.findElement(By.xpath("//*[@id=\"menu-item-4964\"]/a"));
		DRB.click();
	}catch(ElementClickInterceptedException e) {
		System.out.println("Element has not been click interacted");

	}
	}
	public void Data_Reconciliation_page() throws IOException {
		try {
			String expectedUrl="https://unisonconsulting.com.sg/data-reconciliation/";
			String actualUrl = driver.getCurrentUrl();
			assertEquals(expectedUrl, actualUrl);
		}catch(ElementNotInteractableException e) {
			System.out.println("Element has not  interacted exception");
		}
		takeScreenshot("Data Reconciliation page");
		BaseClass.Home();
	}
}
