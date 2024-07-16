//This is a Page file for test the Technology Consulting Dropdown of the Unison consulting website.
//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//				    |                      |
//Date : 03-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna
//
//Version- 1.1 Update : This is totally new Page file added to the existing project to test Risk Technology Consulting Dropdown of the Website.

package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.BaseClass;

public class TCDropdownPage extends BaseClass {
    
//  ------------------------Opening the Technology Consulting Dropdown-------------------
    
    public static void TCDropdown() {
        try {
            WebElement Drop = driver.findElement(By.xpath("//*[@id=\"menu-item-4196\"]/a/span[1]"));
            Drop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in TCDropdown: " + e.getMessage());
        }
    }
    
//  --------------------Professional Service section---------------------
    
    public static void DropdownProfessionalService() {
        try {
            TCDropdown();
            WebElement PSDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4364\"]/a/span[1]"));
            PSDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownProfessionalService: " + e.getMessage());
        }
    }
    
    public static void ProfessionalServicePageCheck() {
        try {
            WebElement PSPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));
            Assert.assertTrue("Professional Service page was not loaded", PSPage.isDisplayed());
            Thread.sleep(1000);
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in ProfessionalServicePageCheck: " + e.getMessage());
        }
    }
    
//  ------------------Custom Development Section -----------------------
    
    public static void DropdownCustomDevelopment() {
        try {
            TCDropdown();
            WebElement CDDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4363\"]/a/span[1]"));
            CDDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownCustomDevelopment: " + e.getMessage());
        }
    }
    
    public static void CustomDevelopmentPageCheck() {
        try {
            WebElement CDPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));
            Assert.assertTrue("Custom Development page was not loaded", CDPage.isDisplayed());
            Thread.sleep(1000);
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in CustomDevelopmentPageCheck: " + e.getMessage());
        }
    }
    
//  ----------------Big Data section --------------------------
    
    public static void DropdownBigData() {
        try {
            TCDropdown();
            WebElement BDDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4907\"]/a/span[1]"));
            BDDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownBigData: " + e.getMessage());
        }
    }
    
    public static void BigDataPageCheck() {
        try {
            WebElement BDPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));
            Assert.assertTrue("Big Data page was not loaded", BDPage.isDisplayed());
            Thread.sleep(1000);
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in BigDataPageCheck: " + e.getMessage());
        }
    }
    
//  --------------------Full Stack Section ------------------------
    
    public static void DropdownFullStack() {
        try {
            TCDropdown();
            WebElement FSDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4906\"]/a/span[1]"));
            FSDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownFullStack: " + e.getMessage());
        }
    }
    
    public static void FullStackPageCheck() {
        try {
            WebElement FSPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));
            Assert.assertTrue("Full Stack page was not loaded", FSPage.isDisplayed());
            Thread.sleep(1000);
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in FullStackPageCheck: " + e.getMessage());
        }
    }
    
//  -----------------------Data Warehousing Section ----------------------
    
    public static void DropdownDataWarehousing() {
        try {
            TCDropdown();
            WebElement WHDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4366\"]/a/span[1]"));
            WHDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownDataWarehousing: " + e.getMessage());
        }
    }
    
    public static void DataWarehousingPageCheck() {
        try {
            WebElement DWPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));
            Assert.assertTrue("Data Warehousing page was not loaded", DWPage.isDisplayed());
            Thread.sleep(1000);
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in DataWarehousingPageCheck: " + e.getMessage());
        }
    }
    
//  ------------------------BI & Analytics Section -------------------------
    
    public static void DropdownBIandAnalytics() {
        try {
            TCDropdown();
            WebElement BIADrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4365\"]/a/span[1]"));
            BIADrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownBIandAnalytics: " + e.getMessage());
        }
    }
    
    public static void BIandAnalyticsPageCheck() {
        try {
            WebElement BIAPage = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[1]/div[3]/div/div/div/div/div[2]/div/div/div/h1"));
            Assert.assertTrue("BI & Analytics page was not loaded", BIAPage.isDisplayed());
            Thread.sleep(1000);
            BaseClass.Home();
        } catch (Exception e) {
            System.out.println("Exception in BIandAnalyticsPageCheck: " + e.getMessage());
        }
    }
}
